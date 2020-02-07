package TallerUno;

public class Animal {
    //obtencion de atributos globales
    private String raza;
    private String edad;
    private String especie;

    /**
     * Método para obtener el valor de la variable raza
     * @return this.raza
     */
    public String obtener_raza(){
        return raza;
    }

    /**
     * Método para obtener el valor de la variable edad
     * @return this.edad
     */
    public String obtener_edad(){
        return edad;
    }

    /**
     * Método para obtener el valor de la variable especie
     * @return this.especie
     */
    public String obtener_especie(){
        return especie;
    }

    /**
     * Método para actualizar la variable raza
     * @param raza
     */
    public void actualizar_raza(String raza){
        //con el this hacemos referencia a variables globales
        this.raza = raza;
    }

    /**
     * Método para actualizar la variable edad
     * @param edad
     */
    public void actualizar_edad(String edad){
        //con el this hacemos referencia a variables globales
        this.edad = edad;
    }

    /**
     * Método para actualizar la variable
     * @param especie
     */
    public void actualizar_especie(String especie){
        //con el this hacemos referencia a variables globales
        this.especie = especie;
    }

}
