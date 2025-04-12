// 3. Crea una clase Coche con marca, modelo y velocidad
// a) Agrega un método acelerar () que aumente la velocidad en 10
// b) Agrega un método frenar () que disminuya la velocidad en 5
// c) Crea dos coches, aceléralos, frénalos y muestra sus velocidades

package Uno; 

public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0; 
    }

    
    public void acelerar() {
        velocidad += 10;
    }

    public void frenar() {
        velocidad -= 5; 
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public static void main(String[] args) {
     
        Coche c1 = new Coche("Chevrolet", "Camioneta 4x4");
        Coche c2 = new Coche("Mercedes", "AMG");

        c1.acelerar();
        c1.frenar();
        
        c2.acelerar();
        c2.acelerar();
        c2.frenar();

        System.out.println(c1.getMarca() + " " + c1.getModelo() + " quedo con una Velocidad final de " + c1.getVelocidad() + " km/h");
        System.out.println(c2.getMarca() + " " + c2.getModelo() + " quedo con una velocidad final de " + c2.getVelocidad() + " km/h");
    }
}