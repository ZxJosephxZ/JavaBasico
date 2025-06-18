package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        //EJERCICIO 17: CALCULAR EL FACTORIAL DE UN NUMERO
        Scanner sc = new Scanner(System.in);
        int numero;
        int i = 1;
        System.out.println("Introduce el numero: ");
        numero = sc.nextInt();
        for (int x = 1;x<=numero;x++)
        {
            i *= x;
        }
        System.out.println(i);
    }
}
