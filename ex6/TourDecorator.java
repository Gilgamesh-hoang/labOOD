package ex6;

public abstract class TourDecorator extends Tour{
    protected Tour tour;

    public TourDecorator(Tour tour) {
        super(tour.name, tour.description, tour.days, tour.basePrice);
        this.tour = tour;
    }

//    public abstract double price();
@Override
public double price() {
    return tour.price();
}
    public String getDescription() {
        return tour.getDescription();
    }
}
