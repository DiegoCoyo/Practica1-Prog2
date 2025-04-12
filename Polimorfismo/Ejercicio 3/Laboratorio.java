
package cinco;

public class Laboratorio {
    private String nombre;
    private int capacidad;
    private int modulos;
    
    public Laboratorio(String nombre, int capacidad, int modulos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.modulos = modulos;
    }
    
    public void mostrar() {
        System.out.println("Laboratorio " + nombre + " / Capacidad: " + capacidad + " / Modulos: " + modulos);
    }
    
    public int cantidadMuebles() {
        return capacidad + (modulos * 2); 
    }
}
