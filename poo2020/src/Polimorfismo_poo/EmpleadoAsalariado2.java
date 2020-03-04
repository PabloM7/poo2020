package Polimorfismo_poo;

public class EmpleadoAsalariado2 extends Empleado12{
    private double sueldo_mensual;

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    /**
     * Implementacion del metodo abstracto que
     * fue definido en la clase padre
     */

    @Override
    public void calcularSueldoQna() {
        setSueldo(sueldo_mensual/2);
    }

}
