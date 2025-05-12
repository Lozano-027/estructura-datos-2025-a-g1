package model;

public class Main {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Ana", 10000);
        System.out.println("Bono del gerente: " + gerente.calcularBono());

        Empleado dev = new Desarrollador("Luis", 7000);
        System.out.println("Bono del desarrollador: " + dev.calcularBono());
    }
}