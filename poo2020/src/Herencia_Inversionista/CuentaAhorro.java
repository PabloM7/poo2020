package Herencia_Inversionista;

public class CuentaAhorro extends Inversionista{
    private double interes_ahorro;

    public double getInteres_ahorro() {
        return interes_ahorro;
    }

    public void setInteres_ahorro(double interes_ahorro) {
        this.interes_ahorro = interes_ahorro;
    }
    public CuentaAhorro(String nom_cliente, int num_cliente, int num_cuenta, double capital_inv, double plazo_inv, double interes_anual) {
        this.nom_cliente = nom_cliente;
        this.num_cliente = num_cliente;
        this.num_cuenta = num_cuenta;
        this.capital_inv = capital_inv;
        this.plazo_inv = plazo_inv;
        this. interes_anual = interes_anual;
    }
    public double calcular_interes_ahorro(){
        interes_anual = 0.12;
        interes_anual = capital_inv * interes_anual * plazo_inv;
        return interes_ahorro;
    }
}
