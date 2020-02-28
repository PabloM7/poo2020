package herenciafigura;

public class Triangulo extends Figura{
    public Triangulo(String nombre, double base_t, double altura_t){
        this.nombre = nombre;
        this.base_t =base_t;
        this.altura_t = altura_t;
    }
    private double base_t;
    private double altura_t;
    private double area_t;

    public double getBase_t() {
        return base_t;
    }

    public void setBase_t(double base_t) {
        this.base_t = base_t;
    }

    public double getAltura_t() {
        return altura_t;
    }

    public void setAltura_t(double altura_t) {
        this.altura_t = altura_t;
    }

    public double getArea_t() {
        return area_t;
    }

    public void setArea_t(double area_t) {
        this.area_t = area_t;
    }
    public double calcular_area_t(){
        area_t = (base_t * altura_t)/2;
        return area_t;
    }
}
