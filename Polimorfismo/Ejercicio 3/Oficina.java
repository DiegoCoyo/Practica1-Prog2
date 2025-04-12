
package cinco;

public class Oficina {
    private int modulos;
    
    public Oficina(int modulos) {
        this.modulos = modulos;
    }
    
    public void mostrar() {
        System.out.println("Oficina con " + modulos + " modulos");
    }
    
    public int cantidadMuebles() {
        return modulos * 3; 
    }
}
