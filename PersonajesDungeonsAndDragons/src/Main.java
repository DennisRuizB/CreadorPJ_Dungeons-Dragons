import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Director director = new Director();
        Personaje.PersonajeBuilder builder = new Personaje.PersonajeBuilder();
        Random random = new Random();

        // Mostrar las estadísticas de las clases con valores aleatorios
        mostrarEstadisticasClasesAleatorias(random);

        // Elegir clase
        System.out.println("Crea tu personaje. Elige una clase: Guerrero, Clérigo, Mago, Elfo, Enano, Ladrón, Mediano");
        String clase = scanner.nextLine().toLowerCase();

        switch (clase) {
            case "guerrero":
                director.construirGuerrero(builder, random);
                break;
            case "clérigo":
                director.construirClerigo(builder, random);
                break;
            case "mago":
                director.construirMago(builder, random);
                break;
            case "elfo":
                director.construirElfo(builder, random);
                break;
            case "enano":
                director.construirEnano(builder, random);
                break;
            case "ladrón":
                director.construirLadron(builder, random);
                break;
            case "mediano":
                director.construirMediano(builder, random);
                break;
            default:
                System.out.println("Clase no válida");
                return;
        }

        // Pedir nombre del personaje
        System.out.println("Ingresa el nombre de tu personaje:");
        String nombre = scanner.nextLine();
        builder.setNombre(nombre);

        // Crear el personaje
        Personaje personaje = builder.build();
        System.out.println("¡Personaje creado exitosamente!");
        System.out.println(personaje);

        scanner.close();
    }

    // Método para mostrar las estadísticas de las clases con valores aleatorios
    private static void mostrarEstadisticasClasesAleatorias(Random random) {
        System.out.println("Estadísticas de clases disponibles (con valores aleatorios):");

        System.out.println("\nGuerrero: ");
        mostrarAtributosAleatorios(random);

        System.out.println("\nClérigo: ");
        mostrarAtributosAleatorios(random);

        System.out.println("\nMago: ");
        mostrarAtributosAleatorios(random);

        System.out.println("\nElfo: ");
        mostrarAtributosAleatorios(random);

        System.out.println("\nEnano: ");
        mostrarAtributosAleatorios(random);

        System.out.println("\nLadrón: ");
        mostrarAtributosAleatorios(random);

        System.out.println("\nMediano: ");
        mostrarAtributosAleatorios(random);
    }

    // Método para generar valores aleatorios de los atributos y mostrarlos
    private static void mostrarAtributosAleatorios(Random random) {
        int fuerza = generarValorAleatorio(random);
        int destreza = generarValorAleatorio(random);
        int constitucion = generarValorAleatorio(random);
        int inteligencia = generarValorAleatorio(random);
        int sabiduria = generarValorAleatorio(random);
        int carisma = generarValorAleatorio(random);

        System.out.println("Fuerza: " + fuerza + ", Destreza: " + destreza +
                ", Constitución: " + constitucion + ", Inteligencia: " + inteligencia +
                ", Sabiduría: " + sabiduria + ", Carisma: " + carisma);
    }

    // Método para generar un valor aleatorio entre 3 y 18
    private static int generarValorAleatorio(Random random) {
        return random.nextInt(16) + 3;  // Genera un número entre 3 y 18
    }
}
