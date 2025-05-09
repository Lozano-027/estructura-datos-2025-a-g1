package Operaciones;

public class Suma {
    int numeroA;
    int numeroB;

    public void operacionSuma(int numeroA, int numeroB){
        this.numeroA=numeroA;
        this.numeroB=numeroB;
        int resultado = numeroA + numeroB;
        System.out.println("El Resultado de la suma es: "+resultado);
    }
}
