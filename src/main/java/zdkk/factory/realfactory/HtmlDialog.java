package zdkk.factory.realfactory;

import zdkk.factory.buttons.Button;
import zdkk.factory.buttons.HtmlButton;

/**
 * @author zdkk
 * @create 2023-09-04 22:04
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
