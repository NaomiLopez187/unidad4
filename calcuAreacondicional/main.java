package calcuAreacondicional;

import java.util.Scanner;

public class main {
    public static void main (String [] args){
        Scanner scanner=new Scanner (System.in);
        System.out.println("Calculadora de Areas");
        System.out.println("---MENU---");
        System.out.println("1. Circulo");
        System.out.println("2. Rectangulo");
        System.out.println("Elige el area que desees calcular");
        int opcion;
        opcion=scanner.nextInt();
        double area;

        switch (opcion){
            case 1:
                System.out.println("Dame el radio del circulo");
                double radio;
                radio=scanner.nextDouble();
                area=radio*radio*Math.PI;
                System.out.println("El area del ciruclo es: "+area+"u²");
                if (area>100){
                    System.out.println("El area calculada es mayor a 100 unidades cuadradas");
                }else {
                    System.out.println("El area calculada es menor a 100 unidades cuadradas");
                }
                break;
            case 2:
                System.out.println("Dame la base del rectangulo");
                double base;
                base=scanner.nextDouble();
                System.out.println("Dame la altura del rectangulo");
                double altura;
                altura=scanner.nextDouble();
                area=altura*base;
                System.out.println("El area del rectangulo es: "+area+"u²");
                if (area>100){
                    System.out.println("El area calculada es mayor a 100 unidades cuadradas");
                }else {
                    System.out.println("El area calculada es menor a 100 unidades cuadradas");
                }
                break;
            default:
                System.out.println("Opcion no encontrada, vuelve a intentarlo😁");

        }

    }
}
