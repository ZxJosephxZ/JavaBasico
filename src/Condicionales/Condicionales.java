package Condicionales;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 90;
        if (numero < 100 && numero > 50)
        {
            System.out.println(numero);
        }
        else if (numero > 200)
        {
            System.out.println("numero mayor a 200");
        }
        else
        {
            System.out.println("Continua la ejecucion");
        }
        System.out.println("Escribe norte o sur: ");
        String palabra = sc.nextLine();

        switch (palabra.toLowerCase()){
            case "norte":
                System.out.println("Te diriges hacia el norte");
                break;
            case "sur":
                System.out.println("Te diriges hacia el sur");
                break;
            default:
                System.out.println("Introduce lo pedido");
                break;
        }


    }
}
