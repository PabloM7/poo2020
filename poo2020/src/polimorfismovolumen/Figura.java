package polimorfismovolumen;

public abstract class Figura {
    //Definicion de atributos propios de la clase
    protected String nomFigura;
    protected double volumen;

    /**
     * Metodo abstracto, que sera implementado
     * dentro de las clases hijas
     */

    public abstract void calcular_volumen();

    public String getNomFigura() {
        return nomFigura;
    }

    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double area) {
        this.volumen = volumen;
    }
}
