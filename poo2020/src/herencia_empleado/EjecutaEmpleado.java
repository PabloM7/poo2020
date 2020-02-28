package herencia_empleado;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, cargo, dependecia;
        int horas;
        double pagohoras, sueldo;
        System.out.println("Empleado");
        System.out.println(" Escriba 1 para presentar el sueldo del empleado por hora ");
        System.out.println(" Digitar 2: para presentar el sueldo mensual del empleado ");
        int opc = teclado.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Ingrese el nombre: ");
                teclado.nextLine();
                nombre = teclado.nextLine();
                System.out.println("Ingrese el cargo: ");
                cargo = teclado.nextLine();
                System.out.println("Ingrese dependemcia: ");
                dependecia = teclado.nextLine();
                System.out.println("Ingrese las horas trabajadas: ");
                horas = teclado.nextInt();
                System.out.println("Ingrese la paga por hora : ");
                pagohoras = teclado.nextDouble();
                EmpleadoPorHoras empleadoHoras = new EmpleadoPorHoras(nombre, cargo, dependecia, horas, pagohoras);

                System.out.println("Datos empleado por horas");
                System.out.println("Nombre: " +empleadoHoras.getNombre());
                System.out.println("Cargo: " +empleadoHoras.getCargo());
                System.out.println("Dependencia: " +empleadoHoras.getDependencia());
                System.out.println("Sueldo: " +empleadoHoras.calcularsueldototal());
                break;

            case 2:
                System.out.println("Ingrese el nombre: ");
                teclado.nextLine();
                nombre = teclado.nextLine();
                System.out.println("Ingrese el cargo: ");
                cargo = teclado.nextLine();
                System.out.println("Ingrese dependencia: ");
                dependecia = teclado.nextLine();
                System.out.println("Ingrese valor mensual: ");
                sueldo = teclado.nextDouble();
                EmpleadoAsalariado empleadoAsal = new EmpleadoAsalariado(nombre, cargo, dependecia, sueldo);

                System.out.println("Datos empleado por mes");
                System.out.println("Nombre: " +empleadoAsal.getNombre());
                System.out.println("Cargo: " +empleadoAsal.getCargo());
                System.out.println("Dependencia: " +empleadoAsal.getDependencia());
                System.out.println("Sueldo: " +empleadoAsal.getSalario());

                break;
            default:
                System.out.println("No existe la opción");
        }
    }
}
