package Herencia_Inversionista;

public class Pagare extends Inversionista{
    private double interes_pagare;

    public double getInteres_pagare() {
        return interes_pagare;
    }

    public void setInteres_pagare(double interes_pagare) {
        this.interes_pagare = interes_pagare;
    }
    public Pagare(String nom_cliente, int num_cliente, int num_cuenta, double capital_inv, double plazo_inv, double interes_anual) {
        this.nom_cliente = nom_cliente;
        this.num_cliente = num_cliente;
        this.num_cuenta = num_cuenta;
        this.capital_inv = capital_inv;
        this.plazo_inv = plazo_inv;
        this.interes_anual = interes_anual;
    }
    public double calcular_interes_pagare(){
        interes_anual = 0.10;
        interes_pagare = capital_inv * interes_anual * plazo_inv;
        return interes_pagare;
    }
}
