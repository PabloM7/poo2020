package polimorfismoinversionistas;

public abstract class Inversionista {
    //Definicion de atributos propios de la clase
    protected String nom_cliente;
    protected int num_cliente;
    protected int num_cuenta;
    protected int capital_inv;
    protected int plazo;
    protected double int_anual;
    protected double interes_pg;


    /**
     * Metodo abstracto, que sera implementado
     * dentro de las clases hijas
     */

    public abstract void calcular_int_final();

    public String getNom_cliente() {
        return nom_cliente;
    }

    public void setNom_cliente(String nom_cliente) {
        this.nom_cliente = nom_cliente;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public int getCapital_inv() {
        return capital_inv;
    }

    public void setCapital_inv(int capital_inv) {
        this.capital_inv = capital_inv;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getInt_anual() {
        return int_anual;
    }

    public void setInt_anual(double int_anual) {
        this.int_anual = int_anual;
    }

    public double getInteres_pg() {
        return interes_pg;
    }

    public void setInteres_pg(double interes_pg) {
        this.interes_pg = interes_pg;
    }
}
