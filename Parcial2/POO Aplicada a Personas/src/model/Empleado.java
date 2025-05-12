package model;

public class Empleado extends Persona {
    private String codigoEmpleado;
    private String cargo;
    private double salario;

    public Empleado(String nombre, int edad, String direccion, String codigoEmpleado, String cargo, double salario) {
        super(nombre, edad, direccion);
        this.codigoEmpleado = codigoEmpleado;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\nCódigo empleado: " + codigoEmpleado +
                "\nCargo: " + cargo +
                String.format("\nSalario: $%.2f", salario);
    }
}