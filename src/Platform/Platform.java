package Platform;

import factories.Features.BUTTON.Button;
import factories.UI_Factory;

public interface Platform {
    UI_Factory createUIFactory();
}
