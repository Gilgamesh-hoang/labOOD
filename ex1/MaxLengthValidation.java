package ex1;

public class MaxLengthValidation implements ValidationStrategy{
    private int maxLength;

    public MaxLengthValidation(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public boolean validate(String data) {
        return data.length() <= maxLength;
    }
}
