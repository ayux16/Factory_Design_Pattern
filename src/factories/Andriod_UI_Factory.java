package factories;
import factories.Features.BUTTON.Android_Button;
import factories.Features.BUTTON.Button;
import factories.Features.DropDown.Android_DropDown;
import factories.Features.DropDown.DropDown;
import factories.Features.Menu.Android_Menu;
import factories.Features.Menu.Menu;

public class Andriod_UI_Factory implements UI_Factory {

    @Override
    public Button createButton() {
        return new Android_Button();
    }

    @Override
    public DropDown createDropDown() {
        return new Android_DropDown();
    }

    @Override
    public Menu createMenu() {
        return new Android_Menu();
    }


}
