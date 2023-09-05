package zdkk.abstractfactory.factories;

import zdkk.abstractfactory.buttons.Button;
import zdkk.abstractfactory.checkboxed.CheckBox;

/**
 * @author zdkk
 * @create 2023-09-05 22:21
 */
public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
