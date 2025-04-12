# 1. Crea una clase Persona con nombre, edad y ciudad
#    a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
#    b) Crea tres personas y muestra su saludo
#    c) Agrega un método para verificar si es mayor de edad

class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad
    
    def mostrarSaludo(self):
        print(f"Hola soy {self.nombre} de {self.ciudad}")
    
    def mayorEdad(self):
        if self.edad >= 18:
            print(f"{self.nombre} es mayor de edad")
        else:
            print(f"{self.nombre} no es mayor de edad")
    
p1 = Persona("Armando", 16, "La Paz")
p2 = Persona("Sebas", 19, "Cochabamba")
p3 = Persona("Vale", 27, "Pando")
    
p1.mostrarSaludo()
p1.mayorEdad()

p2.mostrarSaludo()
p2.mayorEdad()

p3.mostrarSaludo()
p3.mayorEdad()

