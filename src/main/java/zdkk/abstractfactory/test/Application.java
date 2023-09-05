package zdkk.abstractfactory.test;

import zdkk.abstractfactory.buttons.Button;
import zdkk.abstractfactory.checkboxed.CheckBox;
import zdkk.abstractfactory.factories.GUIFactory;

/**
 * @author zdkk
 * @create 2023-09-05 22:27
 */
public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
