package Operaciones;

public class Multiplicacion {
    int numeroA;
    int numeroB;

    public void operacionMult(int numeroA, int numeroB){
        this.numeroA=numeroA;
        this.numeroB=numeroB;
        int resultado = numeroA * numeroB;
        System.out.println("El Resultado de la Multiplicacion es: "+resultado);
    }
}
