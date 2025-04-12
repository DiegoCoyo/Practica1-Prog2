package cinco;

public class Aula {
    private String nombre;
    private int capacidad;
    private int pizarrones;
    
    public Aula(String nombre, int capacidad, int pizarrones) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.pizarrones = pizarrones;
    }
    
    public void mostrar() {
        System.out.println("Aula " + nombre + " / Capacidad: " + capacidad + " / Pizarrones: " + pizarrones);
    }
    
    public int cantidadMuebles() {
        return capacidad + pizarrones; 
    }
}