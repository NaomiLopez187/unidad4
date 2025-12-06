package validorContrasena;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contrasenaCorrecta = "inge2025sc";
        String contrasenaIngresada;
        int intento = 0;

        while (intento < 3) {
            System.out.print("Introduce la contraseña: ");
            contrasenaIngresada = scanner.nextLine();

            if (contrasenaIngresada.equals(contrasenaCorrecta)) {
                System.out.println("Acceso concedido ✅");
                return;
            } else {
                System.out.println("Contraseña incorrecta ❌");

                intento++;
            }
        }
        System.out.println("Acceso denegado. Contacte a soporte.");
    }
}
