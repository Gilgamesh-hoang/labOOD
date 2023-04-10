package ex1;

public class MinValueValidation implements ValidationStrategy {
    private long minValue;

    public MinValueValidation(long minValue) {
        this.minValue = minValue;
    }


    @Override
    public boolean validate(String data) {
        return Double.parseDouble(data) > minValue;
    }
}
