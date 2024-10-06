public class ModificadorDestreza {
    private int ca;
    private int proyectil;
    private int iniciativa;

    public ModificadorDestreza(TirarDados dados){
        if(dados.destreza == 3){
            ca = -3;
            proyectil = -3;
            iniciativa = -1;
        } else if (dados.destreza == 4 || dados.destreza == 5) {
            ca = -2;
            proyectil = -2;
            iniciativa = -1;
        }else if (dados.destreza >= 6 && dados.destreza <= 8) {
            ca = -1;
            proyectil = -1;
            iniciativa = -1;
        }else if (dados.destreza >= 9 && dados.destreza <= 12) {
            ca = 0;
            proyectil = 0;
            iniciativa = 0;
        }else if (dados.destreza >= 13 && dados.destreza <= 15) {
            ca = 1;
            proyectil = 1;
            iniciativa = 1;
        }else if (dados.destreza == 16 || dados.destreza == 17) {
            ca = 2;
            proyectil = 2;
            iniciativa = 1;
        }else if (dados.destreza == 18) {
            ca = 3;
            proyectil = 3;
            iniciativa = 2;
        }
    }

    public void mostrarModDestreza(){
        System.out.println("CA: "+ca+". Proyectil: "+proyectil+". Iniciativa: "+iniciativa);
    }

}
