package Polimorfismo_Figura;

public abstract class Figura3 {
    //Definicion de atributos protegidos que puedan ser heredados
    private String nomFigura;
    private double area;

    /**
     * Metodo abstracto, que sera implementado
     * dentro de las clases hijas
     */

    public abstract void calcular_area();

    public String getNomFigura() {
        return nomFigura;
    }

    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
