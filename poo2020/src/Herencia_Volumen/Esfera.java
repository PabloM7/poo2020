package Herencia_Volumen;

public class Esfera extends Figura{
    private double radio;
    private double volumen;

    public Esfera(String nombre, double radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public void calcular_volumen(){
        volumen = -1.333 * 3.14 * Math.pow(radio,3);
    }

    public double obtener_volumen(){
        return volumen;
    }
}
