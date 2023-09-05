package zdkk.abstractfactory.buttons;

/**
 * @author zdkk
 * @create 2023-09-05 22:14
 * 所有产品系列都有相同的品种(MacOS/Windows)。
 */
public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("MacOS Button");
    }
}
