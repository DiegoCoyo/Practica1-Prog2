from multimethod import multimethod

class Cocinero:
    def __init__(self, nombre: str, sueldo_mes: int, horas_extra: int, sueldo_hora: float):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora
    
    @multimethod
    def sueldo_total(self) -> float:
        return self.sueldo_mes + (self.horas_extra * self.sueldo_hora)
    
    @multimethod
    def sueldo_total(self, detallado: bool) -> str:
        total = self.sueldo_total()
        if detallado:
            return f"Cocinero {self.nombre}: Total: {total:.2f}"
        return f"{total:.2f}"

class Mesero:
    def __init__(self, nombre: str, sueldo_mes: int, horas_extra: int, sueldo_hora: float, propina: float):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora
        self.propina = propina
    
    @multimethod
    def sueldo_total(self) -> float:
        return self.sueldo_mes + (self.horas_extra * self.sueldo_hora) + self.propina
    
    @multimethod
    def sueldo_total(self, detallado: bool) -> str:
        total = self.sueldo_total()
        if detallado:
            return f"Mesero {self.nombre}: Total: {total:.2f}"
        return f"{total:.2f}"

class Administrativo:
    def __init__(self, nombre: str, sueldo_mes: float, cargo: str):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.cargo = cargo
    
    @multimethod
    def sueldo_total(self) -> float:
        return self.sueldo_mes
    
    @multimethod
    def sueldo_total(self, detallado: bool) -> str:
        total = self.sueldo_total()
        if detallado:
            return f"Administrativo {self.nombre} ({self.cargo}): Sueldo Total: {total:.2f}"
        return f"{total:.2f}"

@multimethod
def mostrar_empleados_por_sueldo(cocineros: list[Cocinero], meseros: list[Mesero], admins: list[Administrativo], x: float):
    print(f"\nEmpleados con sueldo_mes igual a {x}:")
    for c in cocineros:
        if c.sueldo_mes == x:
            print(f"- {c.nombre} (Cocinero)")
    for m in meseros:
        if m.sueldo_mes == x:
            print(f"- {m.nombre} (Mesero)")
    for a in admins:
        if a.sueldo_mes == x:
            print(f"- {a.nombre} (Administrativo)")

@multimethod
def mostrar_empleados_por_sueldo(cocineros: list[Cocinero], x: float):
    print(f"\nCocineros con sueldo_mes igual a {x}:")
    for c in cocineros:
        if c.sueldo_mes == x:
            print(f"- {c.nombre}")

cocinero1 = Cocinero("Juanito", 1200, 10, 15.5)
mesero1 = Mesero("Franco", 800, 5, 10.0, 120.5)
mesero2 = Mesero("Nataly", 850, 8, 10.0, 150.0)
admin1 = Administrativo("Carla", 1500.0, "Gerente")
admin2 = Administrativo("Sebas", 1300.0, "Contador")

print("Sueldos totales:")
print(cocinero1.sueldo_total(True))
print(mesero1.sueldo_total(True))
print(mesero2.sueldo_total(True))
print(admin1.sueldo_total(True))
print(admin2.sueldo_total(True))

mostrar_empleados_por_sueldo([cocinero1], [mesero1, mesero2], [admin1, admin2], 1200.0)
