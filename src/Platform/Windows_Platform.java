package Platform;

import factories.UI_Factory;
import factories.Windows_UI_factory;

public class Windows_Platform implements Platform {
    @Override
    public UI_Factory createUIFactory() {
        return new Windows_UI_factory();
    }
}
