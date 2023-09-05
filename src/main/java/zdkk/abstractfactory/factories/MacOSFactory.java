package zdkk.abstractfactory.factories;

import zdkk.abstractfactory.buttons.Button;
import zdkk.abstractfactory.buttons.MacOSButton;
import zdkk.abstractfactory.checkboxed.CheckBox;
import zdkk.abstractfactory.checkboxed.WindowsCheckBox;

/**
 * @author zdkk
 * @create 2023-09-05 22:25
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
