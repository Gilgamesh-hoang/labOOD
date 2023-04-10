package observer.clock;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class DigitalClock extends JFrame implements Observer {
    private Label hours;
    private Label minutes;
    private Label seconds;

    public DigitalClock(SystemTime time) {
        time.registerClock(this);
        init();
    }

    public void init() {
        this.setTitle("Digital clock");
        this.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        hours = new Label();
        minutes = new Label();
        seconds = new Label();
        Label character1 = new Label(":");
        Label character2 = new Label(":");
        panel.add(hours);
        panel.add(character1);
        panel.add(minutes);
        panel.add(character2);
        panel.add(seconds);
        this.add(panel, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(250, 70);
        this.setVisible(true);
    }

    @Override
    public void update(int hour, int minute, int second) {
        this.hours.setText(hour + "");
        this.minutes.setText(minute + "");
        this.seconds.setText(second + "");
    }

}
