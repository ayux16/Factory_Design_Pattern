package Platform;

import factories.Andriod_UI_Factory;
import factories.UI_Factory;

public class Android_Platform implements Platform {
    @Override
    public UI_Factory createUIFactory() {
        return new Andriod_UI_Factory();
    }
}
