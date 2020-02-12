package disenio_seleccion;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el nombre del empleado");
        String nombre = teclado.nextLine();
        System.out.println("Escriba el numero de horas que trabaja");
        double horas = teclado.nextDouble();
        System.out.println("Escriba el pago por hora");
        double pagoh = teclado.nextDouble();

        Empleado empleado = new Empleado(nombre, horas, pagoh);
        empleado.calcular_sueldo();
        empleado.PresentaNombre();
        empleado.PresentaSueldo();
    }
}
