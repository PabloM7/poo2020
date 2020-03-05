package polimorfismovolumen;

public class Cubo extends Figura{
    //Atributos propios de la clase
    private double arista;

    public void setArista(double arista) {
        this.arista = arista;
    }

    /**
     * Implementacion del metodo abstracto que
     * fue definido en la clase padre
     */

    @Override
    public void calcular_volumen() {
        volumen = (Math.pow(arista,3));
    }
}
