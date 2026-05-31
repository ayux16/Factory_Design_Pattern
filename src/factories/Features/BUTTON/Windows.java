package factories.Features.BUTTON;

public class Windows implements Button {

    @Override
    public void click() {
            System.out.println("Windows Button Clicked");
    }

    @Override
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}
