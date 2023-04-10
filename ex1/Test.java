package ex1;

public class Test {
    public static void main(String[] args) {
        ValidationStrategy email = new EmailValidation();
        ValidationStrategy maxLength = new MaxLengthValidation(20);
        ValidationStrategy minLength = new MinLengthValidation(5);
        ValidationStrategy number = new NumberValidation();
        ValidationStrategy phone = new PhoneValidation();

        ValidationStrategy maxVal = new MaxValueValidation(100) ;
        ValidationStrategy minVal = new MinValueValidation(10);
        ValidationStrategy range = new RangeValueValidation(maxVal, minVal);


        // Tạo một TextComponent và thêm các chiến lược kiểm tra vào
        TextComponent textComponent = new TextComponent("example@email");
        textComponent.addValidStrategy(email);

        // Kiểm tra tính hợp lệ của dữ liệu
        boolean isDataValid = textComponent.validate(textComponent.getData());

        // In kết quả
        if (isDataValid) {
            System.out.println("Data is valid");
        } else {
            System.out.println("Data is not valid");
        }

        // Tạo một NumberComponent và thêm các chiến lược kiểm tra vào
        NumberComponent numberComponent = new NumberComponent(5.5);
        numberComponent.addValidStrategy( number);
        numberComponent.addValidStrategy( phone);

        // Kiểm tra tính hợp lệ của dữ liệu
        isDataValid = numberComponent.validate(Double.toString(numberComponent.getData()));

        // In kết quả
        if (isDataValid) {
            System.out.println("Data is valid");
        } else {
            System.out.println("Data is not valid");
        }
    }
}
