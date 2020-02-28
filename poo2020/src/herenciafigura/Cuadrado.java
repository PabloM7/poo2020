package herenciafigura;

public class Cuadrado extends Figura{
    public Cuadrado(String nombre, double lado){
        this.nombre = nombre;
        this.lado = lado;
    }
    private double lado;
    private double area_c;


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea_c() {
        return area_c;
    }

    public void setArea_c(double area_c) {
        this.area_c = area_c;
    }
    double calcular_area_c(){
        area_c = lado * lado;
        return area_c;
    }
}
