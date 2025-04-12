// 5. Crea una clase Estudiante con nombre, nota_1, nota_2
// a) Agrega un método para calcular el promedio
// b) Agrega un método para verificar si aprobó (promedio >=6)
// c) Crea tres estudiantes, muestra sus promedios y si aprobaron

package Uno;

public class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;

    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }

    public String aprobo() {
        if (calcularPromedio() >= 6){
            return "APROBO";
        } else {
            return "REPROBO";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Sebas", 5.0, 7.0);
        Estudiante e2 = new Estudiante("Carla", 2.0, 8.5);
        Estudiante e3 = new Estudiante("Ramiro", 1.0, 6.0);

        System.out.println(e1.getNombre() + " con un promedio = " + e1.calcularPromedio() + " " + e1.aprobo());
        System.out.println(e2.getNombre() + " con un promedio = " + e2.calcularPromedio() + " " + e2.aprobo());
        System.out.println(e3.getNombre() + " con un promedio = " + e3.calcularPromedio() + " " + e3.aprobo());
    }
}
