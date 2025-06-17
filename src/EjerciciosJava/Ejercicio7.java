package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    //EJERCICIO 7: INDICA LA ULTIMA Y LA PRIMERA CIFRA DE UN NUMERO POSITIVO DE MAXIMO 5 CIFRAS
        Scanner sc = new Scanner(System.in);
        int numero;
        int cifra = 0;
        System.out.println("Introduce el numero");
        numero = sc.nextInt();
        while (numero < 0 || numero > 99999)
        {
            System.out.println("El numero no puede ser negativo y debe ser maximo de 5 cifras:");
            numero = sc.nextInt();
        }
        cifra = numero;
        while (cifra > 9)
        {
            cifra/=10;
        }
        System.out.println(numero);
        System.out.println("Su primera cifra es: "+cifra);
        System.out.println("Su ultima cifra es: "+numero%10);
    }
}
