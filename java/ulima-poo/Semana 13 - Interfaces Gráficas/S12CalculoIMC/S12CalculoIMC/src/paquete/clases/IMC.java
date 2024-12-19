/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

/**
 *
 * @author Usuario
 */
public class IMC 
{
    //Atributos
    private float peso, altura, IMC;
    private String diagnostico;

    //Constructor
    public IMC(float peso, float altura) 
    {
        this.peso = peso;
        this.altura = altura;
    }
    
    //Getters and setters
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getIMC() {
        return IMC;
    }

    public void setIMC(float IMC) {
        this.IMC = IMC;
    }

    public String getDiag() {
        return diagnostico;
    }

    public void setDiag(String diag) {
        this.diagnostico = diag;
    }
    
    //Método
    public void CalcularIMC()
    {
        this.IMC = this.peso / (this.altura * this.altura);
        if (IMC < 16) 
        {
            this.diagnostico = "Criterio ingreso hospital";
        }
        else if (IMC>=16 && IMC<17) 
        {
            this.diagnostico = "infrapeso";
        }
        else if (IMC>=17 && IMC<18) 
        {
            this.diagnostico = "bajo peso";
        }
        else if (IMC>=18 && IMC<25) 
        {
            this.diagnostico = "peso normal (saludable)";
        }
        else if (IMC>=25 && IMC<30) 
        {
            this.diagnostico = "sobrepeso (obesidad de grado 1)";
        }
        else if (IMC>=30 && IMC<35) 
        {
            this.diagnostico = "sobrepeso crónico (obesidad de grado II)";
        }
        else if (IMC>=35 && IMC<40) 
        {
            this.diagnostico = "obesidad premórbida (obesidad de grado III)";
        }
        else if (IMC>40) 
        {
            this.diagnostico = "obesidad mórbida (obesidad de grado IV)";
        }
    }
}
