import java.util.Random;

public class Director {

    Random Rcarisma = new Random();
    Random Rconstitucion = new Random();
    Random Rclase = new Random();
    Random Rinteligencia = new Random();
    Random Rsabiduria = new Random();
    Random Rdestreza = new Random();
    Random Rfuerza = new Random();

    // Limitar los valores entre 3 y 18
    int carisma = Rcarisma.nextInt(16) + 3;
    int constitucion = Rconstitucion.nextInt(16) + 3;
    int clase = Rclase.nextInt(16) + 3;
    int inteligencia = Rinteligencia.nextInt(16) + 3;
    int sabiduria = Rsabiduria.nextInt(16) + 3;
    int destreza = Rdestreza.nextInt(16) + 3;
    int fuerza = Rfuerza.nextInt(16) + 3;

    public void construirGuerrero(Personaje.PersonajeBuilder builder) {
        builder.setClase("Guerrero")
                .setFuerza(fuerza)
                .setDestreza(destreza)
                .setConstitucion(constitucion)
                .setInteligencia(inteligencia)
                .setSabiduria(sabiduria)
                .setCarisma(carisma);
    }

    public void construirClerigo(Personaje.PersonajeBuilder builder) {
        builder.setClase("Clérigo")
                .setFuerza(fuerza)
                .setDestreza(destreza)
                .setConstitucion(constitucion)
                .setInteligencia(inteligencia)
                .setSabiduria(sabiduria)
                .setCarisma(carisma);
    }

    public void construirMago(Personaje.PersonajeBuilder builder) {
        builder.setClase("Mago")
                .setFuerza(fuerza)
                .setDestreza(destreza)
                .setConstitucion(constitucion)
                .setInteligencia(inteligencia)
                .setSabiduria(sabiduria)
                .setCarisma(carisma);
    }

    // Nuevas clases añadidas: Elfo, Enano, Ladrón, Mediano

    public void construirElfo(Personaje.PersonajeBuilder builder) {
        builder.setClase("Elfo")
                .setFuerza(fuerza)
                .setDestreza(destreza)
                .setConstitucion(constitucion)
                .setInteligencia(inteligencia)
                .setSabiduria(sabiduria)
                .setCarisma(carisma);
    }

    public void construirEnano(Personaje.PersonajeBuilder builder) {
        builder.setClase("Enano")
                .setFuerza(fuerza)
                .setDestreza(destreza)
                .setConstitucion(constitucion)
                .setInteligencia(inteligencia)
                .setSabiduria(sabiduria)
                .setCarisma(carisma);
    }

    public void construirLadron(Personaje.PersonajeBuilder builder) {
        builder.setClase("Ladrón")
                .setFuerza(fuerza)
                .setDestreza(destreza)
                .setConstitucion(constitucion)
                .setInteligencia(inteligencia)
                .setSabiduria(sabiduria)
                .setCarisma(carisma);
    }

    public void construirMediano(Personaje.PersonajeBuilder builder) {
        builder.setClase("Mediano")
                .setFuerza(fuerza)
                .setDestreza(destreza)
                .setConstitucion(constitucion)
                .setInteligencia(inteligencia)
                .setSabiduria(sabiduria)
                .setCarisma(carisma);
    }


}
