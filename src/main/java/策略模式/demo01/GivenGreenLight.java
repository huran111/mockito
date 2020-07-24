package 策略模式.demo01;

/**
 * @program: mockito
 * @description: 吴国太开绿灯
 * @author: HuRan
 * @create: 2020-07-15 10:12
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯,放行！");
    }
}