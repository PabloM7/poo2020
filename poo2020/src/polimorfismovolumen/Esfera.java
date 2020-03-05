package polimorfismovolumen;

public class Esfera extends Figura {
    //Atributos propios de la clase
    private double radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Implementacion del metodo abstracto que
     * fue definido en la clase padre
     */

    @Override
    public void calcular_volumen() {
        volumen = (1.333 * 3.14 * Math.pow(radio,3));
    }
}
