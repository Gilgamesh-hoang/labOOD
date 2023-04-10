package ex4;

public class CeasarEncrypt extends  ComponentDecorator{
    private int shift;

    public CeasarEncrypt(Component component,int shift) {
        super(component);
        this.shift = shift;
    }


    @Override
    public String encode(String data) {
        // Kiểm tra nếu chuỗi đầu vào là null hoặc rỗng thì trả về chuỗi rỗng
        if (data == null || data.isEmpty()) {
            return "";
        }

        // Tạo một đối tượng StringBuilder để lưu kết quả của quá trình mã hóa
        StringBuilder ciphertext = new StringBuilder();

        // Duyệt từng ký tự trong chuỗi đầu vào
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);

            // Nếu ký tự là một ký tự chữ
            if (Character.isLetter(ch)) {
                // Xác định ký tự cơ sở ('a' nếu là chữ thường và 'A' nếu là chữ in)
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                // Tính toán mã ASCII mới cho ký tự bằng cách dịch chuyển
                ch = (char) (base + (ch - base + shift) % 26);
            }

            // Thêm ký tự đã được mã hóa vào chuỗi kết quả
            ciphertext.append(ch);
        }

        // Trả về chuỗi đã được mã hóa
        return ciphertext.toString();
    }

}
