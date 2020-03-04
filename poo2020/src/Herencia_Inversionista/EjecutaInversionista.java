package Herencia_Inversionista;

import java.util.Scanner;

public class EjecutaInversionista {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nom_cliente;
        int num_cliente, num_cuenta, op = 0;
        double capital_inv, plazo_inv, interes_anual = 0;

        String cadena2 = "" ;
        System.out.println("CALCULO DE SUELDO DE EMPLEADOS");
        String cadena = "REPORTE DE INVERSIONES\nNo.Cliente\t\t\tNOMBRE\t\t\t\tNo.Cuenta\t\t\t\tInterés GANADO\n";
        cadena += "-----------------------------------------------------------------------------------------";
        boolean salir = true;
        while(salir == true){
            // Menú para ingreso de datos
            System.out.println("1. Opcion 1: Para calcular el interes de la Cuenta de Ahorro");
            System.out.println("2. Opcion 2: Para calcular el interes de la Cuenta de Pagaré");
            System.out.println("3. Opcion 3: Para calcular el interes de la Cuenta  Maestra");
            System.out.println("Escribe una de las opciones");
            op = teclado.nextInt();
            switch (op){
                case 1:
                    System.out.println("Numero  del Cliente: ");
                    teclado.nextLine();
                    num_cliente = teclado.nextInt();
                    System.out.println("Nombre del Cliente: ");
                    teclado.nextLine();
                    nom_cliente = teclado.nextLine();
                    System.out.println("Numero de Cuenta: ");
                    num_cuenta = teclado.nextInt();
                    System.out.println("Capital invertido: ");
                    capital_inv = teclado.nextDouble();
                    System.out.println("Plazo de inversión: ");
                    teclado.nextLine();
                    plazo_inv = teclado.nextDouble();
                    CuentaAhorro ahorro = new CuentaAhorro(nom_cliente, num_cliente, num_cuenta, capital_inv, plazo_inv, interes_anual);
                    cadena2 += "\t\t"+ahorro.getNum_cliente()+"\t\t\t"+ahorro.getNom_cliente()+"\t\t\t"
                            +ahorro.getNum_cuenta()+"\t\t\t"+ahorro.calcular_interes_ahorro()+"\n";
                    break;
                case 2:
                    System.out.println("Numero  del Cliente: ");
                    teclado.nextLine();
                    num_cliente = teclado.nextInt();
                    System.out.println("Nombre del Cliente: ");
                    teclado.nextLine();
                    nom_cliente = teclado.nextLine();
                    System.out.println("Numero de Cuenta: ");
                    num_cuenta = teclado.nextInt();
                    System.out.println("Capital invertido: ");
                    capital_inv = teclado.nextDouble();
                    System.out.println("Plazo de inversión: ");
                    teclado.nextLine();
                    plazo_inv = teclado.nextDouble();
                    Pagare pagare = new Pagare(nom_cliente, num_cliente, num_cuenta, capital_inv, capital_inv, interes_anual);

                    cadena2 += "\t\t"+pagare.getNum_cliente()+"\t\t\t  "+pagare.getNom_cliente()
                            +"\t\t\t"+pagare.getNum_cuenta()+"\t\t\t"+pagare.calcular_interes_pagare()+"\n";

                    break;

                case 3:
                    System.out.println("Numero  del Cliente: ");
                    teclado.nextLine();
                    num_cliente = teclado.nextInt();
                    System.out.println("Nombre del Cliente: ");
                    teclado.nextLine();
                    nom_cliente = teclado.nextLine();
                    System.out.println("Numero de Cuenta: ");
                    num_cuenta = teclado.nextInt();
                    System.out.println("Capital invertido: ");
                    capital_inv = teclado.nextDouble();
                    System.out.println("Plazo de inversión: ");
                    teclado.nextLine();
                    plazo_inv = teclado.nextDouble();
                    CuentaMaestra maestra = new CuentaMaestra(nom_cliente, num_cliente, num_cuenta, capital_inv, plazo_inv, interes_anual);
                    cadena2 += "\t\t"+maestra.getNum_cliente()+"\t\t\t  "+maestra.getNom_cliente()
                            +"\t\t\t"+maestra.getNum_cuenta()+"\t\t\t "+maestra.calcular_interes_maestra()+"\n";
                    break;


            }
            teclado.nextLine();
            System.out.println("Desea seguir calculando a los inversionistas Ingrese Si/No");
            String cancelar = teclado.nextLine().toUpperCase();
            if (cancelar.equals("NO")){
                System.out.println(cadena+"\n" + cadena2 );
                op = 5;
            }else{
                System.out.println();
                op = 4;

            }

        }
    }
}
