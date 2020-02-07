package TallerUno;

public class Vehiculo {

    //obtencion de variables globales
    private String marca;
    private String modelo;
    private String procedencia;
    private String cilindraje;


    /**
     * Método para obtener el valor de la variable marca
     * @return this.marca
     */
    public String obtener_marca(){
        return marca;
    }


    /**
     * Método para obtener el valor de la variable modelo
     * @return this.modelo
     */
    public String obtener_modelo(){
        return modelo;
    }


    /**
     * Método para obtener el valor de la variable procedencia
     * @return this.procedencia
     */
    public String obtener_procedencia(){
        return procedencia;
    }


    /**
     * Método para obtener el valor de la variable cilindraje
     * @return this.cilindraje
     */
    public String obtener_cilindraje(){
        return cilindraje;
    }
    /**
     * Método para actualizar la variable marca
     * @param marca
     */
    public void actualizar_marca(String marca){
        //con el this hacemos referencia a variables globales
        this.marca = marca;
    }

    /**
     * Método para actualizar la variable modelo
     * @param modelo
     */
    public void actualizar_modelo(String modelo){
        //con el this hacemos referencia a variables globales
        this.modelo = modelo;
    }

    /**
     * Método para actualizar la variable procedencia
     * @param procedencia
     */
    public void actualizar_procedencia(String procedencia){
        //con el this hacemos referencia a variables globales
        this.procedencia = procedencia;
    }

    /**
     * Método para actualizar la variable cilindraje
     * @param cilindraje
     */
    public void actualizar_cilindraje(String cilindraje){
        //con el this hacemos referencia a variables globales
        this.cilindraje = cilindraje;
    }

}
