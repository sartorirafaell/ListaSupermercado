
package listasupermercado.controller;

import javax.swing.JFrame;
import listasupermercado.view.janelaSupermercado;

public class ListaSupermercado {

    public static void main(String[] args) {
        janelaSupermercado jan1 = new janelaSupermercado();
        jan1.setVisible(true);
        jan1.setSize(550, 610);
        jan1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
