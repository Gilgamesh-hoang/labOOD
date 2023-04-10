package ex1;

public class EmailValidation implements ValidationStrategy{

    @Override
    public boolean validate(String data) {
        return data.contains("@");
    }
}
