package CalcuPromedioArregloyfuncion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        float [] calificaciones= new float[5];
        for(int i=0;i<calificaciones.length;i++){
            System.out.println("Ingresa la calificacion "+(i+1)+" : ");
            calificaciones[i]=sc.nextFloat();
        }
        float promedio;
        promedio= calcularPromedio(calificaciones, calificaciones.length);
        System.out.println("El promedio de las 5 califiaciones es: "+promedio);
    }
    public static float calcularPromedio(float[] calificaciones, int tamaño) {
        float suma = 0;
        for (int i = 0; i < tamaño; i++) {
            suma = suma + calificaciones[i];
        }
        return suma/tamaño;
    }
}
