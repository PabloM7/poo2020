package matriz_poo;

public class Matriz {
    //Declaracion de variables
    private int[][] a = new int[3][3];
    private int[][] b = new int[3][3];
    private int[][] c = new int[3][3];

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }

    public int[][] getB() {
        return b;
    }

    public void setB(int[][] b) {
        this.b = b;
    }

    public int[][] getC() {
        return c;
    }

    public void setC(int[][] c) {
        this.c = c;
    }

    //Metodo Constructor
    public Matriz(int[][] a, int[][] b) {
        this.a = a;
        this.b = b;
    }

    //Metodo para calcular la suma de las matrices a y b
    public int[][] calcular_matriz_c() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    //Metodo para presentar la matriz c
    public void obtenerResultado(int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

}