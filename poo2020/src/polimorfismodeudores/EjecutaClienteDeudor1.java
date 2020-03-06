package polimorfismodeudores;

import java.util.Scanner;

public class EjecutaClienteDeudor1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = true;
        while (salir == true) {
            // Menú para ingreso de datos
            System.out.println("1. Opcion 1: Para calcular el interes del prestamo del auto");
            System.out.println("2. Opcion 2: Para calcular el interes del prestamo hipotecario");
            System.out.println("3. Opcion 3: Para calcular el interes del prestamo personal");
            System.out.println("Escribe una de las opciones");
            int opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    PrestamoAuto1 prestamoAuto1 = new PrestamoAuto1();
                    System.out.println("Escriba el numero del cliente");
                    prestamoAuto1.setNum_cliente(teclado.nextInt());
                    System.out.println("Escriba el nombre del cliente");
                    teclado.nextLine();
                    prestamoAuto1.setNombre_cliente(teclado.nextLine());
                    System.out.println("Escriba el numero de la cuenta");
                    prestamoAuto1.setNum_cuenta(teclado.nextInt());
                    System.out.println("Escriba el monto del prestamo");
                    prestamoAuto1.setPrestamo(teclado.nextInt());
                    System.out.println("Escriba el plazo del prestamo en años");
                    prestamoAuto1.setPlazo(teclado.nextInt());
                    prestamoAuto1.calcular_int_final();
                    System.out.println("Reporte de inversion: " + " --- Numero de cliente: " + prestamoAuto1.getNum_cliente() + " --- Nombre del cliente: " + prestamoAuto1.getNombre_cliente() + " --- Numero de cuenta: "
                            + prestamoAuto1.getNum_cuenta() + " --- Interes a pagar: " + prestamoAuto1.getInteres_pg());
                    break;
                case 2:
                    PrestamoHipotecario1 prestamoHipotecario1 = new PrestamoHipotecario1();
                    System.out.println("Escriba el numero del cliente");
                    prestamoHipotecario1.setNum_cliente(teclado.nextInt());
                    System.out.println("Escriba el nombre del cliente");
                    teclado.nextLine();
                    prestamoHipotecario1.setNombre_cliente(teclado.nextLine());
                    System.out.println("Escriba el numero de la cuenta");
                    prestamoHipotecario1.setNum_cuenta(teclado.nextInt());
                    System.out.println("Escriba el capital invertido");
                    prestamoHipotecario1.setPrestamo(teclado.nextInt());
                    System.out.println("Escriba el plazo del prestamo en años");
                    prestamoHipotecario1.setPlazo(teclado.nextInt());
                    prestamoHipotecario1.calcular_int_final();
                    System.out.println("Reporte de inversion: " + " --- Numero de cliente: " + prestamoHipotecario1.getNum_cliente() + " --- Nombre del cliente: " + prestamoHipotecario1.getNombre_cliente() + " --- Numero de cuenta: "
                            + prestamoHipotecario1.getNum_cuenta() + " --- Interes a pagar: " + prestamoHipotecario1.getInteres_pg());
                    break;
                case 3:
                    PrestamoPersonal1 prestamoPersonal1 = new PrestamoPersonal1();
                    System.out.println("Escriba el numero del cliente");
                    prestamoPersonal1.setNum_cliente(teclado.nextInt());
                    System.out.println("Escriba el nombre del cliente");
                    teclado.nextLine();
                    prestamoPersonal1.setNombre_cliente(teclado.nextLine());
                    System.out.println("Escriba el numero de la cuenta");
                    prestamoPersonal1.setNum_cuenta(teclado.nextInt());
                    System.out.println("Escriba el capital invertido");
                    prestamoPersonal1.setPrestamo(teclado.nextInt());
                    System.out.println("Escriba el plazo del prestamo en años");
                    prestamoPersonal1.setPlazo(teclado.nextInt());
                    prestamoPersonal1.calcular_int_final();
                    System.out.println("Reporte de inversion: " + " --- Numero de cliente: " + prestamoPersonal1.getNum_cliente() + " --- Nombre del cliente: " + prestamoPersonal1.getNombre_cliente() + " --- Numero de cuenta: "
                            + prestamoPersonal1.getNum_cuenta() + " --- Interes a pagar: " + prestamoPersonal1.getInteres_pg());
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
