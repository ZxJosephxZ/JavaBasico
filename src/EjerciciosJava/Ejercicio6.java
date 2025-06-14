package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //EJERCICIO6: El usuario va introducir dos numeros por consola y se debe determinar cual es el mayor y divisible entre 2 y/o 5
        Scanner sc = new Scanner(System.in);
        double numero1;
        double numero2;

        System.out.println("Introduce el primer numero: ");
        numero1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero: ");
        numero2 = sc.nextDouble();

        if (numero1 < numero2 || numero1 == numero2)
        {
            numero1 = numero2;
        }
        System.out.println("El numero mayor es: " + numero1);
        if((numero1 % 2)== 0 && (numero1 % 5)== 0)
        {
            System.out.println("Es divisible por 2 y 5");
        }
        else if ((numero1 % 2) == 0)
        {
            System.out.println("Es divisible por 2");
        }
        else if((numero1 % 5) == 0)
        {
            System.out.println("Es divisible por 5");
        }
        else
        {
            System.out.println("No es divisible");
        }
    }
}
