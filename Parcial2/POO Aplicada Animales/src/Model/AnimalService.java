package Model;

import java.util.ArrayList;
import java.util.List;
public class AnimalService {
    private List<Model.Animal> animales = new ArrayList<>();

    public void agregarAnimal(Model.Animal animal){
        animales.add(animal);
    }

    public void mostrarAcciones(){
        for (Model.Animal a : animales){
            System.out.println("Nombre: " + a.getNombre());
            a.comer();
            a.dormir();
            a.desplazarse();
            System.out.println();
        }
    }
}