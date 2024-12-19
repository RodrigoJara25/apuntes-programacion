#include "filesystems.h"
#include "pregunta1.h"

int main()
{
    filesystem::OldHorseFS fs;
    Pregunta1(&fs);

    fs.ImprimirArchivos("/");

    return 0;
}