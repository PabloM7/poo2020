package polimorfismoinversionistas;

public class CuentaAhorro extends Inversionista {


    /**
     * Metodo abstracto, que sera implementado
     * dentro de las clases hijas
     */

    @Override
    public void calcular_int_final() {
        int_anual = 0.15;
        setInteres_pg((int_anual * capital_inv * plazo));
    }
}
