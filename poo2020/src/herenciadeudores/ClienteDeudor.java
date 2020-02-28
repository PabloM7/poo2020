package herenciadeudores;

public class ClienteDeudor {
    protected String nombre;
    protected int n_cliente;
    protected int n_cuenta;
    protected int plazo;
    protected double prestamo;
    protected double int_anual;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN_cliente() {
        return n_cliente;
    }

    public void setN_cliente(int n_cliente) {
        this.n_cliente = n_cliente;
    }

    public int getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(int n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(double prestamo) {
        this.prestamo = prestamo;
    }

    public double getInt_anual() {
        return int_anual;
    }

    public void setInt_anual(double int_anual) {
        this.int_anual = int_anual;
    }
}
