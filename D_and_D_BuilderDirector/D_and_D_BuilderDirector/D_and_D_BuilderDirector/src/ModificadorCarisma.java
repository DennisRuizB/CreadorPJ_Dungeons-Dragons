public class ModificadorCarisma {

    private int pnj;
    private int maxNum;
    private int lealtad;

    public ModificadorCarisma(TirarDados dados){
        if(dados.carisma == 3){
            pnj = -2;
            maxNum = 1;
            lealtad = 4;
        } else if (dados.carisma == 4 || dados.carisma == 5) {
            pnj = -1;
            maxNum = 2;
            lealtad = 5;
        }else if (dados.carisma >= 6 && dados.carisma <= 8) {
            pnj = -1;
            maxNum = 3;
            lealtad = 6;
        }else if (dados.carisma >= 9 && dados.carisma <= 12) {
            pnj = 0;
            maxNum = 4;
            lealtad = 7;
        }else if (dados.carisma >= 13 && dados.carisma <= 15) {
            pnj = 1;
            maxNum = 5;
            lealtad = 8;
        }else if (dados.carisma == 16 || dados.carisma == 17) {
            pnj = 1;
            maxNum = 6;
            lealtad = 9;
        }else if (dados.carisma == 18) {
            pnj = 2;
            maxNum = 7;
            lealtad = 10;
        }
    }

    public void mostrarModCarisma(){
        System.out.println("Reacción de PNJ: "+pnj+". Máximo Número: "+maxNum+". Lealdad: "+lealtad);
    }

}
