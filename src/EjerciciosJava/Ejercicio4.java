package EjerciciosJava;

public class Ejercicio4 {
    public static void main(String[] args) {
        //EJERCICIO4: Concatena 5 variables de tipo char y muestralas por consola
        char variablesA = 'A';
        char variablesE = 'E';
        char variablesI = 'I';
        char variablesO = 'O';
        char variablesU = 'U';
        //Al colocar un doble comillado indica que las variables deben ser representadas como caracteres
        //En caso de no hacerlo se tomarian como digitos representados en Asscii
        System.out.println("" + variablesA + variablesE + variablesI + variablesO + variablesU);
    }
}
