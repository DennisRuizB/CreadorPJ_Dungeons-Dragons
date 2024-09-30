public class Personaje {
    private String nombre;
    private String clase;
    private int nivel;
    private int fuerza;
    private int destreza;
    private int constitucion;
    private int inteligencia;
    private int sabiduria;
    private int carisma;

    // Constructor privado, se usa el Builder para crear instancias
    private Personaje(PersonajeBuilder builder) {
        this.nombre = builder.nombre;
        this.clase = builder.clase;
        this.nivel = builder.nivel;
        this.fuerza = builder.fuerza;
        this.destreza = builder.destreza;
        this.constitucion = builder.constitucion;
        this.inteligencia = builder.inteligencia;
        this.sabiduria = builder.sabiduria;
        this.carisma = builder.carisma;
    }

    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", clase=" + clase + ", nivel=" + nivel +
                ", fuerza=" + fuerza + ", destreza=" + destreza + ", constitucion=" + constitucion +
                ", inteligencia=" + inteligencia + ", sabiduria=" + sabiduria + ", carisma=" + carisma + "]";
    }

    // Clase estática interna para el patrón Builder
    public static class PersonajeBuilder {
        private String nombre;
        private String clase;
        private int nivel = 19;  // Nivel fijo a 19
        private int fuerza;
        private int destreza;
        private int constitucion;
        private int inteligencia;
        private int sabiduria;
        private int carisma;

        public PersonajeBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public PersonajeBuilder setClase(String clase) {
            this.clase = clase;
            return this;
        }

        public PersonajeBuilder setFuerza(int fuerza) {
            this.fuerza = fuerza;
            return this;
        }

        public PersonajeBuilder setDestreza(int destreza) {
            this.destreza = destreza;
            return this;
        }

        public PersonajeBuilder setConstitucion(int constitucion) {
            this.constitucion = constitucion;
            return this;
        }

        public PersonajeBuilder setInteligencia(int inteligencia) {
            this.inteligencia = inteligencia;
            return this;
        }

        public PersonajeBuilder setSabiduria(int sabiduria) {
            this.sabiduria = sabiduria;
            return this;
        }

        public PersonajeBuilder setCarisma(int carisma) {
            this.carisma = carisma;
            return this;
        }

        public Personaje build() {
            return new Personaje(this);
        }
    }
}
