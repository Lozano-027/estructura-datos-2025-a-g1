package model;

public class Perro extends Animal{
    //Atributo Adicional
    private String raza;
    //Metodo constructur
    public Perro(String nombre, int edad, double peso,String raza){
        super(nombre, edad, peso);
        this.raza=raza;
    }
//Getter y Setter
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    //Polimosfismo Metodo Hacer Sonido
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + "Dice: !Guau, guau");
    }

    public void jugar(){
        System.out.println(getNombre()+"Esta jugando en el parque");
    }
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Raza:"+raza);
    }
}
