package ex7;

public class USDCurrency implements CurrencyUnit{
    public String getSymbol() {
        return "$";
    }
    @Override
    public double getRate() {
        return 1.0;
    }
}
