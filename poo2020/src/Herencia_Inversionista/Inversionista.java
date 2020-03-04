package Herencia_Inversionista;

public class Inversionista {
    protected int num_cliente;
    protected String nom_cliente;
    protected int num_cuenta;
    protected double capital_inv;
    protected double plazo_inv;
    protected double interes_anual;


    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNom_cliente() {
        return nom_cliente;
    }

    public void setNom_cliente(String nom_cliente) {
        this.nom_cliente = nom_cliente;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public double getCapital_inv() {
        return capital_inv;
    }

    public void setCapital_inv(double capital_inv) {
        this.capital_inv = capital_inv;
    }

    public double getPlazo_inv() {
        return plazo_inv;
    }

    public void setPlazo_inv(double plazo_inv) {
        this.plazo_inv = plazo_inv;
    }

    public double getInteres_anual() {
        return interes_anual;
    }

    public void setInteres_anual(double interes_anual) {
        this.interes_anual = interes_anual;
    }
}
