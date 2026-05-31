package factories;

import factories.Features.BUTTON.Button;
import factories.Features.BUTTON.IOS_BUTTON;
import factories.Features.DropDown.DropDown;
import factories.Features.DropDown.IOS_DropDown;
import factories.Features.Menu.IOS_Menu;
import factories.Features.Menu.Menu;

public class IOS_UI_Factory implements UI_Factory {
    @Override
    public Button createButton() {
        return new IOS_BUTTON();
    }

    @Override
    public DropDown createDropDown() {
        return new IOS_DropDown();
    }

    @Override
    public Menu createMenu() {
        return new IOS_Menu();
    }
}
