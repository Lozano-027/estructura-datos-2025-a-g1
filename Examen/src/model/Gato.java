package model;

public class Gato extends Animal {
    private String colorPelaje;

    public Gato(String nombre, int edad, double peso, String colorPelaje) {
        super(nombre, edad, peso);
        this.colorPelaje = colorPelaje;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
    @Override
    public void hacerSonido(){
        System.out.println(getNombre()+"Dice: Miau, Miau");
    }

    public void ronronear(){
        System.out.println(getNombre()+"RRRR");
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Color Pelaje: "+ colorPelaje);
    }

}
