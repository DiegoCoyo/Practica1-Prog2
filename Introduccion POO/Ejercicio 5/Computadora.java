// 9. Realiza la abstracción de una Computadora
// a) Muestra los componentes principales de la computadora
// b) Muestra el estado de la computadora (encendido o apagado)
// c) Crea una instancia y simula encender y apagar la computadora

package Uno;

public class Computadora {
    private String marca;
    private String procesador;
    private int ram;
    private int almacenamiento;
    private boolean encendida;
    
    public Computadora(String marca, String procesador, int ram, int almacenamiento) {
        this.marca = marca;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.encendida = false; 
    }
    
    public void mostrarComponentes() {
        System.out.println("Componentes");
        System.out.println("Marca: " + marca);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Almacenamiento: " + almacenamiento+ "GB");
    }
    
    public void mostrarEstado() {
        if (encendida) {
            System.out.println("\nCompu: ENCENDIDA");
        } else {
            System.out.println("\nCompu: APAGADA");
        }
    }
    
    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("\nLa compu se esta encendiendo...");
        } else {
            System.out.println("\nLa compu ya esta encendida");
        }
    }
    
    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("\nLa compu se esta apagando...");
        } else {
            System.out.println("\nLa compu esta apagada");
        }
    }
    
    public static void main(String[] args) {
        Computadora compu = new Computadora("Asus", "Intel Core i7", 16, 1024);
        
        compu.mostrarComponentes();
        
        compu.mostrarEstado();
        
        compu.encender();
        compu.mostrarEstado();
        
        compu.apagar();
        compu.mostrarEstado();
        
        compu.apagar();
    }
}
