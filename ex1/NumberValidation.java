package ex1;

public class NumberValidation implements ValidationStrategy{

    @Override
    public boolean validate(String data) {
        int dauCham = 0;
        for (int i = 0; i < data.length(); i++) {
            char sub = data.charAt(i);
            if (!Character.isDigit(sub)) {
                if(sub == '.' && i >=1 && i <data.length()-1)
                    dauCham++;
                else
                    return false;
            }
        }
        return dauCham <=1;
    }
}
