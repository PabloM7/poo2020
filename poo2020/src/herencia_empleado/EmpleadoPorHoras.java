package herencia_empleado;

public class EmpleadoPorHoras extends Empleado {
    private int horas;
    private double pagohoras;
    private double sueldo;

    /**
     * Metodo constructor
     * @param nombre
     * @param cargo
     * @param dependencia
     * @param horas
     * @param pagohoras
     */
    public EmpleadoPorHoras(String nombre, String cargo, String dependencia, int horas, double pagohoras){
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.setHoras(horas);
        this.setPagohoras(pagohoras);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getPagohoras() {
        return pagohoras;
    }

    public void setPagohoras(double pagohoras) {
        this.pagohoras = pagohoras;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public double calcularsueldototal(){
        sueldo = (horas * pagohoras);
        return sueldo;
    }
}
