package ex1;

public class MaxValueValidation implements ValidationStrategy {
    private long maxValue;

    public MaxValueValidation(long maxValue) {
        this.maxValue = maxValue;
    }


    @Override
    public boolean validate(String data) {
        return Double.parseDouble(data) < maxValue;
    }
}
