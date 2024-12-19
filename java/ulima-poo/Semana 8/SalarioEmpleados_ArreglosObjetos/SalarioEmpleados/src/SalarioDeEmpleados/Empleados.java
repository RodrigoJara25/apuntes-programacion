/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalarioDeEmpleados;

/**
 *
 * @author Usuario
 */
public class Empleados 
{
    //Atributos
    private int code;
    private int horas_trabajadas;
    private float sueldoxhora;
    
    private float salario;
    private int horas_extra;
    
    //Constructor
    public Empleados(int code, int horas_trabajadas, float sueldoxhora) 
    {
        this.code = code;
        this.horas_trabajadas = horas_trabajadas;
        this.sueldoxhora = sueldoxhora;
    }
    
    //Getters and setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public float getSueldoxhora() {
        return sueldoxhora;
    }

    public void setSueldoxhora(int sueldoxhora) {
        this.sueldoxhora = sueldoxhora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getHoras_extra() {
        return horas_extra;
    }

    public void setHoras_extra(int horas_extra) {
        this.horas_extra = horas_extra;
    }
    
    //Métodos
    public void HorasExtra()
    {
        if (this.horas_trabajadas>40) 
        {
            this.horas_extra = this.horas_trabajadas - 40;
        }
        else
        {
            this.horas_extra = 0;
        }
    }
    
    public void Salario()
    {
        if (this.horas_trabajadas<=40) 
        {
            this.salario = this.horas_trabajadas * this.sueldoxhora;
        }
        else if (this.horas_trabajadas>=41 && this.horas_trabajadas<=45) 
        {
            this.salario = (this.horas_extra*this.sueldoxhora*2)+(40*this.sueldoxhora);
        }
        else
        {
            this.salario = (this.horas_extra*this.sueldoxhora*3)+(40*this.sueldoxhora);
        }
    }
    
    public String VerInfo()
    {
        String cad = "";
        
        cad = cad + "Code: "+this.code + "\nSalario: "+this.salario;
        
        return cad;
    }
    
    
    
    
    
    
}
