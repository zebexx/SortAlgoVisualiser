package visualiser;

import javax.swing.JFrame;

import visualiser.sortingalgos.BubbleSort;


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

        gui.shuffle();

        //new BubbleSort().runSort(new Gui());
    }

    public static void main(String[] args) {
        Main run = new Main();
        new BubbleSort().runSort(new Gui());
        

    }
}
