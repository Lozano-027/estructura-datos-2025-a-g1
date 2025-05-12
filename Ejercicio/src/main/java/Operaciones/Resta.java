package Operaciones;

public class Resta {
    int numeroA;
    int numeroB;

    public void operacionResta(int numeroA, int numeroB){
        this.numeroA=numeroA;
        this.numeroB=numeroB;
        int resultado = numeroA - numeroB;
        System.out.println("El Resultado de la Resta es: "+resultado);
    }
}
