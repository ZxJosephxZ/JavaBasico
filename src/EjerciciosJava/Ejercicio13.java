package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
    //EJERCICIO13:Realiza la media de todos los numeros introducidos por el usuario hasta que introduzca un numero negativo
        Scanner sc = new Scanner(System.in);
        int numeros;
        int media = 0;
        int i=0;
        System.out.println("Introduce numeros enteros (el programa se detiene si introduces un numero negativo): ");
        do{
            numeros = sc.nextInt();
            if (numeros >= 0)
            {
                media += numeros;
                i++;
            }
        }while(numeros >= 0);
        System.out.println("La media es: " + media/i);
    }
}
