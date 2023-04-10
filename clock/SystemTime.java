package observer.clock;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SystemTime implements Subject{
    private int hour;
    private int minute;
    private int second;
    private List<Observer> list;

    public SystemTime() {
        this.list = new ArrayList<>();
    }

    @Override
    public void registerClock(Observer observer) {
        if(!list.contains(observer))
            list.add(observer);
    }

    @Override
    public void unRegisterClock(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : list)
            observer.update(hour,minute,second);
    }
    public void setTime(LocalTime time) {
        this.hour = time.getHour();
        this.minute = time.getMinute();
        this.second = time.getSecond();
        System.out.println(time.toString());
        notifyObserver();

    }

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time.toString());
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
    }
}
