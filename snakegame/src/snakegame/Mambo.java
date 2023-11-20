package snakegame;

import javax.swing.*;

public class Mambo extends JFrame {

    Mambo() {
        super("Mambo, a Snake Game");
        add(new Board());
        pack();

        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Mambo().setVisible(true);
    }
}
