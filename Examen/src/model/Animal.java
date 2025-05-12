package model;

public abstract class Animal {
    //Atributos
    private String nombre;
    private int edad;
    private double peso;

    //Metodo constructor
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    //Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Metodo Mostrar Informacion
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
    }

    //Metodo Clasificar Edad
    public void clasificarEdad() {
        if (edad > 3) {
            System.out.println("Es joven");
        } else {
            System.out.println("Es adulto");
        }
    }

    public abstract void hacerSonido();

}

