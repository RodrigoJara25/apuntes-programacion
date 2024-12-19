// Implementa el juego del ahorcado. El programa define una palabra de forma manual y permite al usuario adivinar letras hasta  
// completar la palabra o perder.
//     máximo 5 intentos
//     mostrar instrucciones al inicio
//     mostrar la palabra por adivinar usando un guión por cada letra
//     mostrar las letras ingresadas incorrectas
//     no restar intentos permitidos cuando la letra incorrecta ya se ingresó
//     mostrar el mensaje si ganó o perdió al terminar el juego
#include <iostream>

int main()
{
    std::string palabra = "ANIMAL";
    int max_intentos = 5;
    int cant_intentos = 0;
    char letra;
    std::string progreso(palabra.size(), '_'); // Progreso inicial del jugador

    std::cout << "Palabra: " << '\n';
    for (char c : palabra) {
        std::cout << "_ "; 
    }
    std::cout << '\n';

    while (cant_intentos < max_intentos) {
        std::cout << "Ingresar letra: " << '\n'; 
        std::cin >> letra;

        // Verificar si la letra está en la palabra
        bool letra_correcta = false;
        for (size_t i = 0; i < palabra.size(); i++) {
            if (palabra[i] == letra) {
                progreso[i] = letra; // Actualizar progreso
                letra_correcta = true;
            }
        }

        if (!letra_correcta) {
            cant_intentos++;
            std::cout << "Letra incorrecta. Intentos restantes: " << (max_intentos - cant_intentos) << '\n';
        }

        std::cout << "Palabra: " << progreso << '\n'; // Mostrar progreso

        // Comprobar si ha ganado
        if (progreso == palabra) {
            std::cout << "GANASTE EL JUEGO" << '\n';
            return 0; // Salir del programa
        }
    }

    std::cout << "PERDISTE EL JUEGO. La palabra era: " << palabra << '\n';

    return 0;
}
