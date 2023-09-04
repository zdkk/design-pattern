package zdkk.factory.realfactory;

import zdkk.factory.buttons.Button;

/**
 * @author zdkk
 * @create 2023-09-04 22:02
 */
// 基础工厂类
public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
