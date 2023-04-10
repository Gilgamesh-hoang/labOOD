package ex2;

import java.util.ArrayList;
import java.util.List;

public class TempurateData implements Subject{
    private List<Observer> list = new ArrayList<>();
    private double tempurateC;
    private double tempurateF;

    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : list)
            observer.update(tempurateC,tempurateF);
    }

    public void setData(double tempurateC, double tempurateF, String flagC, String flagF) {
        if (flagC != null) {
            this.tempurateC = tempurateC;
            this.tempurateF = (tempurateC * 1.8) + 32;
        }else if (flagF != null) {
            this.tempurateC = (tempurateF - 32) * 5/9;
            this.tempurateF = tempurateF;
        }
        System.out.println("tempuratedata:");
        System.out.println("c:"+tempurateC);
        System.out.println("f:"+tempurateF);
        notifyObserver();
    }
}
