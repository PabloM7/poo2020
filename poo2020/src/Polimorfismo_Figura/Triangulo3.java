package Polimorfismo_Figura;

public class Triangulo3 extends Figura3{
    //Atributos propios de la clase
    private double baseTria;
    private double alturaTria;

    public void setBaseTria(double baseTria) {
        this.baseTria = baseTria;
    }

    public void setAlturaTria(double alturaTria) {
        this.alturaTria = alturaTria;
    }

    /**
     * Implementacion del metodo abstracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcular_area() {
        setArea((baseTria*alturaTria)/2);
    }
}
