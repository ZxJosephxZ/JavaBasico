package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio10 {
    //EJERCICIO10: HACER TABLA DE MULTIPLICAR , SE PUEDE USAR BUCLES
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para ver su tabla (mayor a 0): ");
        int numero = sc.nextInt();
        int i = 0;
        while (i <= 12 && numero > 0)
        {
            System.out.println(numero + " * "+ i +" = "+ (numero*i));
            i++;
        }
    }
}
