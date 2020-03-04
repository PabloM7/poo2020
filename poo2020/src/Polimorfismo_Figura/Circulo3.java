package Polimorfismo_Figura;

public class Circulo3 extends Figura3{
    //Atributos propios de la clase
    private double radioCirc;

    public void setRadioCirc(double radioCirc) {
        this.radioCirc = radioCirc;
    }

    /**
     * Implementacion del metodo abstracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcular_area() {
        setArea(3.14*(radioCirc*radioCirc));
    }
}
