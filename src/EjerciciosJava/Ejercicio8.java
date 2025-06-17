package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //EJERCICIO8: CALCULAR UNA ENTRADA EN BASE AL NUMERO DE TICKETS y DIA.
        //ENTRADA:8 EUROS, MIERCOLES: 5 EUROS, JUEVES: parejas 5 euros en grupos impares una paga el precio normal
        int precioEntrada = 8;
        int numeroEntradas;
        int dia;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas entradas quiere comprar: ");
        numeroEntradas = sc.nextInt();
        System.out.println("Seleccione un numero: ");
        System.out.println("1.Lunes");
        System.out.println("2.Martes");
        System.out.println("3.Miercoles");
        System.out.println("4.Jueves");
        System.out.println("5.Viernes");
        System.out.println("6.Sabado");
        dia = sc.nextInt();
        if (dia == 4 && numeroEntradas%2==0)
        {
            precioEntrada = 5;
            System.out.println("El precio a pagar es de: " + (numeroEntradas*precioEntrada));
        }
        else if (dia == 4 && (!(numeroEntradas%2 == 0) && numeroEntradas > 1))
        {
            precioEntrada = 5;
            numeroEntradas-=1;
            System.out.println("El precio a pagar es de: " + (numeroEntradas*precioEntrada + 8));
        }
        else
        {
            System.out.println("El precio a pagar es de: " + (numeroEntradas*precioEntrada));
        }
    }
}
