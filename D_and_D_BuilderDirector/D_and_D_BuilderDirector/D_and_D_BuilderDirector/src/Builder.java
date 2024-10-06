public interface Builder {
    void setClase(Clase clase);
    void setFuerza(int fuerza);
    void setInteligencia(int inteligencia);
    void setSabiduria(int sabiduria);
    void setDestreza(int destreza);
    void setConstitucion(int constitucion);
    void setCarisma(int carisma);
    void setNombre(String nombre);
    void ModificadorFuerza(ModificadorFuerza modFuerza);
    void ModificadorDestreza(ModificadorDestreza modDestreza);
    void ModificadorConstitucion(ModificadorConstitucion modConstitucion);
    void ModificadorInteligencia(ModificadorInteligencia modInteligencia);
    void ModificadorSabiduria(ModificadorSabiduria modSabiduria);
    void ModificadorCarisma(ModificadorCarisma modCarisma);
    //void ModificadorRequisitoPrincipal(ModificadorRequisitoPrincipal modRequisitoPrincipal);


}
