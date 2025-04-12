
package Dos;

public class Main {
    public static void main(String[] args) {
        Cocinero cocinero1 = new Cocinero("Juanito", 1200, 10, 15.5f);
        
        Mesero mesero1 = new Mesero("Franco", 800, 5, 10.0f, 120.5f);
        Mesero mesero2 = new Mesero("Nataly", 850, 8, 10.0f, 150.0f);
        
        Administrativo admin1 = new Administrativo("Carla", 1500.0f, "Gerente");
        Administrativo admin2 = new Administrativo("Sebas", 1300.0f, "Contador");

        System.out.println("Sueldos totales:");
        System.out.println(cocinero1.getNombre() + ": " + cocinero1.sueldoTotal());
        System.out.println(mesero1.getNombre() + ": " + mesero1.sueldoTotal());
        System.out.println(mesero2.getNombre() + ": " + mesero2.sueldoTotal());
        System.out.println(admin1.getNombre() + ": " + admin1.sueldoTotal());
        System.out.println(admin2.getNombre() + ": " + admin2.sueldoTotal());

        
        //Empleados con sueldo igual a los admins
        int x = 850; 
        float xAdmin = 1300.0f; 
        
        System.out.println("\nEmpleados con sueldo base igual a " + x + " o " + xAdmin + ":");
        
        if (cocinero1.sueldoTotal(x)) {
            System.out.println("Cocinero: " + cocinero1.getNombre());
        }
        if (mesero1.sueldoTotal(x)) {
            System.out.println("Mesero: " + mesero1.getNombre());
        }
        if (mesero2.sueldoTotal(x)) {
            System.out.println("Mesero: " + mesero2.getNombre());
        }
        if (admin1.sueldoTotal(xAdmin)) {
            System.out.println("Administrativo: " + admin1.getNombre());
        }
        if (admin2.sueldoTotal(xAdmin)) {
            System.out.println("Administrativo: " + admin2.getNombre());
        }
    }
}