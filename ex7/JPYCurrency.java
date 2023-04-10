package ex7;

public class JPYCurrency implements CurrencyUnit{
    @Override
    public String getSymbol() {
        return "JPY";
    }
    @Override
    public double getRate() {
        return 132;
    }

}