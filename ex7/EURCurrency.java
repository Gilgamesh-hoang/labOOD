package ex7;

public class EURCurrency implements CurrencyUnit{
    @Override
    public String getSymbol() {
        return "EUR";
    }

    @Override
    public double getRate() {
        return 0.92;
    }
}
