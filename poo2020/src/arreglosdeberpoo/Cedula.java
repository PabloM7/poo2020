package arreglosdeberpoo;

public class Cedula {
    private int cedula;
    private String estado;
    // Inicializacion de variable
    int validacion = 0;
    // Establecer los datos que el usuario debe ingresar
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cedula(int cedula){
        this.cedula = cedula;
    }
    // Metodo para validar la cedula
    public void validar() {
        // Arreglo que contiene los coeficientes
        int[] coeficientes = {2,1,2,1,2,1,2,1,2};
        // Inicializacion del estado de la cedula
        estado = "Cédula incorrecta";
        // Arreglo que almacena los numeros de la cedula
        int[] vector_cedula = new int[10];
        // Contador
        int x = 9;
        // Ciclo repetitivo para almacenar los datos de la cedula uno por uno
        for (int i = 0; i < vector_cedula.length ; i++) {
            // Se obtiene el ultimo valor de la cedula
            vector_cedula[x] = (int)((cedula/Math.pow(10,i))%10);
            x--;
        }
        // Inizializacion de la variable suma
        int suma = 0;
        // Variable local
        int sumatoria;
        // Ciclo repetitivo para obtener la suma de los productos entre los digitos de la cedula o los coeficientes
        for (int i = 0; i < (vector_cedula.length-1); i++){
            sumatoria = coeficientes[i] * vector_cedula[i];
            // Si son mayores que nueve se les restara nueve
            if (sumatoria > 9){
                sumatoria -= 9;
            }
            suma += sumatoria;
        }
        int residuo = suma%10;
        if(residuo != 0){
            validacion = 10 - residuo;
        }
        // condicional para validar la igualdad entre el valor encontrado y el ultimo digito
        if(validacion == vector_cedula[9]){
            estado = "El numero de cedula es correcto";
        }
    }
    // Netodo para obtener el numero de cedula
    public int obtenerCedula(){
        return cedula;
    }
    // Metodo para obtener el valor de la variable validacion
    public int obtenerValidador(){
        return validacion;
    }
    // Metodo para obtener el estado
    public String obtenerEstado(){
        return estado;
    }
}
