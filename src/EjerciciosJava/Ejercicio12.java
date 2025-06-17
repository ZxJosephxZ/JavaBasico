package EjerciciosJava;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        //EJERCICIO12: Generar un numero aleatorio del cual el usuario tendra que adivinar tiene 10 intentos
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio;
        int i = 0;
        int numero;
        numeroAleatorio = random.nextInt(100);
        do {
            System.out.println("Adivina el numero: ");
            numero = sc.nextInt();
            if (numero < numeroAleatorio)
            {
                System.out.println("El numero es mayor");
            }
            if (numero > numeroAleatorio)
            {
                System.out.println("El numero es menor");
            }
            i++;
        }while(numero != numeroAleatorio && i<10);
        System.out.println("Enhorabuena adivinaste, el numero es: " + numeroAleatorio);
    }
}
