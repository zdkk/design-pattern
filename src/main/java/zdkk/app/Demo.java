package zdkk.app;

import zdkk.abstractfactory.factories.GUIFactory;
import zdkk.abstractfactory.factories.MacOSFactory;
import zdkk.abstractfactory.factories.WindowsFactory;
import zdkk.abstractfactory.test.Application;

/**
 * @author zdkk
 * @create 2023-09-05 22:27
 */
public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
