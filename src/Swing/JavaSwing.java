package Swing;

import javax.swing.*;
import java.awt.event.*;

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

        //EVENTOS:
        //Añadiendo listener mediante interface (hay mas pero eso ya depende del uso)
        button.addActionListener(new oyente());
        //Segunda manera de implementar un listener
       /* button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("has clickeado en el boton");
            }
        });
        */
        //Añadiendo un listener de tipo mouse (las 5 acciones por defecto)
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Esta clickeando el boton");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Se esta presionando el boton");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Se dejo de presionar el boton");
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        //Añadiendo listener de tipo teclado
        button.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        jpanel.add(button);
        jFrame.add(jpanel);
        //Nos permite mostrar nuestros componentes (!importante tenerlo al final de todo)
        jFrame.setVisible(true);
    }
}
//Clase oyente encargada de realizar la accion
class oyente implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("has cliqueado en el boton");
    }
}
