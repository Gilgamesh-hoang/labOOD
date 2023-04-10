package ex7;

public class GBPCurrency implements CurrencyUnit{
    @Override
    public String getSymbol() {
        return "USD";
    }
    @Override
    public double getRate() {
        return 0.81;
    }
}