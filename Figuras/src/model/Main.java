package model;

public class Main {
    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(5);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea()); // 25.0

        Figura circulo = new Circulo(3);
        System.out.println("Área del círculo: " + circulo.calcularArea());  // ~28.27
    }
}