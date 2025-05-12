package model;

public class Conejo extends Animal{
    private double longitudOrejas;

    public Conejo(String nombre, int edad, double peso, double longitudOrejas){
        super(nombre, edad, peso);
        this.longitudOrejas=longitudOrejas;
    }

    public double getLongitudOrejas() {
        return longitudOrejas;
    }

    public void setLongitudOrejas(double longitudOrejas) {
        this.longitudOrejas = longitudOrejas;
    }
    @Override
    public void hacerSonido(){
        System.out.println("Dice: PPPPP");
    }

    public void saltar() {
        System.out.println("Esta saltando por el jardin");
    }
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Longitud de Orejas: "+longitudOrejas);
    }
}
