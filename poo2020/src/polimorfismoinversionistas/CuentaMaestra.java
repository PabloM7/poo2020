package polimorfismoinversionistas;

public class CuentaMaestra extends Inversionista{

    /**
     * Metodo abstracto, que sera implementado
     * dentro de las clases hijas
     */

    @Override
    public void calcular_int_final() {
        int_anual = 0.12;
        setInteres_pg((capital_inv * int_anual * plazo));
    }
}
