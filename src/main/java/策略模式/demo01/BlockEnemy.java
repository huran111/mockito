package 策略模式.demo01;

/**
 * @program: mockito
 * @description: 孙夫人断后
 * @author: HuRan
 * @create: 2020-07-15 10:14
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}