package model;

public class Desarrollador extends Empleado {
    public Desarrollador(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBono() {  // Polimorfismo
        return getSalario() * 0.3;
    }
}