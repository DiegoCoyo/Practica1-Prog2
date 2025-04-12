// 1. Crea una clase Persona con nombre, edad y ciudad
//    a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
//    b) Crea tres personas y muestra su saludo
//    c) Agrega un método para verificar si es mayor de edad

package Uno;

public class Persona {
    
    private String nombre;
    private int edad;
    private String ciudad;
    
    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }
    
    public void mostrarSaludo() {
        System.out.println("Hola soy " + nombre + " de " + ciudad);
    }
    
    public void mayorEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " no es mayor de edad.");
        }
    }
    
    public static void main(String[] args) {
        Persona p1 = new Persona("Armando", 16, "La Paz");
        Persona p2 = new Persona("Sebas", 19, "Cochabamaba");
        Persona p3 = new Persona("Vale", 27, "Pando");
        
        p1.mostrarSaludo();
        p1.mayorEdad();
        
        p2.mostrarSaludo();
        p2.mayorEdad();
        
        p3.mostrarSaludo();
        p3.mayorEdad();
    }
}


