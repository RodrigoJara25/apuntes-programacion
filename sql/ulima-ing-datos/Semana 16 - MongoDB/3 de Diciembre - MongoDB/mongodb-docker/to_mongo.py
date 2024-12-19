from database import Database   # Importamos el archivo database.py
from pymongo import MongoClient # Importmaos pymongo
from bson import ObjectId


client = MongoClient('mongodb://admin:adminpassword@localhost:27017/') # Se conecta al localhost en en el puerto indicado

def migrate_leagues():
    db = Database()
    # Seleccionar la base de datos (voy a acceder a la base de mongodb)
    db_mongo = client['fifa25']  # Reemplaza con el nombre de tu base datos
    query = (
        f"SELECT id, name FROM leagues;"
    )
    rs = db.execute(query)
    leagues = db_mongo['leagues']   # Seleccionar la coleccion donde vamos a insertar los docuemntos (es decir, las tablas que vamos a usar)
    for r in rs:  
        id = r['id']
        name = r['name']
        print(f"{id}, {name}")
        # insert a mongodb
        document = {
            'name': name    # no necesitamos generar el id en mongodb
        }
        leagues.insert_one(document)
    db.close()

def migrate_nations():
    db = Database()
    db_mongo = client['fifa25']
    query = (
        f"SELECT id, name FROM nations;"
    )
    rs_nations = db.execute(query)
    leagues = db_mongo['leagues']
    nations = db_mongo['nations']
    for r_nation in rs_nations:
        nation_id = r_nation['id']
        nation_name = r_nation['name']
        # buscar las ligas del pais
        query = (
            f"SELECT id, name FROM leagues WHERE nation_id={nation_id};"
        )
        rs_leagues = db.execute(query)
        leagues_ids = []
        for r_league in rs_leagues:
            league_name = r_league['name']
            league_document = leagues.find_one({"name": league_name})
            league_document_id = ObjectId(str(league_document['_id']))
            leagues_ids.append(league_document_id)
        document = {
            'name': nation_name
        }
        if leagues_ids != []:
            # el pais tiene ligas
            document['leagues_ids'] = leagues_ids
        # insert a mongodb
        nations.insert_one(document)
    db.close()

# migrate_leagues()
migrate_nations()

'''
db.nations.aggregate([
  {
    $lookup: {
      from: "leagues",
      localField: "leagues_ids",  // Campo en la colección "nations" que contiene los ids de las ligas
      foreignField: "_id",        // Campo en la colección "leagues" con el _id de cada liga
      as: "leagues"               // El resultado se almacena en el campo "leagues"
    }
  },
  {
    $project: {
      "_id": { "$toString": "$_id" },  // Convierte el ObjectId a un string
      "name": 1,                        // Incluye el campo "name"
      "leagues": {
        $map: {
          input: "$leagues",  // Usamos el campo "leagues" que contiene los documentos relacionados
          as: "league",       // Cada elemento de "leagues" se referencia como "league"
          in: {
            _id: { "$toString": "$$league._id" },  // Convierte el ObjectId a string
            name: "$$league.name"  // Solo incluir el nombre de la liga
          }
        }
      }
    }
  }
])
'''