package zdkk.abstractfactory.factories;

import zdkk.abstractfactory.buttons.Button;
import zdkk.abstractfactory.buttons.WindowsButton;
import zdkk.abstractfactory.checkboxed.CheckBox;
import zdkk.abstractfactory.checkboxed.WindowsCheckBox;

/**
 * @author zdkk
 * @create 2023-09-05 22:26
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
