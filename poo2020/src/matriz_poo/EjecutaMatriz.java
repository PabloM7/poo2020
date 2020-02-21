package matriz_poo;

import java.util.Scanner;

public class EjecutaMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Declaracion de variables
        int [][]a = new int[3][3];
        int [][]b = new int[3][3];
        for (int i=0; i<a.length;i++){
            for(int j=0; j<a.length;j++){
                System.out.println("Ingrese el valor de la matriz a en la posicion: "+"["+i+"]"+" ["+j+"]");
                a[i][j]= teclado.nextInt();
            }
        }
        for (int i=0; i<b.length;i++){
            for(int j=0; j<b.length;j++){
                System.out.println("Ingrese el valor de la matriz b en la posicion: "+"["+i+"]"+" ["+j+"]");
                b[i][j]= teclado.nextInt();
            }
        }
        //Crear objeto
        Matriz matriz = new Matriz(a,b);
        //Calcular la matriz c(suma de las matrices a y b)
        matriz.calcular_matriz_c();
        //Presentacion de la matriz a
        System.out.println("Matriz a");
        matriz.obtenerResultado(a);
        //Presentacion de la matriz b
        System.out.println("Matriz b");
        matriz.obtenerResultado(b);
        //Presentacion de la matriz c
        System.out.println("Matriz c");
        matriz.obtenerResultado(matriz.calcular_matriz_c());
    }
}
