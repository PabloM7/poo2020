package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;

public class EjemploLista {
    public static void main(String[] args) {
        //Creacion de una lista en java
        //para almacenar valores de tipo String
        List<String> universidades = new ArrayList<String>();
        universidades.add("utpl");
        System.out.println("Tamaño de la lista: "+universidades.size());
        universidades.add("espol");
        System.out.println("Tamaño de la lista: "+universidades.size());
        universidades.add("unl");
        System.out.println("Tamaño de la lista: "+universidades.size());
        //eliminacion del elemento en la posicion 1
        universidades.remove(1);
        System.out.println("Tamaño de la lista luego de eliminar elementos: "+universidades.size());
        //recorremos lista para presentar valores
        System.out.println("Valores de la lista");
        //Reemplazamos el valor de una posicion indicada en nuestra lista
        universidades.set(1, "uide");
        //Agregamos un nuevo valor en una posicion intermedia
        universidades.add(1, "unl");
        /*for (int cont = 0; cont < universidades.size(); cont++){
            System.out.println(universidades.get(cont));
        }*/
        for (String univ: universidades){
            System.out.println(univ);
        }
    }
}
