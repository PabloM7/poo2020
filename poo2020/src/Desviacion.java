//Pablo Montaño
package arreglos_poo;

public class Desviacion {
    private int[] vector = new int [15];
    private int sumatoria;
    private double media;
    private double[] desviacion = new double[15];

    public Desviacion (int[] vector){
        this.vector=vector;
    }
    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(int sumatoria) {
        this.sumatoria = sumatoria;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double[] getDesviacion() {
        return desviacion;
    }

    public void setDesviacion(double[] desviacion) {
        this.desviacion = desviacion;
    }

    public void CalcularMedia(){
        sumatoria = 0;
        for (int i = 1; i<15;i++) {
            sumatoria += vector[i];
        }
        media=sumatoria/15;
    }

    public void CalcularDesviacion(){
        for (int i = 0; i<15;i++) {
            desviacion[i] = vector[i] - media;
        }
    }
    public void presentar(){
        System.out.println("Desviacion");
        for (int i=0; i<15;i++){
            System.out.println("  "+vector[i]+"      "+ desviacion[i]);
        }
        System.out.println("MEDIA = "+media);
    }
}
