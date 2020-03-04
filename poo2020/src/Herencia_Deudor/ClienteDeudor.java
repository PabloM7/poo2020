package Herencia_Deudor;

public class ClienteDeudor {
    protected String nom_cliente;
    protected String num_cuenta;
    protected Double prestamo;
    protected int num_cliente;
    protected int plazo;

    public String getNom_cliente() {
        return nom_cliente;
    }

    public void setNom_cliente(String nom_cliente) {
        this.nom_cliente = nom_cliente;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public Double getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Double prestamo) {
        this.prestamo = prestamo;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
}
