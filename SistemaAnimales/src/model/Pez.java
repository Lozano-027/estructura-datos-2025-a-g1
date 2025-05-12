package model;

public class Pez extends Animal {
    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("No hace sonido");
    }

    @Override
    public void moverse() {
        System.out.println("Nada");
    }
}
