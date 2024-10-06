public class ModificadorFuerza {
    private int cuerpoAcuerpo;
    private double abrirPuertas = (double) 1 /6; //Abrir puertas 1 entre 6 ???????? Supongo que asi

    public ModificadorFuerza(TirarDados dados){
        if(dados.fuerza == 3){
            cuerpoAcuerpo = -3;
        } else if (dados.fuerza == 4 || dados.fuerza == 5) {
            cuerpoAcuerpo = -2;
        }else if (dados.fuerza >= 6 && dados.fuerza <= 8) {
            cuerpoAcuerpo = -1;
        }else if (dados.fuerza >= 9 && dados.fuerza <= 12) {
            cuerpoAcuerpo = 0;
            abrirPuertas = (double) 2/6;
        }else if (dados.fuerza >= 13 && dados.fuerza <= 15) {
            cuerpoAcuerpo = 1;
            abrirPuertas = (double) 3/6;
        }else if (dados.fuerza == 16 || dados.fuerza == 17) {
            cuerpoAcuerpo = 2;
            abrirPuertas = (double) 4/6;
        }else if (dados.fuerza == 18) {
            cuerpoAcuerpo = 3;
            abrirPuertas = (double) 5/6;
        }
    }

    public void mostrarModFuerza(){
        System.out.println("Cuerpo a cuerpo: "+cuerpoAcuerpo+". Abrir Puertas: "+abrirPuertas);
    }

}
