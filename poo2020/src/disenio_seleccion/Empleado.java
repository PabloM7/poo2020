package disenio_seleccion;

public class Empleado {
    private String nombre;
    private double horas;
    private double pagoh;
    private double sueldo;

    public Empleado(String nombre, double horas, double pagoh){
        this.setNombre(nombre);
        this.setHoras(horas);
        this.setPagoh(pagoh);
        this.setSueldo(sueldo);
    }

    /**
     * Metodo para obtener el valor de la variable sueldo
     * @return sueldo
     */

    public void calcular_sueldo(){
        if (horas <= 40)
            sueldo = horas*pagoh;
        else
            sueldo = (40*pagoh)+((horas - 40)*(pagoh*2));
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getPagoh() {
        return pagoh;
    }

    public void setPagoh(double pagoh) {
        this.pagoh = pagoh;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public void PresentaNombre(){
        System.out.println("El nombre del empleado es: "+nombre);
    }
    public void PresentaSueldo(){
        System.out.println("El sueldo es: "+sueldo);
    }
}
