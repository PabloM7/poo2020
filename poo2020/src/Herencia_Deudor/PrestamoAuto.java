package Herencia_Deudor;

public class PrestamoAuto extends ClienteDeudor{
    private double interes_anual;
    private double pago_final;
    private String reporte;


    public double getInteres_anual() {
        return interes_anual;
    }

    public void setInteres_anual(double interes_anual) {
        this.interes_anual = interes_anual;
    }

    public double getPago_final() {
        return pago_final;
    }

    public void setPago_final(double pago_final) {
        this.pago_final = pago_final;
    }
    public PrestamoAuto(int num_cliente, String nom_cliente, String num_cuenta,double prestamo, int plazo){
        this.num_cliente = num_cliente;
        this.nom_cliente = nom_cliente;
        this.num_cuenta = num_cuenta;
        this.prestamo = prestamo;
        this.plazo = plazo;
    }
    public void calcular_pago_final(){
        interes_anual = 0.15;
        pago_final = prestamo * interes_anual * plazo;
        reporte = String.format("%d                 %s                %s                 %.2f\n",num_cliente,nom_cliente,num_cuenta,pago_final);
    }
    public String obtener_reporte(){
        return reporte;
    }
}
