package 工厂模式.demo01;

/**
 * @program: mockito
 * @description: 黄色人种
 * @author: HuRan
 * @create: 2020-07-02 17:17
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节。");
    }
}