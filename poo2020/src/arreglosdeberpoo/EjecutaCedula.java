package arreglosdeberpoo;
import java.util.Scanner;
public class EjecutaCedula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su numero de cedula: ");
        int cedula = entrada.nextInt();
        Cedula ciudadania = new Cedula(cedula);
        ciudadania.validar();
        System.out.println(ciudadania.obtenerCedula());
        System.out.println(ciudadania.obtenerValidador());
        System.out.println(ciudadania.obtenerEstado());
    }
}
