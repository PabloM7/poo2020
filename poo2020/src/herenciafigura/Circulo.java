package herenciafigura;

public class Circulo extends Figura{
    public Circulo(String nombre, double radio){
        this.nombre = nombre;
        this.radio = radio;
    }
    private double radio;
    private double area_cir;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea_cir() {
        return area_cir;
    }

    public void setArea_cir(double area_cir) {
        this.area_cir = area_cir;
    }
    public double calcular_area_cir(){
        area_cir = 3.14 *(radio*radio);
        return area_cir;
    }
}
