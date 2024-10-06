public class ModificadorSabiduria {
    private int salvacionesMagicas;

    public ModificadorSabiduria(TirarDados dados){
        if(dados.sabiduria == 3){
            salvacionesMagicas = -3;
        } else if (dados.sabiduria == 4 || dados.sabiduria == 5) {
            salvacionesMagicas = -2;
        }else if (dados.sabiduria >= 6 && dados.sabiduria <= 8) {
            salvacionesMagicas = -1;
        }else if (dados.sabiduria >= 9 && dados.sabiduria <= 12) {
            salvacionesMagicas = 0;
        }else if (dados.sabiduria >= 13 && dados.sabiduria <= 15) {
            salvacionesMagicas = 1;
        }else if (dados.sabiduria == 16 || dados.sabiduria == 17) {
            salvacionesMagicas = 2;
        }else if (dados.sabiduria == 18) {
            salvacionesMagicas = 3;
        }
    }

    public void mostrarModSabiduria(){
        System.out.println("Salvaciones mágicas: "+salvacionesMagicas);
    }
}
