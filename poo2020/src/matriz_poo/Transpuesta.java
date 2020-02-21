/**
 * Integrantes: Frank Saca, Pablo Montaño Jeferson Cueva, Isaias Silva
 */
package matrizPoo;

public class Transpuesta {
    private int columnas;
    private int filas;
    private int[][] matriz = new int [filas][columnas];


    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }


    public Transpuesta(int columnas, int filas, int[][] matriz){
        this.columnas = columnas;
        this.filas = filas;
        this.matriz = matriz;
    }

    public int[][] calcularMatrizTranspuesta(){
        int[][] matrizTranspuesta = new  int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTranspuesta;
    }
    public void obtenerMatriz(){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    public void obtenerMatrizTranspuesta(){
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(calcularMatrizTranspuesta()[i][j]);
            }
            System.out.println("");
        }
    }
}
