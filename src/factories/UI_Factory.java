package factories;

import factories.Features.BUTTON.Button;
import factories.Features.DropDown.DropDown;
import factories.Features.Menu.Menu;

public interface UI_Factory {
    Button createButton();
    DropDown createDropDown();
    Menu createMenu();
}
