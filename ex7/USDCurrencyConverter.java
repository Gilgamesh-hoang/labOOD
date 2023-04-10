package ex7;

public class USDCurrencyConverter implements CurrencyConverter {
    @Override
    public double convert(double amount, CurrencyUnit fromUnit, CurrencyUnit toUnit) {
        double usdAmount = amount / fromUnit.getRate();
        return usdAmount * toUnit.getRate();
    }
}