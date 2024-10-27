import java.util.Random;
import java.util.Scanner;

public class Ejercicio4_Joa {

    //Una tienda desea registrar las ventas realizadas cada día durante una semana. El programa debe calcular el total de ventas al final de la semana.
    //Instrucciones:
    //•	Usa un bucle para registrar las ventas diarias durante 7 días.
    //•	Al final del bucle, muestra el total de ventas de la semana.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int semana = 7;

        int sumaSemanal = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingrese Cuantas ventas se hizo el dia <" + i + "> : ");
            int ventasDia = scan.nextInt();

            sumaSemanal += ventasDia;
        }

        System.out.println("-------------------------------------------------------------\n La suma total de las ventas en la semana es de: <<<" + sumaSemanal + ">>>");
    }
}
