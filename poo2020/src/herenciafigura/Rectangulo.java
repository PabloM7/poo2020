package herenciafigura;

public class Rectangulo extends Figura{
    public Rectangulo(String nombre, double base_r, double altura_r){
        this.nombre = nombre;
        this.base_r = base_r;
        this.altura_r = altura_r;
    }
    private double base_r;
    private double altura_r;
    private double area_r;

    public double getBase_r() {
        return base_r;
    }

    public void setBase_r(double base_r) {
        this.base_r = base_r;
    }

    public double getAltura_r() {
        return altura_r;
    }

    public void setAltura_r(double altura_r) {
        this.altura_r = altura_r;
    }

    public double getArea_r() {
        return area_r;
    }

    public void setArea_r(double area_r) {
        this.area_r = area_r;
    }
    public double calcular_area_r(){
        area_r = base_r * altura_r;
        return area_r;
    }
}
