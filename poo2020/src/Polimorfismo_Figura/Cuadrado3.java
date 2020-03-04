package Polimorfismo_Figura;

public class Cuadrado3 extends Figura3{
    //Atributos propios de la clase
    private double ladoCuad;

    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }

    /**
     * Implementacion del metodo abstracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcular_area() {
        setArea(ladoCuad*ladoCuad);
    }
}
