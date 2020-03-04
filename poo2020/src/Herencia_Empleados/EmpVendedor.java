package Herencia_Empleados;

import java.util.Scanner;

public class EmpVendedor {
    private String nombre;
    private String departamento;
    private String puesto;
    private int autos_vendidos;
    private double sueldo_quincenal;
    private String reporte;
    private Scanner teclado = new Scanner(System.in);

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

    public int getAutos_vendidos() {
        return autos_vendidos;
    }

    public void setAutos_vendidos(int autos_vendidos) {
        this.autos_vendidos = autos_vendidos;
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

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }
    public EmpVendedor (String nombre, String departamento, String puesto){
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
    }
    public void calcula_sueldo_vendedor (){
        System.out.println("Ingrese cuantos autos vendió: ");
        autos_vendidos = teclado.nextInt();
        double cont =0;
        double aux = 0;
        for (int i=0; i < autos_vendidos; i++){
            System.out.println("Ingrese el costo del auto "+(i+1));
            sueldo_quincenal= teclado.nextDouble();
            aux += sueldo_quincenal;
        }
        cont = 400 + (aux * 0.02);
        reporte = String.format("%s          %s          %s          %.2f\n",nombre,departamento,puesto,cont);
    }
    public String obtener_sueldo_ven(){
        return reporte;
    }
}
