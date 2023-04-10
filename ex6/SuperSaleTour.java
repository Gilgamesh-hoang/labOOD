package ex6;

public class SuperSaleTour extends TourDecorator{
    private double saleRate;

    public SuperSaleTour(Tour tour, double saleRate) {
        super(tour);
        this.saleRate = saleRate;
    }

    @Override
    public double price() {
        double price = super.tour.price();
        double priceSale = price * (1-saleRate);
        return priceSale;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " (Super Sale - " + (int) (saleRate * 100) + "% off)";
    }
}
