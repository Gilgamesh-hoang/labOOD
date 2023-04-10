package ex7;

public class CurrencyMeasure {
    private double value;
    private CurrencyUnit unit;
    private CurrencyConverter converter;

    public CurrencyMeasure(double value, CurrencyUnit unit) {
        this.value = value;
        this.unit = unit;
        this.converter = new USDCurrencyConverter();
    }

    public void setConverter(CurrencyConverter converter) {
        this.converter = converter;
    }

    public double getValue() {
        return value;
    }

    public CurrencyUnit getUnit() {
        return unit;
    }

    public CurrencyMeasure convert(CurrencyUnit toUnit) {
        double convertedValue = converter.convert(value, unit, toUnit);
        return new CurrencyMeasure(convertedValue, toUnit);
    }
}
