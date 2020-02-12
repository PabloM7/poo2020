package disenio_seleccion;

import java.util.Scanner;

public class EjecutaDia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el numero de dia que desea");
        int numero = teclado.nextInt();
        Dia dia = new Dia(numero);
        dia.calcular_nombre();
        System.out.println(dia.obtener_dia());

    }
}
