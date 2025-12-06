package generadorSecuencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Generador de secuencia");
        System.out.println("Ingresa un numero: ");
        int numero = sc.nextInt();
        generarSecuencia(numero);
    }

    public static void generarSecuencia(int n) {
        System.out.println("La secuencia generada es: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print("Par");
            } else {
                System.out.print("Impar");
            }
            if (i < n) {
                System.out.print(", ");
            }
        }
    }
}
