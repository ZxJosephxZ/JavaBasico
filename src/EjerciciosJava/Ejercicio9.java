package EjerciciosJava;


import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        //EJERCICIO9: REALIZA UN PIEDRA, PAPEL Y TIJERA
        Scanner sc = new Scanner(System.in);
        String mano;
        Random random = new Random();
        int i;
        String []opciones = {"piedra","papel","tijeras"};
        System.out.println("OJO: Se debe escribir la opcion tal cual como se muestra en el texto");
        System.out.println("Escribe una opcion: piedra, papel o tijeras");
        mano = sc.nextLine();
        i = random.nextInt(2);
        if (opciones[i].equals(mano))
        {
            System.out.println("Opcion de la maquina: "+ opciones[i]);
            System.out.println("Es un empate");
        }
        else if (mano.equals("piedra") && opciones[i].equals("tijeras"))
        {
            System.out.println("Opcion de la maquina: "+ opciones[i]);
            System.out.println("Ganaste");
        }
        else if (mano.equals("piedra") && opciones[i].equals("papel"))
        {
            System.out.println("Opcion de la maquina: "+ opciones[i]);
            System.out.println("Perdiste");
        }
        else if (mano.equals("papel") && opciones[i].equals("tijeras"))
        {
            System.out.println("Opcion de la maquina: "+ opciones[i]);
            System.out.println("Perdiste");
        }
        else if (mano.equals("papel") && opciones[i].equals("piedra"))
        {
            System.out.println("Opcion de la maquina: "+ opciones[i]);
            System.out.println("Ganaste");
        }
        else if (mano.equals("tijeras") && opciones[i].equals("piedra"))
        {
            System.out.println("Opcion de la maquina: "+ opciones[i]);
            System.out.println("Perdiste");
        }
        else if (mano.equals("tijeras") && opciones[i].equals("papel"))
        {
            System.out.println("Opcion de la maquina: "+ opciones[i]);
            System.out.println("Ganaste");
        }
    }
}
