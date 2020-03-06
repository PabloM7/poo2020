package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> nombres = new ArrayList<String>();
        boolean salir = true;
        System.out.println("Escriba la opcion que desea");
        while (salir == true) {
            System.out.println("1. Agregar un nuevo nombre a la lista");
            System.out.println("2. Presentar la lista de nombres");
            System.out.println("3. Salir");
            int opc = teclado.nextInt();
            teclado.nextLine();

            switch (opc){
                case 1:
                    System.out.println("Ingrese el nombre que desea agregar");
                    String nombre = teclado.nextLine();
                    nombres.add(nombre);
                    break;
                case 2:
                    System.out.println("La lista de nombres es: ");
                    for (int cont = 0; cont < nombres.size(); cont++){
                        System.out.println(nombres.get(cont));
                    }
                    break;
                case 3:
                    System.out.println("Proceso terminado");
                    salir = false;
                    break;
            }
        }
    }
}
