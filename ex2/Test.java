package ex2;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Test extends JPanel {
    private int temperature;

    public Test(int temperature) {
        this.temperature = temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // draw background
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);

        // draw outline
        g2d.setColor(Color.BLACK);
        g2d.drawRect(0, 0, width - 1, height - 1);

        // draw thermometer bulb
        g2d.setColor(Color.RED);
        int bulbWidth = 30;
        int bulbHeight = height / 3;
        int bulbX = (width - bulbWidth) / 2;
        int bulbY = height - bulbHeight;
        g2d.fillRect(bulbX, bulbY, bulbWidth, bulbHeight);

        // draw thermometer tube
        g2d.setColor(Color.BLACK);
        int tubeWidth = 10;
        int tubeX = (width - tubeWidth) / 2;
        int tubeY = 0;
        int tubeHeight = height - bulbHeight;
        g2d.fillRect(tubeX, tubeY, tubeWidth, tubeHeight);

        // draw temperature level
        g2d.setColor(Color.BLUE);
        int levelHeight = (int) ((double) temperature / 100 * (height - bulbHeight));
        int levelY = tubeHeight - levelHeight;
        g2d.fillRect(tubeX, levelY, tubeWidth, levelHeight);

        g2d.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(50, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Thermometer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Test thermometer = new Test(50);
        frame.add(thermometer);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // simulate changing temperature
        new Thread(() -> {
            while (true) {
                int temperature = (int) (Math.random() * 100);
                thermometer.setTemperature(temperature);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
