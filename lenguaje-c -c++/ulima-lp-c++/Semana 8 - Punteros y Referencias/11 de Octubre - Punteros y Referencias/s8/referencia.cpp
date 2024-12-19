#include <iostream>


int main()
{
    int num = 10;
    int num2 = 20;

    int& ref_num = num;    //Declarando una referencia (etiqueta) que "referencia" a num
    const int& ref_num_segunda = num;   // Referencia constante

    ref_num = num2; // Ahora "num" va a tomar el valor de "num2" porque solo se puede "referenciar" a una variable

    std::cout << num << '\n';
    std::cout << ref_num << '\n';


    return 0;
}