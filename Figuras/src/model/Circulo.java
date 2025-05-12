package model;

public class Circulo extends Figura {
    private double radio;  // Encapsulamiento

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {  // Polimorfismo
        return Math.PI * radio * radio;
    }
}