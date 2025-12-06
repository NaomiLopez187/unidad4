package clasificadorCalificaciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu calificacion: ");
        int calificacion = scanner.nextInt();

        System.out.println("Tu desempeño es: " + clasificarCalificacion(calificacion));
    }

    public static String clasificarCalificacion(int calif) {
        String resultado;
        if (calif >= 90 && calif <= 100) {
            resultado="Sobresaliente";
        } else if (calif >= 80 && calif <= 89) {
            resultado= "Notable";
        } else if (calif >= 70 && calif <= 79) {
            resultado= "Aprobatorio";
        } else if (calif < 70) {
            resultado= "Reprobatorio";
        } else {
            resultado= "Calificación inválida";
        }
        return resultado;
    }
}