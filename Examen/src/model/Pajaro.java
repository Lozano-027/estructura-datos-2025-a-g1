package model;

public class Pajaro extends Animal{
    private String tipoDeCanto;

    public Pajaro(String nombre, int edad, double peso, String tipoDeCanto) {
        super(nombre, edad, peso);
        this.tipoDeCanto = tipoDeCanto;
    }

    @Override
    public void hacerSonido(){
        System.out.println(getNombre()+"Dice: CLOKKK");
    }

    public void volar() {
        System.out.println(getNombre() + "Esta volando por las montañas");
    }
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de Canto: " + tipoDeCanto);
    }
}
