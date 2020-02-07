package TallerUno;

import java.awt.*;

public class Universidad {

    //obtencion de atributos globales
    private String direccion;
    private String carrera;
    private String area;
    private String docente;


    /**
     * Método para obtener el valor de la variable direccion
     * @return this.direccion
     */
    public String obtener_direccion(){
        return direccion;
    }

    /**
     * Método para obtener el valor de la variable carrera
     * @return this.carrera
     */
    public String obtener_carrera(){
        return carrera;
    }

    /**
     * Método para obtener el valor de la variable area
     * @return this.area
     */
    public String obtener_area(){
        return area;
    }

    /**
     * Método para obtener el valor de la variable docente
     * @return this.docente
     */
    public String obtener_docente(){
        return docente;
    }

    /**
     * Método para actualizar la variable direccion
     * @param direccion
     */
    public void actualizar_direccion(String direccion){
        //con el this hacemos referencia a variables globales
        this.direccion = direccion;
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
     * Método para actualizar la variable area
     * @param area
     */
    public void actualizar_area(String area){
        //con el this hacemos referencia a variables globales
        this.area = area;
    }

    /**
     * Método para actualizar la variable docente
     * @param docente
     */
    public void actualizar_docente(String docente){
        //con el this hacemos referencia a variables globales
        this.docente = docente;
    }
}
