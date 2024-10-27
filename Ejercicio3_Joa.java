import com.sun.source.tree.IfTree;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ejercicio3_Joa {

    //Una tienda necesita revisar el inventario de sus productos y determinar si algún artículo tiene menos de 5 unidades disponibles para realizar un pedido.
    //Instrucciones:
    //•	Pide al usuario ingresar el número de productos.
    //•	Usa un bucle para ingresar la cantidad disponible de cada producto.
    //•	Si algún producto tiene menos de 5 unidades, muestra un mensaje indicando que es necesario realizar un pedido.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos: ");
        int prodductos = sc.nextInt();

        sc.nextLine();

        for (int i = 1; i <= prodductos ; i++) {
            while (true){

                System.out.print("\nIndique el nombre del producto numero <" + i + "> : ");
                String name = sc.nextLine();

                System.out.print("Ingrese la cantidad disponible del producto <<<"+ name + ">>> : " );
                int prodContador = sc.nextInt();

                sc.nextLine();

                if (prodContador <= 5) {
                    System.out.print("El producto: ("+ name + ") contiene: " + prodContador + " Unidades! Se debe hacer un pedido...");
                } else if (prodContador >= 6) {
                    System.out.println("El producto: (" + name + ") Aun tiene " + prodContador + " Unidades...\nNo es neceseario hacer un pedido...");
                }
                break;
            }
        }
        sc.close();
    }
}
