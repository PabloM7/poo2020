package arreglos_poo;

public class Suma {
    private int[] vectorA = new int[10];
    private int[] vectorB = new int[10];
    private int[] vectorC = new int[10];
    public Suma(int vectorA[], int vectorB[]){
        this.setVectorA(vectorA);
        this.setVectorB(vectorB);
    }

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

    public int[] getVectorC() {
        return vectorC;
    }

    public void setVectorC(int[] vectorC) {
        this.vectorC = vectorC;
    }
    public void suma(){
        for (int i=0; i<10;i++){
            vectorC[i] = vectorA[i]+vectorB[i];
        }
    }
    public void resultado(){
        System.out.println("Los arreglos son: ");
        for(int i=0;i<10; i++){
            System.out.println("   "+vectorA[i]+"   "+vectorB[i]+vector);
        }
    }
}
