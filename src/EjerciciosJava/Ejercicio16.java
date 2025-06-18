package EjerciciosJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        //EJERCICIO16: Adivina el anime
        Scanner sc = new Scanner(System.in);
        String respuesta;
        int aciertosSeguidos = 0;
        int numeroAleatorio;
        boolean numeroValido = true;
        String preguntas[][] = new String[5][2];
        preguntas[0][0] = "Suneo";
        preguntas[0][1] = "Doraemon";
        preguntas[1][0] = "Goku";
        preguntas[1][1] = "DragonBall";
        preguntas[2][0] = "Kirito";
        preguntas[2][1] = "SAO";
        preguntas[3][0] = "Taichi";
        preguntas[3][1] = "Digimon";
        preguntas[4][0] = "Van";
        preguntas[4][1] = "Zoids";

        ArrayList<Integer> numerosRepetidos = new ArrayList<Integer>();
        while (aciertosSeguidos != 3)
        {
            do{
                numeroValido = true;
                numeroAleatorio = (int)(Math.random()*9+1);
                for(Integer i : numerosRepetidos)
                {
                    if (numeroAleatorio == i)
                    {
                        numeroValido = false;
                    }
                }
            }while(numeroValido == false);
            numerosRepetidos.add(numeroAleatorio);
            System.out.println("Aque anime pertenece el personajes..." + preguntas[numeroAleatorio][0]+ "?");
            respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase(preguntas[numeroAleatorio][1]))
            {
                aciertosSeguidos++;
                System.out.println("Acertado");
            }else
            {
                aciertosSeguidos = 0;
                numerosRepetidos.clear();
                System.out.println("Fallaste");
            }
        }
    }
}
