import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Director director = new Director();
        TirarDados dados = new TirarDados();
        PersonajeBuilder builder = new PersonajeBuilder();
        boolean continuar = true;

        while (continuar) {
            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1. Crear personaje");
            System.out.println("2. Ver estadísticas del personaje");
            System.out.println("3. Comprar equipo");
            System.out.println("4. Salir del juego");
            System.out.println("5. Cambiar caracteristicas");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.println("\n¡Bienvenido al creador de personajes!");
                    System.out.println("Estadísitcas generadas:");
                    director.tirarDados(dados); //tiramos los 3d6 para generar las estadísticas
                    dados.mostrarDatos();

                    //Limitaciones de las clases
                    if (director.inteligencia < 9) {
                        //if (builder.getInteligencia() < 9) {
                        VariablesGlobales.Elfo_puede_crearse = 1;
                    }
                    if (director.constitucion < 9) {
                        VariablesGlobales.Enano_puede_crearse = 1;
                    }
                    if ((director.constitucion < 9 || director.destreza < 9)) {
                        VariablesGlobales.Mediano_puede_crearse = 1;
                    }

                    //Elegir clase
                    System.out.println("1. Guerrero");
                    System.out.println("2. Clérigo");
                    System.out.println("3. Mago");
                    System.out.println("4. Elfo");
                    System.out.println("5. Enano");
                    System.out.println("6. Ladrón");
                    System.out.println("7. Mediano");
                    System.out.println("Elige una clase: ");

                    int clase = 99;
                    try {
                        clase = scanner.nextInt();
                        scanner.nextLine();
                    }
                    catch (Exception e){
                        System.out.println("Seleccione una de las opciones propuestas");
                    }

                    //El director generará los personajes con las estadisticas generadas
                    switch (clase) {
                        case 1:
                            director.construirGuerrero(builder);
//                            VariablesGlobales.Mediano_puede_crearse = 0;
//                            VariablesGlobales.Enano_puede_crearse = 0;
//                            VariablesGlobales.Elfo_puede_crearse = 0;
                            break;
                        case 2:
                            director.construirClerigo(builder);
//                            VariablesGlobales.Mediano_puede_crearse = 0;
//                            VariablesGlobales.Enano_puede_crearse = 0;
//                            VariablesGlobales.Elfo_puede_crearse = 0;
                            break;
                        case 3:
                            director.construirMago(builder);
//                            VariablesGlobales.Mediano_puede_crearse = 0;
//                            VariablesGlobales.Enano_puede_crearse = 0;
//                            VariablesGlobales.Elfo_puede_crearse = 0;
                            break;
                        case 4:
//                            VariablesGlobales.Mediano_puede_crearse = 0;
//                            VariablesGlobales.Enano_puede_crearse = 0;
                            if (VariablesGlobales.Elfo_puede_crearse == 1)
                            {
                                System.out.println("No puedes ser Elfo porque el valor de la inteligencia no es minimo 9");
                            }
                            else
                            {
                                director.construirElfo(builder);
                            }
                            break;
                        case 5:
//                            VariablesGlobales.Mediano_puede_crearse = 0;
//                            VariablesGlobales.Elfo_puede_crearse = 0;
                            if (VariablesGlobales.Enano_puede_crearse == 1)
                            {
                                System.out.println("No puedes ser Enano porque el valor de la constitucion no es minimo 9");
                            }
                            else
                            {
                                director.construirEnano(builder);
                            }
                            break;
                        case 6:
                            director.construirLadron(builder);
//                            VariablesGlobales.Mediano_puede_crearse = 0;
//                            VariablesGlobales.Enano_puede_crearse = 0;
//                            VariablesGlobales.Elfo_puede_crearse = 0;
                            break;
                        case 7:
//                            VariablesGlobales.Enano_puede_crearse = 0;
//                            VariablesGlobales.Elfo_puede_crearse = 0;
                            if (VariablesGlobales.Mediano_puede_crearse == 1)
                            {
                                System.out.println("No puedes ser Mediano porque el valor de la constitucion y/o destreza no es minimo 9");
                            }
                            else {
                                director.construirMediano(builder);
                            }
                            break;
                    }
                    if (VariablesGlobales.Mediano_puede_crearse != 1 || VariablesGlobales.Enano_puede_crearse != 1 || VariablesGlobales.Elfo_puede_crearse != 1) {
                        System.out.println("Ingresa el nombre de tu personaje:");
                        String nombre = scanner.nextLine(); //No funciona rip
                        builder.setNombre(nombre);
                        System.out.println("Ingresa el alineamiento de tu personaje: Legal, Neutral o Caótico");
                        String alineamiento = scanner.nextLine();
                        System.out.println("Que idiomas conoce tu personaje:");
                        String idioma = scanner.nextLine();
                        builder.setIdiomas(idioma);
                        builder.setAlineamiento(alineamiento);
                        System.out.println("¡Personaje creado exitosamente!");
                    }

                    break;
                case 2:
                    if (builder.getFuerza() != 0) {//por defecto antes de crear al personaje el valor de fuerza es 0
                        builder.mostrarPersonaje();
                        builder.mostrarModificadores();
                    } else {
                        System.out.println("Primero debes crear un personaje.");
                    }
                    break;
                case 3:
                    if (builder.getFuerza() != 0) {
                        comprarEquipo(scanner);
                    } else {
                        System.out.println("Primero debes crear un personaje.");

                    }
                    break;
                case 4:
                    System.out.println("Gracias por jugar. ¡Hasta la próxima!");
                    continuar = false;
                    break;
                case 5:
                    if (builder.getFuerza() != 0) {
                        Modificador_C( scanner, builder);
                    } else {
                        System.out.println("Primero debes crear un personaje.");
                    }


                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");



            }
        }

        scanner.close();









    }
    public static void comprarEquipo(Scanner scanner) {
        System.out.println("Tienes 100 monedas de oro.");
        System.out.println("Elige el equipo que deseas comprar:");
        System.out.println("1. Espada (50 monedas)");
        System.out.println("2. Escudo (30 monedas)");
        System.out.println("3. Armadura ligera (70 monedas)");
        // Puedes añadir más opciones según sea necesario
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has comprado una espada.");
                break;
            case 2:
                System.out.println("Has comprado un escudo.");
                break;
            case 3:
                System.out.println("Has comprado una armadura ligera.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    public static void Modificador_C(Scanner scanner,PersonajeBuilder builder)
    {
        boolean verificador = false;
        System.out.println("A que caracteristica le quieres restar puntos para posteriormente sumarselos a otra, nunca podra bajar de los 9 puntos y se restaran 2 puntos");


        System.out.println("1. fuerza: " + builder.getFuerza());
        System.out.println("2. destreza: "+ builder.getDestreza());
        System.out.println("3. constitucion: "+ builder.getConstitucion());
        System.out.println("4. inteligencia: "+ builder.getInteligencia());
        System.out.println("5. sabiduria: " + builder.getSabiduria());
        System.out.println("6. carisma: "+ builder.getCarisma());

        int clase_restar = scanner.nextInt();
        scanner.nextLine();

        try
        {
            switch (clase_restar) {
                case 1:
                    if (builder.getFuerza() >= 11)
                 {
                     builder.setFuerza(builder.getFuerza()-2);
                     verificador = true;
                 }
                    else
                    {
                        System.out.println("no tiene minimo 11");
                    }
                    break;
                case 2:
                    if (builder.getDestreza() >= 11)
                    {
                        builder.setDestreza(builder.getDestreza()-2);
                        verificador = true;
                    }
                    else
                    {
                        System.out.println("no tiene minimo 11");
                    }
                    break;
                case 3:
                    if (builder.getConstitucion() >= 11)
                    {
                        builder.setConstitucion(builder.getConstitucion()-2);
                        verificador = true;
                    }
                    else
                    {
                        System.out.println("no tiene minimo 11");
                    }
                    break;
                case 4:
                    if (builder.getInteligencia() >= 11)
                    {
                        builder.setInteligencia(builder.getInteligencia()-2);
                        verificador = true;
                    }
                    else
                    {
                        System.out.println("no tiene minimo 11");
                    }
                    break;
                case 5:
                    if (builder.getSabiduria() >= 11)
                    {
                        builder.setSabiduria(builder.getSabiduria()-2);
                        verificador = true;
                    }
                    else
                    {
                        System.out.println("no tiene minimo 11");
                    }
                    break;
                case 6:
                    if (builder.getCarisma() >= 11)
                    {
                        builder.setCarisma(builder.getCarisma()-2);
                        verificador = true;
                    }
                    else
                    {
                        System.out.println("no tiene minimo 11");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        catch (Exception e)
        {
            System.out.println("Seleccione una de las opciones propuestas");
        }
        if (verificador == true)
        {
            System.out.println("A que caracteristica le quieres sumar 1 punto");
            int clase_sumar = scanner.nextInt();

            try {
                switch (clase_sumar) {
                    case 1:
                        builder.setFuerza(builder.getFuerza()+1);
                        break;
                    case 2:
                        builder.setDestreza(builder.getDestreza()+1);
                        break;
                    case 3:
                        builder.setConstitucion(builder.getConstitucion()+1);
                        break;
                    case 4:
                        builder.setInteligencia(builder.getInteligencia()+1);
                        break;
                    case 5:
                        builder.setSabiduria(builder.getSabiduria()+1);
                        break;
                    case 6:
                        builder.setCarisma(builder.getCarisma()+1);
                        break;
                }
            } catch (Exception e)
            {
                System.out.println("Seleccione una de las opciones propuestas");
            }

        }



//        try {
//            clase_restar = scanner.nextInt();
//            scanner.nextLine();
//            if ((clase_restar == 1 && director.fuerza < 11) ||(clase_restar == 2 && director.destreza < 11) ||(clase_restar == 3 && director.constitucion < 11) ||(clase_restar == 4 && director.inteligencia < 11) ||(clase_restar == 5 && director.sabiduria < 11) ||(clase_restar == 6 && director.carisma < 11))
//            {
//
//            }
//
//
//
//            System.out.println("A que caracteristica le quieres sumar 1 punto");
//            int clase_sumar = 99;
//            try {
//                clase_sumar = scanner.nextInt();
//                scanner.nextLine();
//
//                i = 1;
//
//            }
//            catch (Exception e){
//                System.out.println("Seleccione una de las opciones propuestas");
//            }
//
//        }
//        catch (Exception e){
//            System.out.println("Seleccione una de las opciones propuestas");
//        }
//
//        if (i == 1)
//        {
//            if (clase_restar == 1)
//            {
//
//            }
//        }







    }

    }





