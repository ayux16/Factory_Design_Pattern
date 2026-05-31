package Platform;

import factories.IOS_UI_Factory;
import factories.UI_Factory;

public class IOS_Platform implements Platform {
    @Override
    public UI_Factory createUIFactory() {
        return new IOS_UI_Factory();
    }
}
