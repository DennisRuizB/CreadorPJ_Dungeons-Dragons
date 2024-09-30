import java.util.Random;

public class Director {

    public void construirGuerrero(Personaje.PersonajeBuilder builder, Random random) {
        builder.setClase("Guerrero")
                .setFuerza(generarValorAleatorio(random))
                .setDestreza(generarValorAleatorio(random))
                .setConstitucion(generarValorAleatorio(random))
                .setInteligencia(generarValorAleatorio(random))
                .setSabiduria(generarValorAleatorio(random))
                .setCarisma(generarValorAleatorio(random));
    }

    public void construirClerigo(Personaje.PersonajeBuilder builder, Random random) {
        builder.setClase("Clérigo")
                .setFuerza(generarValorAleatorio(random))
                .setDestreza(generarValorAleatorio(random))
                .setConstitucion(generarValorAleatorio(random))
                .setInteligencia(generarValorAleatorio(random))
                .setSabiduria(generarValorAleatorio(random))
                .setCarisma(generarValorAleatorio(random));
    }

    public void construirMago(Personaje.PersonajeBuilder builder, Random random) {
        builder.setClase("Mago")
                .setFuerza(generarValorAleatorio(random))
                .setDestreza(generarValorAleatorio(random))
                .setConstitucion(generarValorAleatorio(random))
                .setInteligencia(generarValorAleatorio(random))
                .setSabiduria(generarValorAleatorio(random))
                .setCarisma(generarValorAleatorio(random));
    }

    // Nuevas clases añadidas: Elfo, Enano, Ladrón, Mediano

    public void construirElfo(Personaje.PersonajeBuilder builder, Random random) {
        builder.setClase("Elfo")
                .setFuerza(generarValorAleatorio(random))
                .setDestreza(generarValorAleatorio(random))
                .setConstitucion(generarValorAleatorio(random))
                .setInteligencia(generarValorAleatorio(random))
                .setSabiduria(generarValorAleatorio(random))
                .setCarisma(generarValorAleatorio(random));
    }

    public void construirEnano(Personaje.PersonajeBuilder builder, Random random) {
        builder.setClase("Enano")
                .setFuerza(generarValorAleatorio(random))
                .setDestreza(generarValorAleatorio(random))
                .setConstitucion(generarValorAleatorio(random))
                .setInteligencia(generarValorAleatorio(random))
                .setSabiduria(generarValorAleatorio(random))
                .setCarisma(generarValorAleatorio(random));
    }

    public void construirLadron(Personaje.PersonajeBuilder builder, Random random) {
        builder.setClase("Ladrón")
                .setFuerza(generarValorAleatorio(random))
                .setDestreza(generarValorAleatorio(random))
                .setConstitucion(generarValorAleatorio(random))
                .setInteligencia(generarValorAleatorio(random))
                .setSabiduria(generarValorAleatorio(random))
                .setCarisma(generarValorAleatorio(random));
    }

    public void construirMediano(Personaje.PersonajeBuilder builder, Random random) {
        builder.setClase("Mediano")
                .setFuerza(generarValorAleatorio(random))
                .setDestreza(generarValorAleatorio(random))
                .setConstitucion(generarValorAleatorio(random))
                .setInteligencia(generarValorAleatorio(random))
                .setSabiduria(generarValorAleatorio(random))
                .setCarisma(generarValorAleatorio(random));
    }

    // Método para generar un valor aleatorio entre 3 y 18
    private int generarValorAleatorio(Random random) {
        return random.nextInt(16) + 3;  // Genera un número entre 3 y 18
    }
}
