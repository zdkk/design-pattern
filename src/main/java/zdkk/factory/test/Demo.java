package zdkk.factory.test;

import zdkk.factory.realfactory.Dialog;
import zdkk.factory.realfactory.HtmlDialog;
import zdkk.factory.realfactory.WindowsDialog;

/**
 * @author zdkk
 * @create 2023-09-04 22:05
 */
public class Demo {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
}
