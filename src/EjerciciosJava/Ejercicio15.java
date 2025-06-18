package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        //EJERCICIO15:Voltear un numero y mostrar su numero de cifras
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres invertir: ");
        int i = 0;
        int numeroInverso = 0;
        int numero = sc.nextInt();
        while (numero!= 0)
        {
            numeroInverso = numeroInverso*10 + (numero % 10);
            numero/=10;
            i++;
        }
        System.out.println(numeroInverso + " numero de cifras: " + i);
    }
}
