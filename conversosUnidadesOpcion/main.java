package conversosUnidadesOpcion;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa el valor que quieras convertir: ");
        double valor;
        valor=scanner.nextDouble();
        System.out.println("---MENU DE CONVERSION---");
        System.out.println("1. Kilometros a millas");
        System.out.println("2. Centigrados a Farenheint");
        System.out.println("3. Metros a pies");
        System.out.println("¿Que conversion deseas realizar?");
        int opcion;
        opcion=scanner.nextInt();
        double conversion;
        switch (opcion){
            case 1:
                conversion=valor*0.621371 ;
                System.out.println("El resultado de la conversion de kilometros a millas es: "+conversion+" millas");
                break;
            case 2:
                conversion = (valor * 9.0 / 5.0) + 32;
                System.out.println("El resultado de la conversion de grados centigrados a grados farenheint es: "+conversion+" °F");
                break;
            case 3:
                conversion=valor*3.28084;
                System.out.println("El resultado de la conversion de metros a pies es: "+conversion+" ft");
                break;
            default:
                System.out.println("Opcion no encontrada, vuleve a intentarlo 👍");
        }
        System.out.println("Conversion finalizada🙌");
    }
}
