package herenciafigura;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        double base_t, altura_t, lado, base_r, altura_r, radio, area_t, area_c, area_r, area_cir;

        System.out.println("Escriba 1 para calcular el area del triangulo");
        System.out.println("Escriba 2 para calcular el area del cuadrado");
        System.out.println("Escriba 3 para calcular el area del rectangulo");
        System.out.println("Escriba 4 para calcular el area del circulo");
        int opc = teclado.nextInt();
        switch (opc){
            case 1:
                nombre = "Triangulo";
                System.out.println("Ingrese la base del triangulo");
                base_t = teclado.nextDouble();
                System.out.println("Ingrese la altura del triangulo");
                altura_t = teclado.nextDouble();
                Triangulo triangulo = new Triangulo(nombre, base_t, altura_t);

                System.out.println("La opcion escogida es: Triangulo");
                System.out.println("La base del triangulo es: "+triangulo.getBase_t());
                System.out.println("La altura del triangulo es: "+triangulo.getAltura_t());
                System.out.println("El area del triangulo es: "+triangulo.calcular_area_t());
                break;

            case 2:
                nombre = "Cuadrado";
                System.out.println("Ingrese el lado del cuadrado");
                lado = teclado.nextDouble();
                Cuadrado cuadrado = new Cuadrado(nombre, lado);

                System.out.println("La opcion escogida es: Cuadrado");
                System.out.println("El lado del cuadrado es: "+cuadrado.getLado());
                System.out.println("El area del cuadrado es: "+cuadrado.calcular_area_c());
                break;

            case 3:
                nombre = "Rectangulo";
                System.out.println("Ingrese la base del rectangulo");
                base_r = teclado.nextDouble();
                System.out.println("Ingrese la altura del rectangulo");
                altura_r = teclado.nextDouble();
                Rectangulo rectangulo = new Rectangulo(nombre, base_r, altura_r);

                System.out.println("La opcion escogida es: Rectangulo");
                System.out.println("La base del rectangulo es: "+rectangulo.getBase_r());
                System.out.println("La altura del rectangulo es: "+rectangulo.getAltura_r());
                System.out.println("El area del rectangulo es: "+rectangulo.calcular_area_r());
                break;

            case 4:
                nombre = "Circulo";
                System.out.println("Ingrese el radio del circulo");
                radio = teclado.nextDouble();
                Circulo circulo = new Circulo(nombre, radio);

                System.out.println("La opcion escogida es: Circulo");
                System.out.println("El radio del circulo es: "+circulo.getRadio());
                System.out.println("El area del triangulo es: "+circulo.calcular_area_cir());
                break;
            default:
                System.out.println("No existe la opcion seleccionada");
        }
    }
}
