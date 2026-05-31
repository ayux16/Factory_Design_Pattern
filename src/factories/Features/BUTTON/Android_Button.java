package factories.Features.BUTTON;

public class Android_Button implements Button {

    @Override
    public void click() {
        System.out.println("Android click");
    }

    @Override
    public void render() {
        System.out.println("Android render");
    }
}
