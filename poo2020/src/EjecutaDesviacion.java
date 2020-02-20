package arreglos_poo;

import java.util.Scanner;

public class EjecutaDesviacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[15];
        for (int i=0;i<15; i++) {
            System.out.println("Ingrese el valor de la posicion: " + (i + 1) + " :");
            vector[i] = teclado.nextInt();
        }
        Desviacion vector1 = new Desviacion(vector);
        vector1.CalcularMedia();
        vector1.CalcularDesviacion();
        vector1.presentar();
    }

}
