#include "entidades.h"

// si no usamos referencias "&" o punteros "*" nos dará error ya que nosotros debemos pasar el real, no un valor/copia
void HacerSonidos(Animal& animal)
{
    animal.HacerSonido();
}

void Caminar(Animal& animal)
{
    animal.Caminar();
}

int main()
{
    Gato gato;
    gato.edad = 10;

    // Perro* perro = new Perro();
    Perro perro;

    HacerSonidos(gato);
    HacerSonidos(perro);

    gato.HacerSonido();

    gato.Cumple();

    Caminar(gato);
    Caminar(perro);

    gato.Caminar();
    gato.HacerSonido();

    return 0;

}