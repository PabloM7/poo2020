package arreglos_poo;

public class Array {
    private int[] vectorA = new int [10];
    private int[] vectorB = new int [10];
    private int sumatoria_producto;


    public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    public int getSumatoria_producto() {
        return sumatoria_producto;
    }

    public void setSumatoria_producto(int sumatoria_producto) {
        this.sumatoria_producto = sumatoria_producto;
    }



    public int calcular_sumatoria(){
        sumatoria_producto = 0;
        for (int i=0; i<vectorA.length; i++)
            sumatoria_producto = sumatoria_producto + (vectorA[i] * vectorB[i]);
        return sumatoria_producto;
    }
}
