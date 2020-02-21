package arreglosdeberpoo;

public class Binario {
    // Declaracion de variables
    private String numero;
    private int i;
    private int convertir;


    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    public Binario(String binario){
        this.numero = binario;
    }
    public void obtenerArray(){
        int numeroint = Integer.parseInt(numero);
        int[] vector = new int[6];
        int x = 5;
        for (int i = 0; i < vector.length ; i++) {
            vector[x] = (int)((numeroint/Math.pow(10,i))%10);
            x--;
        }
        x =5;
        for (int i = 0; i < vector.length; i++) {
            convertir = (int) (convertir+(vector[i] * Math.pow(2, x)));
            x--;
        }
    }
    public void obtenerDecimal(){
        System.out.println("El numero binario:"+numero+" en decimal es = "+ getConvertir() +" en decimal");
    }


    public int getConvertir() {
        return convertir;
    }

    public void setConvertir(int convertir) {
        this.convertir = convertir;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}