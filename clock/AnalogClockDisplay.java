package observer.clock;

import javax.swing.*;
import java.awt.*;

public class AnalogClockDisplay extends JFrame implements Observer {
    AnalogClock clock;
    int hour;
    int minute;
    int second;

    public AnalogClockDisplay(SystemTime time) {
        time.registerClock(this);
        clock = new AnalogClock(hour, minute, second);
        init();
    }

    public void init() {
        this.setTitle("Analog clock");
        this.setLayout(new BorderLayout());
        this.add(clock, BorderLayout.CENTER);
        this.setBackground(Color.lightGray);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(500, 500);
        this.setVisible(true);
    }


    @Override
    public void update(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        clock.setHour(hour);
        clock.setMinute(minute);
        clock.setSecond(second);
        repaint();
    }
}
