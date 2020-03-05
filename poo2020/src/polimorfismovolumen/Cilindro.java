package polimorfismovolumen;

public class Cilindro extends Figura{
    //Atributos propios de la clase
    private double altura;
    private double radio;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    @Override
    public void calcular_volumen() {
        volumen = (3.14 * Math.pow(radio,2) * altura);
    }
}
