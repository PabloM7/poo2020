package polimorfismoinversionistas;

public class Pagare extends Inversionista{

    /**
     * Metodo abstracto, que sera implementado
     * dentro de las clases hijas
     */

    @Override
    public void calcular_int_final() {
        int_anual = 0.18;
        interes_pg = (capital_inv * int_anual * plazo);
    }
}
