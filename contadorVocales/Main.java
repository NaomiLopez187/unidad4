package contadorVocales;

import java.util.Scanner;

public class Main {
    public static void main (String [ ]args) {
        Scanner scanner = new Scanner (System.in);
        char[] arreglo= new char [10];
        System.out.println("Ingresa una cadena de 10 letras en minusculas");
        String cadena;
        cadena=scanner.nextLine();
        while (cadena.length() < 10) {
            System.out.println("ERROR❌, La cadena debe tener al menos 10 letras");
            System.out.println("Ingresa de nuevo una cadena de 10 letras en minusculas");
            cadena=scanner.nextLine();
        }
        for (int i=0;i<arreglo.length;i++){
            arreglo[i] = cadena.charAt(i);
        }
        int contarVocal=0;
        for(int i=0;i<arreglo.length;i++) {
            char letra = arreglo[i];

            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contarVocal++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("El numero de vocales son: "+contarVocal);
    }
}
