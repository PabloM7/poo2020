package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculo {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        System.out.println("SISTEMA DE INGRESO DE VEHICULOS");
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Digite 1 para almacenar nuevo");
            System.out.println("Digite 2 para presentar vehiculos");
            System.out.println("Digite 3 para salir");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    Vehiculo vehiculo = new Vehiculo();
                    System.out.println("Ingrese la placa");
                    vehiculo.setPlaca(teclado.nextLine());
                    teclado.nextLine();
                    System.out.println("Ingrese la marca");
                    vehiculo.setMarca(teclado.nextLine());
                    System.out.println("Ingrese el modelo");
                    vehiculo.setModelo(teclado.nextLine());
                    System.out.println("Ingrese el color");
                    vehiculo.setColor(teclado.nextLine());
                    System.out.println("Ingrese años");
                    vehiculo.setAnio(teclado.nextInt());
                    teclado.nextLine();
                    System.out.println("Ingrese el cilindraje");
                    vehiculo.setCilindraje(teclado.nextInt());
                    //agregamos objeto vehiculo a la lista
                    vehiculos.add(vehiculo);
                    break;
                case 2:
                    //Recorremos la lista con foreach
                    System.out.println("Placa\tMarca\tCilindraje");
                    for (Vehiculo v : vehiculos) {
                        System.out.println("----------------------------");
                        System.out.println("Placa: "+v.getPlaca());
                        System.out.println("Marca: "+v.getMarca());
                        System.out.println("Modelo: "+v.getModelo());
                        System.out.println("Color: "+v.getAnio());
                        System.out.println("Cilindraje: "+v.getCilindraje());
                        System.out.println("Color: "+v.getColor());
                        System.out.println("----------------------------");
                        //System.out.println(v.getPlaca() +"\t"+v.getMarca() + "\t" + v.getCilindraje());
                    }
                    break;
                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        }while (bandera);
    }
}
