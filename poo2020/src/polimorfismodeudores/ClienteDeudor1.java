package polimorfismodeudores;

public abstract class ClienteDeudor1 {
    protected String nombre_cliente;
    protected int num_cliente;
    protected int num_cuenta;
    protected int prestamo;
    protected int plazo;
    protected double int_anual;
    protected double interes_pg;

    /**
     * Metodo abstracto, que sera implementado
     * dentro de las clases hijas
     */

    public abstract void calcular_int_final();

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
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

    public int getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(int prestamo) {
        this.prestamo = prestamo;
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
