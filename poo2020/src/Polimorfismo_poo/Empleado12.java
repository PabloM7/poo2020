package Polimorfismo_poo;

public abstract class Empleado12 {
    //Definicion de atributos protegidos para que puedan ser heredados
    protected String nombre;
    protected String departamento;
    protected String puesto;
    private double sueldo;

    /**
     * Metodo abstracto, que sera implementado
     * dentro de las clases hijas
     */

    public abstract void calcularSueldoQna();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
