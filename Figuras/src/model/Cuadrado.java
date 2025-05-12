package model;

public class Cuadrado extends Figura {
    private double lado;  // Encapsulamiento

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {  // Polimorfismo
        return lado * lado;
    }
}