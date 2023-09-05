package zdkk.abstractfactory.buttons;

/**
 * @author zdkk
 * @create 2023-09-05 22:12
 * 抽象工厂假设您有几个产品系列，它们被构造成独立的类层次结构(按钮/复选框)。同一系列的所有产品都有通用界面。
 * 这是按钮系列的通用界面。
 */
public interface Button {
    void paint();
}
