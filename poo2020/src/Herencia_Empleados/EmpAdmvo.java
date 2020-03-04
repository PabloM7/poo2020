package Herencia_Empleados;

public class EmpAdmvo {
    private String nombre;
    private String departamento;
    private String puesto;
    private double sueldo_mensual;
    private double sueldo_quincenal;
    private String reporte;

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

    public double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    public double getSueldo_quincenal() {
        return sueldo_quincenal;
    }

    public void setSueldo_quincenal(double sueldo_quincenal) {
        this.sueldo_quincenal = sueldo_quincenal;
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
    }
    public EmpAdmvo(String nombre, String departamento, String puesto, double sueldo_mensual){
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.sueldo_mensual = sueldo_mensual;
    }
    public void calcular_sueldo_adm(){
        sueldo_quincenal = sueldo_mensual /2;
        reporte = String.format("%s          %s          %s          %.2f\n",nombre,departamento,puesto,sueldo_quincenal);
    }
    public String obtener_sueldo_adm(){
        return reporte;
    }
}
