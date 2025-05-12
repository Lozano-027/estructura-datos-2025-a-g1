package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Animal> animales = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    registrarPerro();
                    break;
                case 2:
                    registrarGato();
                    break;
                case 3:
                    registrarPajaro();
                    break;
                case 4:
                    registrarConejo();
                    break;
                case 5:
                    mostrarAnimalesRegistrados();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);
    }

    private static void mostrarMenu() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Registrar perro");
        System.out.println("2. Registrar gato");
        System.out.println("3. Registrar pájaro");
        System.out.println("4. Registrar conejo");
        System.out.println("5. Mostrar animales registrados");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void registrarPerro() {
        System.out.println("\n=== REGISTRO DE PERRO ===");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad (años): ");
        int edad = scanner.nextInt();
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Raza: ");
        String raza = scanner.nextLine();

        animales.add(new Perro(nombre, edad, peso, raza));
        System.out.println("Perro registrado exitosamente!");
        System.out.println("Acciones disponibles: ladrar(), jugar()");
    }

    private static void registrarGato() {
        System.out.println("\n=== REGISTRO DE GATO ===");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad (años): ");
        int edad = scanner.nextInt();
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Color de pelaje: ");
        String colorPelaje = scanner.nextLine();

        animales.add(new Gato(nombre, edad, peso, colorPelaje));
        System.out.println("Gato registrado exitosamente!");
        System.out.println("Acciones disponibles: maullar(), ronronear()");
    }

    private static void registrarPajaro() {
        System.out.println("\n=== REGISTRO DE PÁJARO ===");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad (años): ");
        int edad = scanner.nextInt();
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Tipo de canto: ");
        String tipoDeCanto = scanner.nextLine();

        animales.add(new Pajaro(nombre, edad, peso, tipoDeCanto));
        System.out.println("Pájaro registrado exitosamente!");
        System.out.println("Acciones disponibles: cantar(), volar()");
    }

    private static void registrarConejo() {
        System.out.println("\n=== REGISTRO DE CONEJO ===");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad (años): ");
        int edad = scanner.nextInt();
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Longitud de orejas (cm): ");
        double longitudOrejas = scanner.nextDouble();
        scanner.nextLine();

        animales.add(new Conejo(nombre, edad, peso, longitudOrejas));
        System.out.println("Conejo registrado exitosamente!");
        System.out.println("Acciones disponibles: saltar(), masticar()");
    }

    private static void mostrarAnimalesRegistrados() {
        if (animales.isEmpty()) {
            System.out.println("\nNo hay animales registrados.");
            return;
        }

        System.out.println("\n=== ANIMALES REGISTRADOS ===");
        for (Animal animal : animales) {
            System.out.println("\n-------------------------");
            animal.mostrarInformacion();
            animal.clasificarEdad();
            animal.hacerSonido();

            // Mostrar acciones específicas según el tipo de animal
            if (animal instanceof Perro) {
                Perro perro = (Perro) animal;
                System.out.println("Acciones específicas:");
                perro.jugar();
            } else if (animal instanceof Gato) {
                Gato gato = (Gato) animal;
                System.out.println("Acciones específicas:");
                gato.ronronear();
            } else if (animal instanceof Pajaro) {
                Pajaro pajaro = (Pajaro) animal;
                System.out.println("Acciones específicas:");
                pajaro.volar();
            } else if (animal instanceof Conejo) {
                Conejo conejo = (Conejo) animal;
                System.out.println("Acciones específicas:");
                conejo.saltar();
            }
        }
    }
}