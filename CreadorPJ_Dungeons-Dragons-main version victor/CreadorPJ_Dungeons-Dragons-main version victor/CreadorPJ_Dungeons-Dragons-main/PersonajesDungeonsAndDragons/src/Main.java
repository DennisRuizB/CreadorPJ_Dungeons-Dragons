import java.util.Scanner;
import java.util.Random;
//iwewdmoimedoiwmoidmwledm
public class Main {
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Director director = new Director();
        Personaje.PersonajeBuilder builder = new Personaje.PersonajeBuilder();

//      Random random = new Random();


//        director.construirClerigo(builder);
//        director.construirEnano(builder);
//        director.construirLadron(builder);
//        director.construirMediano(builder);
//        director.construirGuerrero(builder);
//        director.construirMago(builder);

        // Crear y construir un guerrero
        Personaje.PersonajeBuilder builderGuerrero = new Personaje.PersonajeBuilder().setNombre("Guerrero");
        director.construirGuerrero(builderGuerrero);
        Personaje guerrero = builderGuerrero.build();
        System.out.println(guerrero);  // Imprime los detalles del Guerrero

        // Crear y construir un clérigo
        Personaje.PersonajeBuilder builderClerigo = new Personaje.PersonajeBuilder().setNombre("Clérigo");
        director.construirClerigo(builderClerigo);
        Personaje clerigo = builderClerigo.build();
        System.out.println(clerigo);  // Imprime los detalles del Clérigo

        // Crear y construir un mago
        Personaje.PersonajeBuilder builderMago = new Personaje.PersonajeBuilder().setNombre("Mago");
        director.construirMago(builderMago);
        Personaje mago = builderMago.build();
        System.out.println(mago);  // Imprime los detalles del Mago

        // Crear y construir un elfo
        Personaje.PersonajeBuilder builderElfo = new Personaje.PersonajeBuilder().setNombre("Elfo");
        director.construirElfo(builderElfo);
        Personaje elfo = builderElfo.build();
        System.out.println(elfo);  // Imprime los detalles del Elfo

        // Crear y construir un enano
        Personaje.PersonajeBuilder builderEnano = new Personaje.PersonajeBuilder().setNombre("Enano");
        director.construirEnano(builderEnano);
        Personaje enano = builderEnano.build();
        System.out.println(enano);  // Imprime los detalles del Enano

        // Crear y construir un ladrón
        Personaje.PersonajeBuilder builderLadron = new Personaje.PersonajeBuilder().setNombre("Ladrón");
        director.construirLadron(builderLadron);
        Personaje ladron = builderLadron.build();
        System.out.println(ladron);  // Imprime los detalles del Ladrón

        // Crear y construir un mediano
        Personaje.PersonajeBuilder builderMediano = new Personaje.PersonajeBuilder().setNombre("Mediano");
        director.construirMediano(builderMediano);
        Personaje mediano = builderMediano.build();
        System.out.println(mediano);  // Imprime los detalles del Mediano



        // Elegir clase
        System.out.println("Crea tu personaje. Elige una clase: Guerrero, Clérigo, Mago, Elfo, Enano, Ladrón, Mediano");
        String clase = scanner.nextLine().toLowerCase();
        ValoresMinimos(clase,  builderGuerrero);



        switch (clase) {

            case "elfo":
                if (VariablesGlobales.Elfo_puede_crearse == 1)
                {
                    System.out.println("No puedes ser Elfo porque el valor de la inteligencia no es minimo 9");
                }
                else
                {

                    break;
                }

            case "enano":
                if (VariablesGlobales.Enano_puede_crearse == 1)
                {
                    System.out.println("No puedes ser Enano porque el valor de la constitucion no es minimo 9");
                }
                else
                {

                    break;
                }


            case "mediano":
                if (VariablesGlobales.Mediano_puede_crearse == 1)
                {
                    System.out.println("No puedes ser Mediano porque el valor de la constitucion i/o destreza no es minimo 9");
                }
                else {

                    break;
                }
        }

        System.out.println("Ingresa el nombre de tu personaje:");
        String nombre = scanner.nextLine();
        switch (clase){
            case "guerrero":
                builderGuerrero.setNombre(clase);
                break;
            case "clérigo":
                builderClerigo.setNombre(clase);
                break;
            case "mago":
                builderMago.setNombre(clase);
                break;
            case "ladrón":
                builderLadron.setNombre(clase);
                break;
            case "enano":
                builderEnano.setNombre(clase);
                break;
            case "elfo":
                builderElfo.setNombre(clase);
                break;
            case "mediano":
                builderMediano.setNombre(clase);
                break;
        }


        System.out.println("¡Personaje creado exitosamente!");


        scanner.close();
    }



    // Método para generar valores aleatorios de los atributos y mostrarlos
    public static void ValoresMinimos( String nombre, Personaje.PersonajeBuilder p) {
        int fuerza = p.getFuerza();
        int destreza = p.getDestreza();
        int constitucion = p.getConstitucion();
        int inteligencia = p.getInteligencia();
        int sabiduria = p.getSabiduria();
        int carisma = p.getCarisma();

        System.out.println("Fuerza: " + fuerza + ", Destreza: " + destreza +
                ", Constitución: " + constitucion + ", Inteligencia: " + inteligencia +
                ", Sabiduría: " + sabiduria + ", Carisma: " + carisma);


        if ( inteligencia < 9)
        {
            VariablesGlobales.Elfo_puede_crearse = 1;
        }
        if ( constitucion < 9)
        {
            VariablesGlobales.Enano_puede_crearse = 1;
        }
        if ( (constitucion < 9 || destreza < 9 ))
        {
            VariablesGlobales.Mediano_puede_crearse = 1;
        }

    }
}
