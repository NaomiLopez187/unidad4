package busquedadNumero;

import java.util.Scanner;

public class Main {
    public static void main (String [ ]args) {
        Scanner sc= new Scanner (System.in);
            int []numeros=new int[7];
            System.out.println("Ingresa 7 numeros para crear un arreglo: ");
            for(int i=0; i<numeros.length; i++){
                System.out.println("Numero "+ (i+1)+ ": ");
                numeros[i]=sc.nextInt();
            }
        System.out.println("¿Qué numero deseas buscar?: ");
            int buscado;
            buscado=sc.nextInt();
            int i=0;
            boolean encontrado=false;
            while(i<numeros.length) {
                if (numeros[i] == buscado) {
                    encontrado=true;
                    System.out.println("El numero " + buscado + " se encuentra en el indice " + i);
                    break;
                }
                i++;
            }
            if(!encontrado){
                System.out.println("El numero "+buscado+" no se encuentra en el arreglo");
            }
    }

}
