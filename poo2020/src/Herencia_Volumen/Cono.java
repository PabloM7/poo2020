package Herencia_Volumen;

public class Cono extends Figura{
    private double radio;
    private double altura;
    private double volumen;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    public Cono(String nombre, double radio, double altura){
        this.nombre = nombre;
        this.radio = radio;
        this.altura = altura;
    }
    public void calcular_volumen(){
        volumen = (-0.333) * 3.14 * Math.pow(radio,2) * altura;
    }
    public double obtener_volumen(){
        return volumen;
    }
}
