package ex7;

public interface CurrencyConverter {
    double convert(double amount, CurrencyUnit fromUnit, CurrencyUnit toUnit);
}
