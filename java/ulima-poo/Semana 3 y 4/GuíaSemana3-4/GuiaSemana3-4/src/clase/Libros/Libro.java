/*
4. Caso de Negocio: Proyecto Gestión Venta de Libros.
La siguiente aplicación requiere crear una clase llamada Libro, con los siguientes atributos: 
código del libro, titulo, autor, precio unitario, y unidades vendidas.
●	Un constructor con parámetros (código, titulo, autor).
●	Métodos getters y setters.
●	Un método que genere aleatoriamente las unidades vendidas (valor entero 
        mayor que cero y menor a 60).
●	Un método que calcule y retorne el monto total de la venta por todos los libros.
●	Un método que retorne toda la información relacionada a la venta realizada, como 
        es su código, titulo, autor y el monto total a pagar.

 */
package clase.Libros;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Libro 
{
    //Atributos
    private int code;
    private String titulo;
    private String autor;
    private float precio;
    private int unidades_vendidas;
    
    //Métodos Constructores
    public Libro(int code, String titulo, String autor, float precio, int unidades_vendidas) {
        this.code = code;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.unidades_vendidas = unidades_vendidas;
    }
    
    //Métodos Getters and Setters

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades_vendidas() {
        return unidades_vendidas;
    }

    public void setUnidades_vendidas(int unidades_vendidas) {
        this.unidades_vendidas = unidades_vendidas;
    }
    
    public void GenerarRandom()
    {
        Random random = new Random();
        
        int UniVendidas = random.nextInt(59)+1;
    }
    
    
}
