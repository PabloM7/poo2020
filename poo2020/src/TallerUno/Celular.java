package TallerUno;

public class Celular {

    //obtencion de atributos globales
    private String marca;
    private String modelo;
    private String capacidad;
    private String gama;
    private String camara;
    private String pantalla;


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
     * Método para obtener el valor de la variable capacidad
     * @return this.capacidad
     */
    public String obtener_capacidad(){
        return capacidad;
    }

    /**
     * Método para obtener el valor de la variable gama
     * @return this.gama
     */
    public String obtener_gama(){
        return gama;
    }

    /**
     * Método para obtener el valor de la variable camara
     * @return this.camara
     */
    public String obtener_camara(){
        return camara;
    }

    /**
     * Método para obtener el valor de la variable pantalla
     * @return this.pantalla
     */
    public String obtener_pantalla(){
        return pantalla;
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
     * Método para actualizar la variable capacidad
     * @param capacidad
     */
    public void actualizar_capacidad(String capacidad){
        //con el this hacemos referencia a variables globales
        this.capacidad = capacidad;
    }

    /**
     * Método para actualizar la variable gama
     * @param gama
     */
    public void actualizar_gama(String gama){
        //con el this hacemos referencia a variables globales
        this.gama = gama;
    }

    /**
     * Método para actualizar la variable camara
     * @param camara
     */
    public void actualizar_camara(String camara){
        //con el this hacemos referencia a variables globales
        this.camara = camara;
    }

    /**
     * Método para actualizar la variable pantalla
     * @param pantalla
     */
    public void actualizar_pantalla(String pantalla){
        //con el this hacemos referencia a variables globales
        this.pantalla = pantalla;
    }

}
