import sqlite3

def db_to_txt():
    # generate data
    conn = sqlite3.connect('app.db')
    cursor = conn.cursor()
    cursor.execute('''
        SELECT * FROM pokemons;
    ''')
    rpta = ''
    for row in cursor.fetchall():
        print(row)
        rpta += str(row[0]) + ',' + str(row[1]) + ',' + str(row[3]) + ',' + str(row[4])  + ',' + str(row[6]) + '\n'
        print(row)
    conn.close()
    # create txt
    with open("output.txt", "w") as file:
        text = db_a_txt().strip()
        print(text)
        file.write(text)
    
    
def read_txt():
    with open("output.txt") as file:
        for item in file:
            print(item.strip().split(','))
    

# read_txt()

def mas_pesado():
    listaPesos = []
    listaNombres = []
    with open("output.txt") as file:
        for item in file:
            row = item.strip().split(',')
            listaPesos.append(row[2])
            listaNombres.append(row[1])
            # print(row[2])
    maxPeso = max(listaPesos)
    for i in range(len(listaPesos)):
        if listaPesos[i] == maxPeso:
            print(listaPesos[i])
            print(listaNombres[i])
                
mas_pesado()
    

#El nombre del pokemon más pesado

def mas_livianos():
    listaPokemones = []
    with open("output.txt") as file:
        for item in file:
            row = item.strip().split(',')
            listaPokemones.append(row)
    listaPokemonesOrdenada = sorted(listaPokemones, key = lambda x:x[2])
    print(listaPokemonesOrdenada[:9+1])

mas_livianos()

#Los 10 pokemones más livianos

def cantGeneracion():
    

#Cantidad de pokemones por generacion
#La talla de pikachu
#Los pokemones que empiezen con la letra "P" de las generaciones 3 y 4

