package SumaconCiclo;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scanner=new Scanner (System.in);
        System.out.println("Ingresa el inicio del rango A");
        int A;
        A= scanner.nextInt();
        System.out.println("Ingresa el inicio del rango B");
        int B;
        B=scanner.nextInt();

        while(A>B){
            System.out.println("Error❌, ingresa un valor numerico al rango A menor que B");
            System.out.println("Ingresa el inicio del rango A");
            A= scanner.nextInt();
            System.out.println("Ingresa el inicio del rango B");
            B=scanner.nextInt();
            }
        int suma;
        suma=0;
        for (int i=A; i<=B; i++){
            System.out.print(i + " ");
            suma=suma+i;
        }
        System.out.println("\nLa suma de todos los elememtos dentro del rango de "+ A +" a "+ B +" son: "+suma);
    }
}
