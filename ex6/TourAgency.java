package ex6;

import java.util.ArrayList;
import java.util.List;

public class TourAgency {
    private List<Tour> listTour;

    public TourAgency() {
        this.listTour = new ArrayList<>();
    }

    public void addTour(Tour tour) {
        listTour.add(tour);
    }

    public void printTours() {
        for(Tour tour : listTour)
            System.out.println(tour.getDescription());
    }

    public double getTotalPrice() {
        double price = 0;
        for(Tour tour : listTour)
            price += tour.price();
        return price;
    }



}
