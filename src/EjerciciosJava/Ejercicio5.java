package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //EJERCICIO5: Solicitar notas al usuario (3) y determinar si aprobo (sobresalieente, aprobado, suspenso)
        Scanner sc = new Scanner(System.in);
        int media = 0;
        int nota;
        int i = 0;
        System.out.println("Introduce tus notas:");
        while (i < 3)
        {
            System.out.println("Nota" +(i+1)+ ": ");
            nota = sc.nextInt();
            if (nota < 0)
            {
                System.out.println("El numero debe ser positivo");
            }
            else
            {
                media += nota;
                i++;
            }
        }
        System.out.println("Tu media es: " + (media/i));
        if ((media/i) > 7)
        {
            System.out.println("sobresaliente");
        }
        else if ((media/i) >= 5)
        {
            System.out.println("aprobado");
        }
        else
        {
            System.out.println("suspenso");
        }
    }
}
