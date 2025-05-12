package Model;

import Model.*;

public class Main {
    public static void main(String[] args){
        Model.AnimalService service = new Model.AnimalService();

        service.agregarAnimal(new Model.Perro("Firulais", 4, 12.5f, "Labrador"));
        service.agregarAnimal(new Model.Gato("Michi", 3, 4.2f, true));
        service.agregarAnimal(new Model.Burro("Tito", 10, 100.0f, "Gris"));
        service.agregarAnimal(new Model.Pez("Nemo", 1, 0.3f, "Agua Salada"));

        service.mostrarAcciones();
    }
}