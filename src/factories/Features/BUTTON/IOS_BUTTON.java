package factories.Features.BUTTON;

public class IOS_BUTTON implements Button {

    @Override
    public void click() {
            System.out.println("IOS Button Clicked");
    }

    @Override
    public void render() {
        System.out.println("Rendering IOS Button");
    }
}
