package ex1;

public class RangeValueValidation implements ValidationStrategy {
    private ValidationStrategy maxVal;
    private ValidationStrategy minVal;

    public RangeValueValidation(ValidationStrategy maxVal, ValidationStrategy minVal) {
        this.maxVal = maxVal;
        this.minVal = minVal;
    }
    @Override
    public boolean validate(String data) {
        return maxVal.validate(data) && minVal.validate(data);
    }
}
