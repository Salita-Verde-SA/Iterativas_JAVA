import java.util.Scanner;

//Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
//Instrucciones:
//•	Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
//•	Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado.

public class Ejercicio1_Joa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] Actividades = {"Hacer Ejercicio", "Leer", "Estudiar", "Tiempo Libre"};
        double contarHoras = 0;

        for (String actividad : Actividades){
            while (true){
                System.out.println("Ingrese cuantas horas al dia dedica a " + actividad + ": ");
                double horas = sc.nextDouble();
                contarHoras += horas;
                break;
            }
        }
        System.out.printf("la suma del tiempo dedicado a todas las actividades es: " + contarHoras);
    }
}
