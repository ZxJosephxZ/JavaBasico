package Arrays_Bucles;

public class Arrays {
    public static void main(String[] args) {
        int numeros[];
// int numeros[] = {28,29,30,31,32};
        numeros = new int[5];
        numeros[0] = 28;
        numeros[1] = 29;
        numeros[2] = 30;
        numeros[3] = 31;
        numeros[4] = 32;
        System.out.println(numeros[0]);

        int matriz[][] = new int [2][3];
        matriz[0][0] = 100;
        matriz[0][1] = 100;
        matriz[0][2] = 100;

        matriz[1][0] = 100;
        matriz[1][1] = 100;
        matriz[1][2] = 100;
        System.out.println(matriz[1][2]);
    }
}
