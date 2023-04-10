package ex1;

public class MinLengthValidation implements ValidationStrategy{
    private int minLength;

    public MinLengthValidation(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean validate(String data) {
        return data.length() >= minLength;
    }
}
