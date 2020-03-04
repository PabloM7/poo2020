package Polimorfismo_Figura;

import java.util.Scanner;

public class EjecutaFigura3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el valor de la figura cuya area desea calcular");
        System.out.println("1. Triangulo");
        System.out.println("2. Rectangulo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Circulo");
        int opc = teclado.nextInt();
        switch (opc){
            case 1:
                //Area del triangulo
                Triangulo3 triangulo3 = new Triangulo3();
                System.out.println("Area del triangulo");
                System.out.println("Ingrese la altura del triangulo");
                triangulo3.setAlturaTria(teclado.nextDouble());
                System.out.println("Ingrese la base del triangulo");
                triangulo3.setBaseTria(teclado.nextDouble());
                triangulo3.calcular_area();
                System.out.println("El area del triangulo es: "+triangulo3.getArea());
                break;

            case 2:
                //Area del rectangulo
                Rectangulo3 rectangulo3 = new Rectangulo3();
                System.out.println("Area del rectangulo");
                System.out.println("Ingrese la altura del rectangulo");
                rectangulo3.setAlturaRecta(teclado.nextDouble());
                System.out.println("Ingrese la base del rectangulo");
                rectangulo3.setBaseRecta(teclado.nextDouble());
                rectangulo3.calcular_area();
                System.out.println("El area del rectangulo es: "+rectangulo3.getArea());
                break;

            case 3:
                //Area del cuadrado
                Cuadrado3 cuadrado3 = new Cuadrado3();
                System.out.println("Area del cuadrado");
                System.out.println("Ingrese el lado del cuadrado");
                cuadrado3.setLadoCuad(teclado.nextDouble());
                cuadrado3.calcular_area();
                System.out.println("El area del cuadrado es: "+cuadrado3.getArea());
                break;

            case 4:
                Circulo3 circulo3 = new Circulo3();
                System.out.println("Area del circulo");
                System.out.println("Ingrese el radio del circulo");
                circulo3.setRadioCirc(teclado.nextDouble());
                circulo3.calcular_area();
                System.out.println("El area del circulo es: "+circulo3.getArea());
                break;

            default:
                System.out.println("No existe la opcion seleccionada");
        }
    }
}
