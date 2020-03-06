package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiante {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        System.out.println("SISTEMA DE INGRESO DE DATOS DE ESTUDIANTES");
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Digite 1 para almacenar datos de un estudiante");
            System.out.println("Digite 2 para presentar los datos almacenados");
            System.out.println("Digite 3 para salir");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    Estudiante estudiante = new Estudiante();
                    System.out.println("Ingrese el nombre");
                    estudiante.setNombre(teclado.nextLine());
                    System.out.println("Ingrese la cedula");
                    estudiante.setCedula(teclado.nextLine());
                    System.out.println("Ingrese la edad");
                    estudiante.setEdad(teclado.nextInt());
                    teclado.nextLine();
                    System.out.println("Ingrese la carrera");
                    estudiante.setCarrera(teclado.nextLine());
                    System.out.println("Ingrese el correo");
                    estudiante.setCorreo(teclado.nextLine());
                    //agregamos objeto vehiculo a la lista
                    estudiantes.add(estudiante);
                    break;
                case 2:
                    //Recorremos la lista con foreach
                    for (Estudiante e : estudiantes) {
                        System.out.println("----------------------------");
                        System.out.println("Nombre: "+e.getNombre());
                        System.out.println("Cedula: "+e.getCedula());
                        System.out.println("Edad: "+e.getEdad());
                        System.out.println("Carrera: "+e.getCarrera());
                        System.out.println("Correo: "+e.getCorreo());
                        System.out.println("----------------------------");
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