package Herencia_Empleados;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String departamento;
        String puesto;
        double sueldo_mensual;
        String administrativo = "", mecanico = "", vendedor = "";
        int op;
        String opc;
        do {
            do {
                System.out.println("| Ingrese que tipo de empleado es |");
                System.out.println("-------------------------------------");
                System.out.println("| 1. Administrativo  | ");
                System.out.println("| 2. Mecanico        | ");
                System.out.println("| 3. Vendedor        | ");
                System.out.println("-------------------------------------");
                op = teclado.nextInt();
            }while(op > 3 || op < 1);
            switch (op) {
                case 1:
                    System.out.print("Ingrese nombre del empleado: ");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    System.out.print("Ingrese departamento al que pertenece: ");
                    departamento = teclado.nextLine();
                    System.out.print("Ingrese puesto que ocupa: ");
                    puesto = teclado.nextLine();
                    System.out.print("Ingrese su sueldo mensual: ");
                    sueldo_mensual = teclado.nextDouble();
                    EmpAdmvo empAdmvo = new EmpAdmvo(nombre, departamento, puesto, sueldo_mensual);
                    empAdmvo.calcular_sueldo_adm();
                    administrativo = String.format("%s%s", administrativo, empAdmvo.obtener_sueldo_adm());
                    teclado.nextLine();
                    break;
                case 2:
                    System.out.print("Ingrese nombre del empleado: ");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    System.out.print("Ingrese departamento al que pertenece: ");
                    departamento = teclado.nextLine();
                    System.out.print("Ingrese puesto que ocupa: ");
                    puesto = teclado.nextLine();
                    EmpMecanico empMecanico = new EmpMecanico(nombre, departamento, puesto);
                    empMecanico.calcula_sueldo_mecanico();
                    mecanico = String.format("%s%s",mecanico, empMecanico.obtener_sueldo_mec());
                    break;
                case 3:
                    System.out.print("Ingrese nombre del empleado: ");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    System.out.print("Ingrese departamento al que pertenece: ");
                    departamento = teclado.nextLine();
                    System.out.print("Ingrese puesto que ocupa: ");
                    puesto = teclado.nextLine();
                    EmpVendedor empVendedor = new EmpVendedor(nombre, departamento, puesto);
                    empVendedor.calcula_sueldo_vendedor();
                    vendedor = String.format("%s%s", vendedor, empVendedor.obtener_sueldo_ven());
                    break;
            }
            System.out.println("Presione 's' para ingresar otro empleado u otra tecla para mostrar el reporte");
            opc = teclado.nextLine();
        } while (opc.toLowerCase().equals("s"));
        System.out.println("  ------------REPORTE DE NOMINA QUINCENAL------------\n" +
                "Nombre      Departamento        Puesto       Saldo Quincenal\n" +
                "____________________________________________________________________\n"
                + administrativo + mecanico + vendedor +
                "____________________________________________________________________\n")
        ;
    }
}