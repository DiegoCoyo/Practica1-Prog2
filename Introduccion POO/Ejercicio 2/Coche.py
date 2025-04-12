# 3. Crea una clase Coche con marca, modelo y velocidad
# a) Agrega un método acelerar () que aumente la velocidad en 10
# b) Agrega un método frenar () que disminuya la velocidad en 5
# c) Crea dos coches, aceléralos, frénalos y muestra sus velocidades

class Coche:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = 0

    def acelerar(self):
        self.velocidad += 10

    def frenar(self):
        self.velocidad -= 5  

c1 = Coche("Chevrolet", "Camioneta 4x4")
c2 = Coche("Mercedes", "AMG")

c1.acelerar()
c1.frenar()

c2.acelerar()
c2.acelerar()  
c2.frenar()

print(f"{c1.marca} {c1.modelo} quedo con una Velocidad final de {c1.velocidad} km/h")
print(f"{c2.marca} {c2.modelo} quedo con una Velocidad final de {c2.velocidad} km/h")
