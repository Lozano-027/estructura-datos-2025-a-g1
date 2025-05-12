package model;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Paula Romero", 18, "New Your", "CLIENTE-03", "Parlante");
        cliente.agregarCompra("Parlante");

        Empleado empleado = new Empleado("Julio Lozano", 18, "COMUNA 13",
                "EMPLEADO-007", "Programador", 2500000.00);

        System.out.println("=== CLIENTE ===");
        System.out.println(cliente.mostrarInformacion());

        System.out.println("\n=== EMPLEADO ===");
        System.out.println(empleado.mostrarInformacion());
    }
}