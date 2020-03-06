package polimorfismodeudores;

public class PrestamoAuto1 extends ClienteDeudor1{

    /**
     * Metodo abstracto, que sera implementado
     * dentro de las clases hijas
     */

    @Override
    public void calcular_int_final() {
       int_anual = 0.12;
       interes_pg = int_anual * prestamo * plazo;
    }
}
