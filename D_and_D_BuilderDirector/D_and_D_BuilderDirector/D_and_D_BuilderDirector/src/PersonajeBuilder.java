public class PersonajeBuilder implements Builder{
    private String nombre;
    private Clase clase;
    private int fuerza;
    private int destreza;
    private int constitucion;
    private int inteligencia;
    private int sabiduria;
    private int carisma;
    private String alineamiento;
    private String idiomas;
    private ModificadorFuerza modFuerza;
    private ModificadorDestreza modDestreza;
    private ModificadorConstitucion modConstitucion;
    private ModificadorInteligencia modInteligencia;
    private ModificadorSabiduria modSabiduria;
    private ModificadorCarisma modCarisma;
    private ModificadorRequisitoPrincipal modPrincipal;
    //private int nivel = 9;  // Nivel fijo a 9

    public void mostrarPersonaje(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Clase: "+clase);
        System.out.println("Estadísticas:");
        System.out.println("Fuerza: " + fuerza + ", Destreza: " + destreza +
                ", Constitución: " + constitucion + ", Inteligencia: " + inteligencia +
                ", Sabiduría: " + sabiduria + ", Carisma: " + carisma + ", Alineamiento: " + alineamiento);
        System.out.println("Idiomas conocidos: " + idiomas);
    }

    public void mostrarModificadores(){
        System.out.println("\nModificadores de Fuerza:");
        modFuerza.mostrarModFuerza();
        System.out.println("\nModificadores de Destreza:");
        modDestreza.mostrarModDestreza();
        System.out.println("\nModificadores de Constitución:");
        modConstitucion.mostrarModConstitucion();
        System.out.println("\nModificadores de Inteligencia:");
        modInteligencia.mostrarModInteligencia();
        System.out.println("\nModificadores de Sabiduría:");
        modSabiduria.mostrarModSabiduria();
        System.out.println("\nModificadores de Carisma:");
        modCarisma.mostrarModCarisma();
        //System.out.println("\nModificadores de requisito principal:");
        //modPrincipal.mostrarModPrincipal();
    }

    @Override
    public void setClase(Clase clase) {
        this.clase = clase;
    }

    @Override
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    @Override
    public void setConstitucion(int constitucion) {
        this.constitucion = constitucion;
    }

    @Override
    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }


    public void setAlineamiento(String alineamiento) { this.alineamiento = alineamiento; }

    public void setIdiomas(String idiomas) { this.idiomas = idiomas; }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void ModificadorFuerza(ModificadorFuerza modFuerza) {
        this.modFuerza = modFuerza;
    }

    @Override
    public void ModificadorDestreza(ModificadorDestreza modDestreza) {
        this.modDestreza = modDestreza;
    }

    @Override
    public void ModificadorConstitucion(ModificadorConstitucion modConstitucion) {
        this.modConstitucion = modConstitucion;
    }

    @Override
    public void ModificadorInteligencia(ModificadorInteligencia modInteligencia) {
        this.modInteligencia = modInteligencia;
    }

    @Override
    public void ModificadorSabiduria(ModificadorSabiduria modSabiduria) {
        this.modSabiduria = modSabiduria;
    }

    @Override
    public void ModificadorCarisma(ModificadorCarisma modCarisma) {
        this.modCarisma = modCarisma;
    }

    //@Override
    //public void ModificadorRequisitoPrincipal(ModificadorRequisitoPrincipal modRequisitoPrincipal) {
      //  this.modPrincipal = modRequisitoPrincipal;
    //}

    public String getNombre() {
        return nombre;
    }

    public Clase getClase() {
        return clase;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getConstitucion() {
        return constitucion;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getSabiduria() {
        return sabiduria;
    }

    public int getCarisma() {
        return carisma;
    }
}
