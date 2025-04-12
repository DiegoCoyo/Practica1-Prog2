
package cinco;

public class Main {
    public static void main(String[] args) {

        Oficina oficina1 = new Oficina(4);
        Oficina oficina2 = new Oficina(6);
        
        Aula aula1 = new Aula("A101", 30, 2);
        Aula aula2 = new Aula("B202", 25, 1);
        
        Laboratorio lab1 = new Laboratorio("L301", 20, 5);
        
        System.out.println("Mostrando ambientes");
        oficina1.mostrar();
        oficina2.mostrar();
        aula1.mostrar();
        aula2.mostrar();
        lab1.mostrar();
        
        System.out.println("\nCantidad de muebles");
        System.out.println("Oficina 1: " + oficina1.cantidadMuebles() + " muebles");
        System.out.println("Oficina 2: " + oficina2.cantidadMuebles() + " muebles");
        System.out.println("Aula A101: " + aula1.cantidadMuebles() + " muebles");
        System.out.println("Aula B202: " + aula2.cantidadMuebles() + " muebles");
        System.out.println("Laboratorio L301: " + lab1.cantidadMuebles() + " muebles");
    }
}