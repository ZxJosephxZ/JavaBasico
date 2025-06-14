package Swing;

import javax.swing.*;

public class JavaSwing {
    public static void main(String[] args) {
        //Este es el marco en el que se pone el panel
        JFrame jFrame = new JFrame();
        //Este es el panel en donde van los objetos
        JPanel jpanel = new JPanel();
        //Modificamos las dimensiones, tambien se puede añadir un objeto dimension
        jFrame.setSize(600,400);
        //Este metodo hace que el programa finalize su ejecucion al cerra la ventana
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Modificamos el titulo
        jFrame.setTitle("o.o");
        //Nos centra la ventana, en caso de querer una posicion (setLocation)
        jFrame.setLocationRelativeTo(null);
        
        JButton button = new JButton("Mi boton");
        jpanel.add(button);
        jFrame.add(jpanel);
        //Nos permite mostrar nuestros componentes (!importante tenerlo al final de todo)
        jFrame.setVisible(true);
    }
}
