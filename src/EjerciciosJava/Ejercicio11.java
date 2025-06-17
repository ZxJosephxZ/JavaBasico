package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        //EJERCICIO11: Hacer un rectangulo mediante ancho y alto (relleno)
        Scanner sc = new Scanner(System.in);
        int ancho;
        int alto;
        System.out.println("Introduce ancho del rectangulo: ");
        alto = sc.nextInt();
        System.out.println("Introduce alto del rectangulo: ");
        ancho = sc.nextInt();
        for (int x = 0;x<ancho;x++)
        {
            for (int y = 0; y<alto;y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
