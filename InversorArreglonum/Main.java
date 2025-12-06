package InversorArreglonum;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scanner =new Scanner (System.in);
        int[] numeros=new int [5];
        System.out.println("Ingresa 5 numeros enteros");
        for (int i=0;i<numeros.length;i++) {
            System.out.println("Numero " + (i + 1) + " : ");
            numeros[i] = scanner.nextInt();
        }
            System.out.println("El arreglo generado es: ");
            for (int i=0;i<numeros.length;i++){
                System.out.print(numeros[i]+ " ");
            }
            System.out.println("\nEl arreglo invertido es: ");
            for (int i=numeros.length-1; i>=0;i--){
            System.out.print(numeros[i]+ " ");
        }
    }
}
