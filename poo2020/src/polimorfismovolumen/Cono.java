package polimorfismovolumen;

public class Cono extends Figura{
    //Atributos propios de la clase
    private double radio;
    private double altura;

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Implementacion del metodo abstracto que
     * fue definido en la clase padre
     */

    @Override
    public void calcular_volumen() {
        volumen = ((0.333) * 3.14 * Math.pow(radio,2) * altura);
    }
}
