package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //EJERCICIO2: Calcula el area de un circulo
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio del circulo: ");
        double radio = sc.nextDouble();
        double areaCirculo = Math.pow(radio, 2)*Math.PI;
        System.out.println("El area del circulo es: " + areaCirculo);
    }
}
