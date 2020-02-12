package disenio_seleccion;

public class Dia {
    private String nombre;
    private int numero;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * Metodo para obtener el valor de la variable sueldo
     * @return dia
     */
    public Dia(int numero){
        this.numero = numero;
    }

    public void calcular_nombre(){
        switch (getNumero()) {
            case 1: nombre = "Lunes";
            break;
            case 2: nombre ="Martes";
            break;
            case 3: nombre ="Miercoles";
            break;
            case 4: nombre ="Jueves";
            break;
            case 5: nombre ="Viernes";
            break;
            case 6: nombre ="Sabado";
            break;
            case 7: nombre ="Domingo";
            break;
            default: nombre = "No valido";
        }

    }

    public String obtener_dia(){
        return nombre;
    }


}
