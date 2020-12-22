package visualiser;

import java.awt.*;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import visualiser.sortingalgos.BubbleSort;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Gui extends JPanel{

    public static final int WINDOW_WIDTH = 1280;
    public static final int WINDOW_HEIGHT = 768;
    
    private static final int BAR_WIDTH = 5;
    private static final int NUM_BARS = WINDOW_WIDTH / BAR_WIDTH;
    
    private int[] array;

    public Gui() {
        array = new int[NUM_BARS];
        for (int i = 0; i < NUM_BARS; i++) {
            array[i] = i;
        }
        //shuffle();
        setBackground(Color.darkGray);

        
        //new BubbleSort().runSort(new Gui());
    }

    //Getters

    public int getValue(int i) {
        return array[i];
    }
    public int getArrayLength() {
        return NUM_BARS;
    }

    public void swap(int index1, int index2, long delay) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        repaint();
        sleepFor(delay);
    }

    public static void sleepFor(long s) {
        long time;
        final long startTime = System.nanoTime();
        do {
            time = System.nanoTime() - startTime;
        } while(time < s);
    }

    public void shuffle() {
        Random rng = new Random();
        for (int i = 0; i < NUM_BARS; i++) {
            int swapIndex = rng.nextInt(NUM_BARS - 1);
            swap(i, swapIndex, 1000000);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D)g;
        super.paintComponent(graphics);
        
        graphics.setColor(Color.white);
        for (int j = 0; j < NUM_BARS; j++) {
            int height = array[j] * 3;
            int xStart = j + (BAR_WIDTH - 1) * j;
            int yStart = WINDOW_HEIGHT - height;

            graphics.fillRect(xStart, yStart, BAR_WIDTH, height);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT);
    }
}
