/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NumRacional;
/**
 *
 * @author Usuario
 */
public class NroRacional 
{
    //Atributos
    private int numerador;
    private int denominador;
    
    //Método Constructor
    public NroRacional(int numerador, int denominador) 
    {
        if (denominador!=0) 
        {
            this.numerador = numerador;
            this.denominador = denominador;
            Simplificar();
        }
        else
        {
            this.numerador = 0;
            this.denominador = 1;
        }    
    }
    
    public NroRacional() 
    {
        this.numerador = 0;
        this.denominador = 1;
    }
    
    //Métodos privados (solo se usan en esta clase)
    private void Simplificar()
    {
        int mcd = MCD(this.numerador, this.denominador);
        this.numerador = this.numerador / mcd;
        this.denominador = this.denominador / mcd;
    }
    
    private int MCD(int numerador, int denominador)
    {
        //teorema de Uclides
        int m=1;
        while(denominador!=0)
        {
            m = denominador;
            denominador = numerador % denominador; //el residuo
            numerador = m;
        }
        return m;
    }
    
    //Métodos públicos
    public void suma(NroRacional ref)
    {
        this.numerador = this.numerador * ref.denominador + this.denominador * ref.numerador;
        this.denominador = this.denominador * ref.denominador;
        Simplificar();
    }
    
    public void suma(NroRacional ref1, NroRacional ref2)
    {
        this.numerador = ref1.numerador * ref2.denominador + ref1.denominador * ref2.numerador;
        this.denominador = ref1.denominador * ref2.denominador;
        Simplificar();
    }
    
    public void restar(NroRacional ref1, NroRacional ref2)
    {
        this.numerador = ref1.numerador * ref2.denominador - ref1.denominador * ref2.numerador;
        this.denominador = ref1.denominador * ref2.denominador;
        Simplificar();
    }
    
    public void multiplicar(NroRacional ref)
    {
        this.numerador = this.numerador * ref.numerador;
        this.denominador = this.denominador * ref.denominador;
        Simplificar();
    }
    
    public void multiplicar(NroRacional ref1, NroRacional ref2)
    {
        this.numerador = ref1.numerador * ref2.numerador;
        this.denominador = ref1.denominador * ref2.denominador;
        Simplificar();
    }
    
    public void dividir(NroRacional ref)
    {
        this.numerador = this.numerador * ref.denominador;
        this.denominador = this.denominador * ref.numerador;
    }
    
    public String VerInfo()
    {
        return this.numerador + "/" + this.denominador;
    }
    
    
    
}
