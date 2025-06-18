package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio14 {
    //EJERCICIO14: Realizar la serie fibonacci, el usuario pedira n numeros
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int posicion1 = 0;
        int posicion2 = 1;
        int siguiente = 0;
        System.out.println("Introduce el numero de la serie de fibonacci: ");
        n = sc.nextInt();
        for (int i = 0; i<n;i++)
        {
            if (i == 0)
            {
                System.out.print(posicion1+",");
            }
            else if (i == 1)
            {
                System.out.print(posicion2+",");
            }
            else {
                siguiente = posicion1 + posicion2;
                posicion1 = posicion2;
                posicion2 = siguiente;
                System.out.print((siguiente));
                if (i+1<n)
                {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
    }

}
