package Polimorfismo_Figura;

public class Rectangulo3 extends Figura3{
    //Atributos propios de la clase
    private double baseRecta;
    private double alturaRecta;

    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }

    /**
     * Implementacion del metodo abstracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcular_area() {
        setArea(baseRecta*alturaRecta);
    }
}
