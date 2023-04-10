package ex4;

public class SubstitutionCipher extends ComponentDecorator{
    private static final String SUBSTITUTION_ALPHABET = "zyxwvutsrqponmlkjihgfedcba";
    public SubstitutionCipher(Component component) {
        super(component);
    }

    @Override
    public String encode(String data) {
        StringBuilder result = new StringBuilder();
        for (char c : data.toCharArray()) {
            int index = Character.toLowerCase(c) - 'a';
            if (index >= 0 && index < 26) {
                result.append(Character.isLowerCase(c) ? SUBSTITUTION_ALPHABET.charAt(index) :
                        Character.toUpperCase(SUBSTITUTION_ALPHABET.charAt(index)));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
