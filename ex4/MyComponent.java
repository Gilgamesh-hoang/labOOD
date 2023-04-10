package ex4;

public class MyComponent implements Component{

    private String data;
    private String result;

    @Override
    public void input(String data) {
        this.data = data;
    }

    @Override
    public void process() {
        result = data.trim();
    }

    @Override
    public String getResult() {
        return result;
    }
}
