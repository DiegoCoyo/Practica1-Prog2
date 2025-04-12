
package Dos;

public class Administrativo {
    private String nombre;
    private float sueldoMes;
    private String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }

    public float sueldoTotal() {
        return sueldoMes;
    }

    public boolean sueldoTotal(float x) {
        return sueldoMes == x;
    }

    public String getNombre() {
        return nombre;
    }
}

