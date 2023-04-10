package ex6;

public class OverseasTour  extends Tour{
    private String country;
    private double visaSurtax;

    public OverseasTour(String name, String description, int days, double basePrice, String country, double visaSurtax) {
        super(name, description, days, basePrice);
        this.country = country;
        this.visaSurtax = visaSurtax;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getVisaSurtax() {
        return visaSurtax;
    }

    public void setVisaSurtax(int visaSurtax) {
        this.visaSurtax = visaSurtax;
    }

    @Override
    public double price() {
        return super.getBasePrice() + visaSurtax;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " to " + country;
    }
}
