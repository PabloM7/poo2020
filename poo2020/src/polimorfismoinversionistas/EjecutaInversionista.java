package polimorfismoinversionistas;

import java.util.Scanner;

public class EjecutaInversionista {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean salir = true;
        while (salir == true) {
            // Menú para ingreso de datos
            System.out.println("1. Opcion 1: Para calcular el interes de la Cuenta de Ahorro");
            System.out.println("2. Opcion 2: Para calcular el interes de la Cuenta de Pagaré");
            System.out.println("3. Opcion 3: Para calcular el interes de la Cuenta  Maestra");
            System.out.println("Escribe una de las opciones");
            int opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    CuentaAhorro cuentaAhorro = new CuentaAhorro();
                    System.out.println("Escriba el numero del cliente");
                    cuentaAhorro.setNum_cliente(teclado.nextInt());
                    System.out.println("Escriba el nombre del cliente");
                    teclado.nextLine();
                    cuentaAhorro.setNom_cliente(teclado.nextLine());
                    System.out.println("Escriba el numero de la cuenta");
                    cuentaAhorro.setNum_cuenta(teclado.nextInt());
                    System.out.println("Escriba el capital invertido");
                    cuentaAhorro.setCapital_inv(teclado.nextInt());
                    System.out.println("Escriba el plazo de inversion en años");
                    cuentaAhorro.setPlazo(teclado.nextInt());
                    cuentaAhorro.calcular_int_final();
                    System.out.println("Reporte de inversion: " + " --- Numero de cliente: " + cuentaAhorro.getNum_cliente() + " --- Nombre del cliente: " + cuentaAhorro.getNom_cliente() + " --- Numero de cuenta: "
                            + cuentaAhorro.getNum_cuenta() + " --- Interes ganado: " + cuentaAhorro.getInteres_pg());
                    break;
                case 2:
                    CuentaMaestra cuentaMaestra = new CuentaMaestra();
                    System.out.println("Escriba el numero del cliente");
                    cuentaMaestra.setNum_cliente(teclado.nextInt());
                    System.out.println("Escriba el nombre del cliente");
                    teclado.nextLine();
                    cuentaMaestra.setNom_cliente(teclado.nextLine());
                    System.out.println("Escriba el numero de la cuenta");
                    cuentaMaestra.setNum_cuenta(teclado.nextInt());
                    System.out.println("Escriba el capital invertido");
                    cuentaMaestra.setCapital_inv(teclado.nextInt());
                    System.out.println("Escriba el plazo de inversion en años");
                    cuentaMaestra.setPlazo(teclado.nextInt());
                    cuentaMaestra.calcular_int_final();
                    System.out.println("Reporte de inversion: " + " --- Numero de cliente: " + cuentaMaestra.getNum_cliente() + " --- Nombre del cliente: " + cuentaMaestra.getNom_cliente() + " --- Numero de cuenta: "
                            + cuentaMaestra.getNum_cuenta() + " --- Interes ganado: " + cuentaMaestra.getInteres_pg());
                    break;
                case 3:
                    Pagare pagare = new Pagare();
                    System.out.println("Escriba el numero del cliente");
                    pagare.setNum_cliente(teclado.nextInt());
                    System.out.println("Escriba el nombre del cliente");
                    teclado.nextLine();
                    pagare.setNom_cliente(teclado.nextLine());
                    System.out.println("Escriba el numero de la cuenta");
                    pagare.setNum_cuenta(teclado.nextInt());
                    System.out.println("Escriba el capital invertido");
                    pagare.setCapital_inv(teclado.nextInt());
                    System.out.println("Escriba el plazo de inversion en años");
                    pagare.setPlazo(teclado.nextInt());
                    pagare.calcular_int_final();
                    System.out.println("Reporte de inversion: " + " --- Numero de cliente: " + pagare.getNum_cliente() + " --- Nombre del cliente: " + pagare.getNom_cliente() + " --- Numero de cuenta: "
                            + pagare.getNum_cuenta() + " --- Interes ganado: " + pagare.getInteres_pg());
                    break;
            }
            teclado.nextLine();
            System.out.println("Desea seguir calculando a los inversionistas Ingrese Si/No");
            String cancelar = teclado.nextLine().toUpperCase();
            if (cancelar.equals("NO")) {
                opc = 5;
                salir = false;
            } else {
                System.out.println();
                opc = 4;

            }
        }
    }
}
