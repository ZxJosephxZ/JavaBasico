package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //EJERCICIO3: Muestra por pantalla la tabla de multiplicar sin usar bucles
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero entero: ");
        numero = sc.nextInt();
        System.out.println(numero + " * 0 = "+ 0);
        System.out.println(numero + " * 1 = "+ numero);
        System.out.println(numero + " * 2 = "+ (numero * 2));
        System.out.println(numero + " * 3 = "+ (numero * 3));
        System.out.println(numero + " * 4 = "+ (numero * 4));
        System.out.println(numero + " * 5 = "+ (numero * 5));
        System.out.println(numero + " * 6 = "+ (numero * 6));
        System.out.println(numero + " * 7 = "+ (numero * 7));
        System.out.println(numero + " * 8 = "+ (numero * 8));
        System.out.println(numero + " * 9 = "+ (numero * 9));
        System.out.println(numero + " * 10 = "+ (numero * 10));
        System.out.println(numero + " * 11 = "+ (numero * 11));
        System.out.println(numero + " * 12 = "+ (numero * 12));
    }
}
