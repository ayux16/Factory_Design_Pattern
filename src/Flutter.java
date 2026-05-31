import Platform.Platform;
import factories.Features.BUTTON.Button;
import factories.Features.DropDown.DropDown;
import factories.Features.Menu.Menu;
import Platform.*;
public class Flutter {
    public static void main(String[] args) {
        Platform platform = new Android_Platform();
        Button button = platform.createUIFactory().createButton();
        button.render();
        button.click();
        Menu menu = platform.createUIFactory().createMenu();
        menu.ListingMenu();
        DropDown dropDown = platform.createUIFactory().createDropDown();
        dropDown.dropdownmenu();

    }
}
