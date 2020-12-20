package visualiser;

import javax.swing.JFrame;


public class Main {
    private JFrame window;
    private Gui gui;

    public Main() {
        window = new JFrame("Sort Visualiser");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        gui = new Gui();
        window.add(gui);
        gui.repaint();

        window.pack();
        window.setVisible(true);
    }

    public static void main(String[] args) {
        Main run = new Main();

    }
}
