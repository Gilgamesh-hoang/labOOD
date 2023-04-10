package ex1;

public class PhoneValidation implements ValidationStrategy {

    @Override
    public boolean validate(String data) {
        // kiểm tra chuỗi có 10 ký tự và bắt đầu bằng số 08
        return data.matches("^08\\d{8}$");
    }
}
