package 策略模式.demo01;

/**
 * @program: mockito
 * @description:
 * @author: HuRan
 * @create: 2020-07-15 10:15
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}