package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        //EJERCICIO18: Extraer digitos pares de un numero y sumarlos
        Scanner sc = new Scanner(System.in);
        int numero;
        int nb=0;
        int resultado = 0;
        System.out.println("Introduce un numero: ");
        numero = sc.nextInt();
        while (numero != 0)
        {
            nb = numero%10;
            if ((nb%2)==0)
            {
                resultado+=nb;
            }
            numero/=10;
        }
        System.out.println(resultado);
    }
}
