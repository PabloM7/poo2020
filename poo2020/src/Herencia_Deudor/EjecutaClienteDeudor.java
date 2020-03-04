package Herencia_Deudor;

import java.util.Scanner;

public class EjecutaClienteDeudor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nom_cliente, num_cuenta, op, reporteP = "", reporteH = "", reporteA = "";
        double prestamo;
        int total = 0;
        int num_cliente1 = 0, num_cliente2 = 0, num_cliente3 = 0, plazo,i;
        do {
            total ++;
            System.out.print("Ingrese el nombre: ");
            nom_cliente = entrada.nextLine();
            System.out.print("Ingrese el numero de cuenta: ");
            num_cuenta = entrada.nextLine();
            System.out.print("Ingrese el capital: ");
            prestamo = entrada.nextDouble();
            System.out.print("Ingrese el plazo anual: ");
            plazo = entrada.nextInt();
            do{
                // Menu para pedir lo que el usuario desea
                System.out.println("Elija el tipo de prestamo  ");
                System.out.println(" 1) Prestamo personal");
                System.out.println(" 2) Prestamo hipotecario");
                System.out.println(" 3) Prestamo auto");
                i = entrada.nextInt();
            }while(i > 3 || i < 1);
            switch (i) {
                case 1:
                    // Prestamo personal
                    num_cliente1++;
                    PrestamoPersonal personal = new PrestamoPersonal(num_cliente1, nom_cliente, num_cuenta, prestamo, plazo);
                    personal.calcular_pago_final();
                    reporteP = String.format("%s%s", reporteP,personal.obtener_reporte());
                    break;
                case 2:
                    // Prestamo hipotecario
                    num_cliente2++;
                    PrestamoHipotecario hipotecario = new PrestamoHipotecario(num_cliente2, nom_cliente, num_cuenta, prestamo, plazo);
                    hipotecario.calcular_pago_final();
                    reporteH = String.format("%s%s", reporteH,hipotecario.obtener_reporte());
                    break;
                case 3:
                    // Prestamo auto
                    num_cliente3++;
                    PrestamoAuto auto = new PrestamoAuto(num_cliente3, nom_cliente, num_cuenta, prestamo, plazo);
                    auto.calcular_pago_final();
                    reporteA = String.format("%s%s", reporteA,auto.obtener_reporte());
                    break;
            }
            entrada.nextLine();
            System.out.println("Presione 's' para ingresar otro cliente");
            op = entrada.nextLine();
        }while (op.toLowerCase().equals("s"));

        System.out.println("\tREPORTE DE CLIENTES DEUDORES\n"+
                "No. Cliente        Nombre        No. Cuenta        Interés por pagar\n"+
                "____________________________________________________________________\n"
                + reporteP + reporteH + reporteA +
                "____________________________________________________________________\n");
        System.out.println("TOTAL: "+total+" CLIENTES");
    }
}
