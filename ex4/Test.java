package ex4;

public class Test {

    public static void main(String[] args) {
        // dùng decorator
        Component myComponent = new CeasarEncrypt(new MyComponent(), 2);
        myComponent.input("abc");
        myComponent.process();
        System.out.println(myComponent.getResult());

        Component myComponent2 = new SubstitutionCipher(new MyComponent());
        myComponent2.input("HellO");
        myComponent2.process();
        System.out.println(myComponent2.getResult());
    }

}
