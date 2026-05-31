package factories;

import factories.Features.BUTTON.Button;
import factories.Features.BUTTON.Windows;
import factories.Features.DropDown.DropDown;
import factories.Features.DropDown.Windows_DropDowwn;
import factories.Features.Menu.Menu;
import factories.Features.Menu.Windows_Menu;

public class Windows_UI_factory implements UI_Factory {
    @Override
    public Button createButton() {
        return new Windows();
    }

    @Override
    public DropDown createDropDown() {
        return new Windows_DropDowwn();
    }

    @Override
    public Menu createMenu() {
        return new Windows_Menu();
    }
}
