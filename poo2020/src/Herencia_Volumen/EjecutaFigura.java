package Herencia_Volumen;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double radio, altura;
        int i;
        String nombre;
        do{
            // Menu para pedir lo que el usuario desea
            System.out.println("_____________________________________");
            System.out.println("|  AREAS FIGURAS GEOMETRICAS:       |");
            System.out.println("_____________________________________");
            System.out.println("|  1) CUBO                          |");
            System.out.println("|  2) CILINDRO                      |");
            System.out.println("|  3) CONO                          |");
            System.out.println("|  4) ESFERA                        |");
            System.out.println("_____________________________________");
            System.out.println("|  ESCOGER OPCIÓN                   |");
            System.out.println("_____________________________________");
            i = teclado.nextInt();
        }while(i > 4 || i < 1);
        switch (i){
            case 1:
                // Area del cubo
                nombre = "Cubo";
                System.out.print("Ingrese la medida de las aristas: ");
                double aristas = teclado.nextDouble();
                Cubo cubo = new Cubo(nombre, aristas);
                cubo.calcular_volumen();
                System.out.println("| -> Nombre de la figura: "+cubo.getNombre());
                System.out.println("| -> El volumen es: "+cubo.obtener_volumen());
                break;
            case 2:
                // Area del cilindro
                nombre = "Cilindro";
                System.out.print("Ingrese el radio: ");
                radio = teclado.nextDouble();
                System.out.print("Ingrese la altura: ");
                altura = teclado.nextDouble();
                Cilindro cilindro = new Cilindro(nombre, radio, altura);
                cilindro.calcular_volumen();
                System.out.println("| -> Nombre de la figura: "+cilindro.getNombre());
                System.out.println("| -> El área es: "+cilindro.obtener_volumen());
                break;
            case 3:
                // Area del cono
                nombre = "Cono";
                System.out.print("Ingrese el radio: ");
                radio = teclado.nextDouble();
                System.out.print("Ingrese la altura: ");
                altura = teclado.nextDouble();
                Cono cono = new Cono(nombre, altura, radio);
                cono.calcular_volumen();
                System.out.println("| -> Nombre de la figura: "+cono.getNombre());
                System.out.println("| -> El área es: "+cono.obtener_volumen());
                break;
            case 4:
                // Area de la esfera
                nombre = "Esfera";
                System.out.print("Ingrese el radio: ");
                radio = teclado.nextDouble();
                Esfera esfera = new Esfera(nombre, radio);
                esfera.calcular_volumen();
                System.out.println("| -> Nombre de la figura: "+esfera.getNombre());
                System.out.println("| -> El área es: "+esfera.obtener_volumen());
                break;
        }
    }
}
