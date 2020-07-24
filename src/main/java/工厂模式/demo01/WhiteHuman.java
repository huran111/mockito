package 工厂模式.demo01;

/**
 * @program: mockito
 * @description: 白色人种
 * @author: HuRan
 * @create: 2020-07-02 17:18
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的！");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般都是但是单字节。");
    }
}