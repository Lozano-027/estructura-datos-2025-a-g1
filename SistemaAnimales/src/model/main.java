package model;


public class Main {
    public static void main(String[] args) {
        Animal perro;  // Nombre de variable corregido
        perro = new Perro();
        perro.setNombre("Firulais");  // Nombre corregido
        perro.setEdad(3);

        System.out.println("Perro:");  // Texto corregido
        perro.hacerSonido();  // Método corregido
        perro.moverse();     // Movimiento corregido

        Animal pez = new Pez();
        pez.setNombre("Nemo");

        System.out.println("\nPez:");
        pez.moverse(); // Nadando...
    }
}