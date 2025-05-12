package model;
public class Cliente extends Persona {
    private String numeroCliente;
    private String historialCliente;
    private String historialC;

    public Cliente( String nombre, int edad, String direccion, String numeroCliente, String historialC){
        super(nombre,edad,direccion);
        this.numeroCliente = numeroCliente;
        this.historialCliente = historialCliente;
        this.historialC = historialC;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getHistorialCliente() {
        return historialCliente;
    }

    public void setHistorialCliente(String historialCliente) {
        this.historialCliente = historialCliente;
    }

    public String getHistorialC() {
        return historialC;
    }

    public void setHistorialC(String historialC) {
        this.historialC = historialC;
    }

    public void agregarCompra(String monitor) {
    }
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\nNúmero de cliente: " + numeroCliente +
                "\nHistorial compras: " + String.join(", ", historialC);
    }
}