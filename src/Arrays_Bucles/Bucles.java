package Arrays_Bucles;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<10; i++)
        {
            System.out.println(i);
        }

        int numeros[] = {15,22,62,12,6};
        for(int numero : numeros)
        {
            System.out.println(numero);
        }
        System.out.println("Introduce contraseña");
        String pass = sc.nextLine();
        while (!pass.equals("1234"))
        {
            System.out.println("Contraseña incorrecta");
            pass = sc.nextLine();
        }
        System.out.println("contraseña correcta");
        /*
        * do{
        * System.out.println("Introduce contraseña");
        * String pass = sc.nextLine();
        * }
        * while(!pass.equals("1234");
        * */
    }
}
