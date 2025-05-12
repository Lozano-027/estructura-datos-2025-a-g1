package model;

public abstract class Empleado {
    private String nombre;
    private double salario;  // Encapsulamiento

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public abstract double calcularBono();  //Metodo abstracto

    // Getter para salario (Encapsulamiento)
    public double getSalario() {
        return salario;
    }
}