public class Director {
    int carisma;
    int constitucion;
    int inteligencia;
    int sabiduria;
    int destreza;
    int fuerza;
    int puntosDeGolpe;
    String alineamiento;

    TirarDados dados = new TirarDados();

    public void tirarDados(TirarDados dados){
        carisma = dados.carisma;
        constitucion = dados.constitucion;
        inteligencia = dados.inteligencia;
        sabiduria = dados.sabiduria;
        destreza = dados.destreza;
        fuerza = dados.fuerza;

        this.dados = dados;
    }

    public void construirGuerrero(Builder builder) {
        builder.setClase(Clase.Guerrero);
        builder.setFuerza(fuerza);
        builder.setDestreza(destreza);
        builder.setConstitucion(constitucion);
        builder.setInteligencia(inteligencia);
        builder.setSabiduria(sabiduria);
        builder.setCarisma(carisma);
        builder.ModificadorFuerza(new ModificadorFuerza(dados));
        builder.ModificadorDestreza(new ModificadorDestreza(dados));
        builder.ModificadorConstitucion(new ModificadorConstitucion(dados));
        builder.ModificadorInteligencia(new ModificadorInteligencia(dados));
        builder.ModificadorSabiduria(new ModificadorSabiduria(dados));
        builder.ModificadorCarisma(new ModificadorCarisma(dados));
        //builder.ModificadorRequisitoPrincipal(new ModificadorRequisitoPrincipal());
    }

    public void construirClerigo(Builder builder) {
        builder.setClase(Clase.Clérigo);
        builder.setFuerza(fuerza);
        builder.setDestreza(destreza);
        builder.setConstitucion(constitucion);
        builder.setInteligencia(inteligencia);
        builder.setSabiduria(sabiduria);
        builder.setCarisma(carisma);
        builder.ModificadorFuerza(new ModificadorFuerza(dados));
        builder.ModificadorDestreza(new ModificadorDestreza(dados));
        builder.ModificadorConstitucion(new ModificadorConstitucion(dados));
        builder.ModificadorInteligencia(new ModificadorInteligencia(dados));
        builder.ModificadorSabiduria(new ModificadorSabiduria(dados));
        builder.ModificadorCarisma(new ModificadorCarisma(dados));
        //builder.ModificadorRequisitoPrincipal(new ModificadorRequisitoPrincipal());
    }

    public void construirMago(Builder builder) {
        builder.setClase(Clase.Mago);
        builder.setFuerza(fuerza);
        builder.setDestreza(destreza);
        builder.setConstitucion(constitucion);
        builder.setInteligencia(inteligencia);
        builder.setSabiduria(sabiduria);
        builder.setCarisma(carisma);
        builder.ModificadorFuerza(new ModificadorFuerza(dados));
        builder.ModificadorDestreza(new ModificadorDestreza(dados));
        builder.ModificadorConstitucion(new ModificadorConstitucion(dados));
        builder.ModificadorInteligencia(new ModificadorInteligencia(dados));
        builder.ModificadorSabiduria(new ModificadorSabiduria(dados));
        builder.ModificadorCarisma(new ModificadorCarisma(dados));
        //builder.ModificadorRequisitoPrincipal(new ModificadorRequisitoPrincipal());
    }

    public void construirElfo(Builder builder) {
        builder.setClase(Clase.Elfo);
        builder.setFuerza(fuerza);
        builder.setDestreza(destreza);
        builder.setConstitucion(constitucion);
        builder.setInteligencia(inteligencia);
        builder.setSabiduria(sabiduria);
        builder.setCarisma(carisma);
        builder.ModificadorFuerza(new ModificadorFuerza(dados));
        builder.ModificadorDestreza(new ModificadorDestreza(dados));
        builder.ModificadorConstitucion(new ModificadorConstitucion(dados));
        builder.ModificadorInteligencia(new ModificadorInteligencia(dados));
        builder.ModificadorSabiduria(new ModificadorSabiduria(dados));
        builder.ModificadorCarisma(new ModificadorCarisma(dados));
        //builder.ModificadorRequisitoPrincipal(new ModificadorRequisitoPrincipal());
    }

    public void construirEnano(Builder builder) {
        builder.setClase(Clase.Enano);
        builder.setFuerza(fuerza);
        builder.setDestreza(destreza);
        builder.setConstitucion(constitucion);
        builder.setInteligencia(inteligencia);
        builder.setSabiduria(sabiduria);
        builder.setCarisma(carisma);
        builder.ModificadorFuerza(new ModificadorFuerza(dados));
        builder.ModificadorDestreza(new ModificadorDestreza(dados));
        builder.ModificadorConstitucion(new ModificadorConstitucion(dados));
        builder.ModificadorInteligencia(new ModificadorInteligencia(dados));
        builder.ModificadorSabiduria(new ModificadorSabiduria(dados));
        builder.ModificadorCarisma(new ModificadorCarisma(dados));
        //builder.ModificadorRequisitoPrincipal(new ModificadorRequisitoPrincipal());
    }

    public void construirLadron(Builder builder) {
        builder.setClase(Clase.Ladrón);
        builder.setFuerza(fuerza);
        builder.setDestreza(destreza);
        builder.setConstitucion(constitucion);
        builder.setInteligencia(inteligencia);
        builder.setSabiduria(sabiduria);
        builder.setCarisma(carisma);
        builder.ModificadorFuerza(new ModificadorFuerza(dados));
        builder.ModificadorDestreza(new ModificadorDestreza(dados));
        builder.ModificadorConstitucion(new ModificadorConstitucion(dados));
        builder.ModificadorInteligencia(new ModificadorInteligencia(dados));
        builder.ModificadorSabiduria(new ModificadorSabiduria(dados));
        builder.ModificadorCarisma(new ModificadorCarisma(dados));
        //builder.ModificadorRequisitoPrincipal(new ModificadorRequisitoPrincipal());
    }

    public void construirMediano(Builder builder) {
        builder.setClase(Clase.Mediano);
        builder.setFuerza(fuerza);
        builder.setDestreza(destreza);
        builder.setConstitucion(constitucion);
        builder.setInteligencia(inteligencia);
        builder.setSabiduria(sabiduria);
        builder.setCarisma(carisma);
        builder.ModificadorFuerza(new ModificadorFuerza(dados));
        builder.ModificadorDestreza(new ModificadorDestreza(dados));
        builder.ModificadorConstitucion(new ModificadorConstitucion(dados));
        builder.ModificadorInteligencia(new ModificadorInteligencia(dados));
        builder.ModificadorSabiduria(new ModificadorSabiduria(dados));
        builder.ModificadorCarisma(new ModificadorCarisma(dados));
        //builder.ModificadorRequisitoPrincipal(new ModificadorRequisitoPrincipal());
    }
}
