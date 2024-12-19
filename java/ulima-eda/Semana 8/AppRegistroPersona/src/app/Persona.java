package app;

public class Persona {
    // Atributos
    protected int dni;
    protected String nombres;
    // Metodos
    // Constructor
    public Persona() {
        this.dni = 0;
        this.nombres = "";
    }

    public Persona(int dni, String nombres) {
        this.dni = dni;
        this.nombres = nombres;
    }
    // Getter and setter

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return nombres;
    }
}
