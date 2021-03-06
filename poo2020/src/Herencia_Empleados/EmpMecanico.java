package Herencia_Empleados;

import java.util.Scanner;

public class EmpMecanico {
    private String nombre;
    private String departamento;
    private String puesto;
    private int trabajos_realizados;
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

    public int getTrabajos_realizados() {
        return trabajos_realizados;
    }

    public void setTrabajos_realizados(int trabajos_realizados) {
        this.trabajos_realizados = trabajos_realizados;
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
    public EmpMecanico (String nombre, String departamento, String puesto){
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
    }
    public void calcula_sueldo_mecanico (){
        System.out.println("Ingrese cuantos trabajos realizo: ");
        trabajos_realizados = teclado.nextInt();
        double cont = 0;
        for (int i = 0; i < trabajos_realizados; i++){
            System.out.println("Ingrese el costo de la reparación: "+(i+1));
            sueldo_quincenal = teclado.nextDouble();
            cont = cont + sueldo_quincenal;
        }
        cont = cont + (cont * 0.04);
        reporte = String.format("%s          %s          %s          %.2f\n",nombre,departamento,puesto,cont);
    }
    public String obtener_sueldo_mec(){
        return reporte;
    }
}
