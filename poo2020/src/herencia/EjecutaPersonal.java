package herencia;

import java.util.Date;
import java.util.Scanner;

public class EjecutaPersonal {

    public static void main(String[] args) {
        //Creacion de objeto de la clase estudiante
        Estudiante est = new Estudiante();
        String nombre, identifiacion, estado_civil, fecha_nac, carrera;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Creacion de objeto Estudiante");
        System.out.println("Ingrese el nombre ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la identificacion ");
        identifiacion = teclado.nextLine();
        System.out.println("Ingrese la carrera ");
        carrera = teclado.nextLine();
        System.out.println("Ingrese estado civil ");
        estado_civil = teclado.nextLine();
        System.out.println("Ingrese fecha de nacimiento");
        fecha_nac = teclado.nextLine();

        est.setNombre(nombre);
        est.setIdentificacion(identifiacion);
        est.setCarrera(carrera);
        est.setEstado_civil(estado_civil);
        est.setFecha_nacimiento(fecha_nac);

        System.out.println("---------------------");
        System.out.println("Datos de objeto Estudiante");
        System.out.println("nombre: "+est.getNombre());
        System.out.println("identificacion: "+est.getIdentificacion());
        System.out.println("carrera: "+est.getCarrera());
        System.out.println("estado civil "+est.getEstado_civil());
        System.out.println("fecha de nacimiento "+est.getFecha_nacimiento());

    }
}
