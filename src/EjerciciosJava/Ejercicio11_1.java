package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio11_1 {
    public static void main(String[] args) {
        //EJERCICIO11.1: Realizar un rectangulo hueco con las coordenadas del usuario
        Scanner sc = new Scanner(System.in);
        int alto;
        int ancho;
        System.out.println("Introduce el ancho: ");
        alto = sc.nextInt();
        System.out.println("Introduce el alto: ");
        ancho = sc.nextInt();

        for (int x=0;x<ancho;x++)
        {
            for (int y=0;y<alto;y++)
            {
                if (x == 0 || x == (ancho-1))
                {
                    System.out.print("*");
                }
                else if (y==0 || y==(alto-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
