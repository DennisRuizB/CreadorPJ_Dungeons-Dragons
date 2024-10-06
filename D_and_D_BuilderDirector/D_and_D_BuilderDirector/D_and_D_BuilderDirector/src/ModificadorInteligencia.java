public class ModificadorInteligencia {

    private String idiomas = "Nativo";
    private String alfabetizacion = "Instruido";
    public ModificadorInteligencia(TirarDados dados){
        if(dados.inteligencia == 3){
            idiomas = "Nativo (palabras sueltas)";
            alfabetizacion = "Analfabeto";
        } else if (dados.inteligencia == 4 || dados.inteligencia == 5) {
            alfabetizacion = "Analfabeto";
        }else if (dados.inteligencia >= 6 && dados.inteligencia <= 8) {
            alfabetizacion = "Básica";
        }else if (dados.inteligencia >= 9 && dados.inteligencia <= 12) {
            //ya asignados
        }else if (dados.inteligencia >= 13 && dados.inteligencia <= 15) {
            idiomas = "Nativo + 1 adicional";
        }else if (dados.inteligencia == 16 || dados.inteligencia == 17) {
            idiomas = "Nativo + 2 adicional";
        }else if (dados.inteligencia == 18) {
            idiomas = "Nativo + 3 adicional";
        }
    }

    public void mostrarModInteligencia(){
        System.out.println("Idiomas Conocidos: "+idiomas+". Alfabetización: "+alfabetizacion);
    }

}
