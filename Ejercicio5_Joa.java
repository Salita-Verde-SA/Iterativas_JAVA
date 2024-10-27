import java.util.Scanner;

public class Ejercicio5_Joa {

    //Una empresa desea calcular las horas extras trabajadas por sus empleados. Si un empleado trabaja más de 40 horas en la semana, las horas adicionales se consideran horas extras.
    //Instrucciones:
    //•	Pide al usuario ingresar el número de empleados.
    //•	Usa un bucle para ingresar las horas trabajadas por cada empleado.
    //•	Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasSemanales = 40;

        System.out.print("Ingrese el numero de empleados: ");
        int empleados = sc.nextInt();

        for (int i = 1; i <= empleados; i++) {

            System.out.print("Ingrese las horas trabajadas del empleado <" + i + "> SEMANALMENTE: ");
            int horasTrabajadas = sc.nextInt();

            if (horasTrabajadas > 40) {
                horasTrabajadas -= horasSemanales;
                System.out.print("El empleado numero <" + i + "> hizo <<" + horasTrabajadas + ">> horas extras...\n");
            } else if (horasTrabajadas <= 40) {
                System.out.print("El empleado <" + i + "> No hizo horas extras...\n");
            }
        }
    }
}
