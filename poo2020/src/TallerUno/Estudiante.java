package TallerUno;

public class Estudiante {

    //definicion de atributos globales
    private String nombre;
    private int edad;
    private String carrera;
    private int ciclo;
    private String genero;

    /**
     * Método para obtener el valor de la variable nombre
     * @return this.nombre
     */
    public String obtener_nombre(){
        return nombre;
    }

    /**
     * Método para obtener el valor de la variable edad
     * @return this.edad
     */
    public int obtener_edad(int edad){
        return edad;
    }

    /**
     * Método para obtener el valor de la variable carrera
     * @return this.carrera
     */
    public String obtener_carrera(){
        return carrera;
    }

    /**
     * Método para obtener el valor de la variable ciclo
     * @return this.ciclo
     */
    public int obtener_ciclo(){
        return ciclo;
    }

    /**
     * Método para obtener el valor de la variable genero
     * @return this.genero
     */
    public String obtener_genero(){
        return genero;
    }

    /**
     * Método para actualizar la variable nombre
     * @param nombre
     */
    public void actualizar_nombre(String nombre){
        //con el this hacemos referencia a variables globales
        this.nombre = nombre;
    }

    /**
     * Método para actualizar la variable edad
     * @param edad
     */
    public void actualizar_edad(int edad){
        //con el this hacemos referencia a variables globales
        this.edad = edad;
    }

    /**
     * Método para actualizar la variable carrera
     * @param carrera
     */
    public void actualizar_carrera(String carrera){
        //con el this hacemos referencia a variables globales
        this.carrera = carrera;
    }

    /**
     * Método para actualizar la variable ciclo
     * @param ciclo
     */
    public void actualizar_ciclo(int ciclo){
        //con el this hacemos referencia a variables globales
        this.ciclo = ciclo;
    }

    /**
     * Método para actualizar la variable genero
     * @param genero
     */
    public void actualizar_genero(String genero){
        //con el this hacemos referencia a variables globales
        this.genero = genero;
    }

}
