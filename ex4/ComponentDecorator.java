package ex4;

public abstract class ComponentDecorator implements Component{

    protected Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }
    public abstract String encode(String data);

    @Override
    public void input(String data) {
        component.input(data);
    }

    @Override
    public void process() {
        component.process();
        String res = component.getResult();
        String encrypt = encode(res);
        component.input(encrypt);
        component.process();
    }

    @Override
    public String getResult() {
        return component.getResult();
    }
}
