package Operaciones;

public class Division {
    int numeroA;
    int numeroB;

    public void operacionDivision(int numeroA, int numeroB){
        this.numeroA=numeroA;
        this.numeroB=numeroB;
        int resultado = numeroA / numeroB;
        System.out.println("El Resultado de la división es: "+resultado);
    }
}
