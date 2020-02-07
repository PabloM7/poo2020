package TallerUno;

public class Computadora {

    //obtencion de atributos globales
    private String marca;
    private String sistema_operativo;
    private int precio;
    private String caracteristicas;

    /**
     * Método para obtener el valor de la variable marca
     * @return this.marca
     */
    public String obtener_marca(){
        return marca;
    }

    /**
     * Método para obtener el valor de la variable sistema_operativo
     * @return this.sistema_operativo
     */
    public String obtener_sistema_operativo(){
        return sistema_operativo;
    }

    /**
     * Método para obtener el valor de la variable  precio
     * @return this.precio
     */
    public int obtener_precio(){
        return precio;
    }

    /**
     * Método para obtener el valor de la variable caracteristicas
     * @return this.caracteristicas
     */
    public String obtener_caracteristicas(){
        return caracteristicas;
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
     * Método para actualizar la variable sistema operativo
     * @param sistema_operativo
     */
    public void actualizar_sistema_operativo(String sistema_operativo){
        //con el this hacemos referencia a variables globales
        this.sistema_operativo = sistema_operativo;
    }

    /**
     * Método para actualizar la variable precio
     * @param precio
     */
    public void actualizar_precio(int precio){
        //con el this hacemos referencia a variables globales
        this.precio = precio;
    }

    /**
     * Método para actualizar la variable caracteristicas
     * @param caracteristicas
     */
    public void actualizar_caracteristicas(String caracteristicas){
        //con el this hacemos referencia a variables globales
        this.caracteristicas = caracteristicas;
    }


}
