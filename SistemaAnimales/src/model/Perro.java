package model;

public class Perro extends Animal {


    public Perro(String nombre, int edad) {
        super(nombre, edad);
        }

    @Override
    public void hacerSonido() {
        System.out.println("¡Guau!");
    }

    @Override
    public void moverse() {
        System.out.println("Corriendo en 4 patas");
    }
}