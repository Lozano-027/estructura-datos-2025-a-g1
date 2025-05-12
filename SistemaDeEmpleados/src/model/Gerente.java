package model;

public class Gerente extends Empleado {
    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBono() {  // Polimorfismo
        return getSalario() * 0.5;
    }
}