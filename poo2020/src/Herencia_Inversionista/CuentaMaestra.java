package Herencia_Inversionista;

public class CuentaMaestra extends Inversionista {
    private double interes_maestra;

    public double getInteres_maestra() {
        return interes_maestra;
    }

    public void setInteres_maestra(double interes_maestra) {
        this.interes_maestra = interes_maestra;
    }

    public CuentaMaestra(String nom_cliente, int num_cliente, int num_cuenta, double capital_inv, double plazo_inv, double interes_anual) {
        this.nom_cliente = nom_cliente;
        this.num_cliente = num_cliente;
        this.num_cuenta = num_cuenta;
        this.capital_inv = capital_inv;
        this.plazo_inv = plazo_inv;
        this.interes_anual = interes_anual;
    }
    public double calcular_interes_maestra(){
        interes_anual = 0.18;
        interes_maestra = capital_inv * interes_anual * plazo_inv;
        return interes_maestra;
    }
}
