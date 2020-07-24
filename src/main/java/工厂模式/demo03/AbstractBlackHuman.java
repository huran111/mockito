package 工厂模式.demo03;

/**
 * @program: mockito
 * @description: 黑色人种
 * @author: HuRan
 * @create: 2020-07-06 10:18
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }

}