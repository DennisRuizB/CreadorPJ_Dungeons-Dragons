public class ModificadorConstitucion {

    private int puntosGolpe;

    public ModificadorConstitucion(TirarDados dados){
        if(dados.constitucion == 3){
            puntosGolpe = -3;
        } else if (dados.constitucion == 4 || dados.constitucion == 5) {
            puntosGolpe = -2;
        }else if (dados.constitucion >= 6 && dados.constitucion <= 8) {
            puntosGolpe = -1;
        }else if (dados.constitucion >= 9 && dados.constitucion <= 12) {
            puntosGolpe = 0;
        }else if (dados.constitucion >= 13 && dados.constitucion <= 15) {
            puntosGolpe = 1;
        }else if (dados.constitucion == 16 || dados.constitucion == 17) {
            puntosGolpe = 2;
        }else if (dados.constitucion == 18) {
            puntosGolpe = 3;
        }
    }

    public void mostrarModConstitucion(){
        System.out.println("Puntos de golpe: "+puntosGolpe);
    }
}
