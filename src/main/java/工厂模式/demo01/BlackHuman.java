package 工厂模式.demo01;

/**
 * @program: mockito
 * @description: 黑色人种
 * @author: HuRan
 * @create: 2020-07-02 17:17
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }
}