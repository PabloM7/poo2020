package TallerUno;

public class Docente {

    //definicion de atributos globales
    private String materia;
    private int horario;
    private String departamento;
    private String nombre;
    private String lugar_trabajo;

    /**
     * Método para obtener el valor de la variable materia
     * @return this.materia
     */
    public String obtener_materia(){
        return materia;
    }

    /**
     * Método para obtener el valor de la variable horario
     * @return this.horario
     */
    public int obtener_horario(){
        return horario;
    }

    /**
     * Método para obtener el valor de la variable departamento
     * @return this.departamento
     */
    public String obtener_departamento(){
        return departamento;
    }

    /**
     * Método para obtener el valor de la variable nombre
     * @return this.nombre
     */
    public String obtener_nombre(){
        return nombre;
    }

    /**
     * Método para obtener el valor de la variable lugar_trabajo
     * @return this.lugar_trabajo
     */
    public String obtener_lugar_trabajo(){
        return lugar_trabajo;
    }

    /**
     * Método para actualizar la variable materia
     * @param
     */
    public void actualizar_materia(String materia){
        //con el this hacemos referencia a variables globales
        this.materia = materia;
    }

    /**
     * Método para actualizar la variable horario
     * @param horario
     */
    public void actualizar_horario(int horario){
        //con el this hacemos referencia a variables globales
        this.horario = horario;
    }

    /**
     * Método para actualizar la variable departamento
     * @param departamento
     */
    public void actualizar_departamento(String departamento){
        //con el this hacemos referencia a variables globales
        this.departamento = departamento;
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
     * Método para actualizar la variable lugar_trabajo
     * @param lugar_trabajo
     */
    public void actualizar_lugar_trabajo(String lugar_trabajo){
        //con el this hacemos referencia a variables globales
        this.lugar_trabajo = lugar_trabajo;
    }

}
