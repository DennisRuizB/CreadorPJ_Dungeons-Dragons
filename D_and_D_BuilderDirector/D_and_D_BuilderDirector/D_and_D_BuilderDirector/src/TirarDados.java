import java.util.Random;

public class TirarDados {

    Random rCarisma = new Random();
    Random rConstitucion = new Random();
    Random rInteligencia = new Random();
    Random rSabiduria = new Random();
    Random rDestreza = new Random();
    Random rFuerza = new Random();

    // Limitar los valores entre 3 y 18
    int carisma = rCarisma.nextInt(16) + 3;
    int constitucion = rConstitucion.nextInt(16) + 3;
    int inteligencia = rInteligencia.nextInt(16) + 3;
    int sabiduria = rSabiduria.nextInt(16) + 3;
    int destreza = rDestreza.nextInt(16) + 3;
    int fuerza = rFuerza.nextInt(16) + 3;

    public void mostrarDatos(){
        System.out.println("Fuerza: " + fuerza + ", Destreza: " + destreza +
                ", Constitución: " + constitucion + ", Inteligencia: " + inteligencia +
                ", Sabiduría: " + sabiduria + ", Carisma: " + carisma);
    }

}
