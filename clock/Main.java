package observer.clock;

import java.time.LocalTime;

public class Main extends Thread{
    public static void main(String[] args) {
        SystemTime time = new SystemTime();
        DigitalClock digitalClock = new DigitalClock(time);
        AnalogClockDisplay analogClockDisplay = new AnalogClockDisplay(time);
        while (true) {
            time.setTime(LocalTime.now());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
