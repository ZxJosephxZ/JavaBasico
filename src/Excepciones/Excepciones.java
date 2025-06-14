package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        try{
            int numero = sc.nextInt();
            if (numero < 0) throw new Exception();
            //En caso de no saber la excepcion concreta usar Exception
        }catch (Exception e)
        {
            System.out.println("No has introducido un numero correcto");
        }
        System.out.println("saliste del bloque try-catch");

        //Todo metodo con excepciones debe estar dentro de un try-catch
        try{
            introduceNumero();
        }catch (Exception e)
        {
            System.out.println("No es un numero valido");
        }
    }
    //Como hacer para que un metodo lanze excepciones
    public static void introduceNumero() throws Exception
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc1.nextInt();
        System.out.println("El numero es: " + numero);
    }
}
