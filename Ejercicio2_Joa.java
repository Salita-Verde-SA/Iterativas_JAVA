import java.util.Scanner;

public class Ejercicio2_Joa {

    //    Una empresa desea calcular el salario semanal de sus empleados basándose en las horas trabajadas y una tarifa fija por hora.
    //            Instrucciones:
    //            •	Pide al usuario ingresar la cantidad de empleados.
    //            •	Para cada empleado, pide ingresar las horas trabajadas.
    //•	Usa un bucle para calcular el salario de cada empleado (suponiendo una tarifa fija de $15 por hora).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tarifaFija = 15.0;

        System.out.printf("Ingrese la cantidad de empleados de la empresa: " );
        double empleados = sc.nextDouble();

        for (int i = 1; i <= empleados; i++) {
            System.out.printf("\nIngrese las horas que trabaja el empleado "+ i + ":");
            double horasdelEmpleado = sc.nextDouble();

            double dineroGanado = horasdelEmpleado * tarifaFija;
            System.out.printf("El dinero que gana semanalmente el empleado "+ i +" es de: $"+ dineroGanado + " pesos semanales. ");
        }
        sc.close();

    }


}
