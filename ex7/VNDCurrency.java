package ex7;

public class VNDCurrency implements CurrencyUnit{
    @Override
    public String getSymbol() {
        return "d";
    }

    public double getRate() {
        return 23442;
    }
}