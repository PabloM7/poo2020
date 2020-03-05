package polimorfismovolumen;

import TallerUno.Estudiante;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("_____________________________________");
        System.out.println("|  AREAS FIGURAS GEOMETRICAS:       |");
        System.out.println("_____________________________________");
        System.out.println("|  1) Cono                          |");
        System.out.println("|  2) Cubo                          |");
        System.out.println("|  3) Cilindro                      |");
        System.out.println("|  4) ESFERA                        |");
        System.out.println("_____________________________________");
        System.out.println("|  ESCOGER OPCIÓN                   |");
        System.out.println("_____________________________________");

        int opc = teclado.nextInt();
        switch (opc){
            case 1:
                //Volumen del cono
                Cono cono = new Cono();
                System.out.println("Volumen del cono");
                System.out.println("Ingrese el radio del cono");
                cono.setRadio(teclado.nextDouble());
                System.out.println("Ingrese la altura del cono");
                cono.setAltura(teclado.nextDouble());
                cono.calcular_volumen();
                System.out.println("El volumen del cono es: "+cono.getVolumen());
                break;
            case 2:
                //Volumen del cubo
                Cubo cubo = new Cubo();
                System.out.println("Volumen del cubo");
                System.out.println("Ingrese la medida de la arista");
                cubo.setArista(teclado.nextDouble());
                cubo.calcular_volumen();
                System.out.println("El volumen del cubo es: "+cubo.getVolumen());
                break;
            case 3:
                //Volumen del cilindro
                Cilindro cilindro = new Cilindro();
                System.out.println("Volumen del cilindro");
                System.out.println("Ingrese la altura del cilindro");
                cilindro.setAltura(teclado.nextDouble());
                System.out.println("Ingrese el radio del cilindro");
                cilindro.setRadio(teclado.nextDouble());
                cilindro.calcular_volumen();
                System.out.println("El volumen del cilindro es: "+cilindro.getVolumen());
                break;
            case 4:
                //Volumen de la esfera
                Esfera esfera = new Esfera();
                System.out.println("Volumen de la esfera");
                System.out.println("Ingrese el radio de la esfera");
                esfera.setRadio(teclado.nextDouble());
                esfera.calcular_volumen();
                System.out.println("El volumen de la esfera es: "+esfera.getVolumen());
                break;
        }
    }
}
