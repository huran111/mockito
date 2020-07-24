package 策略模式.demo01;

/**
 * @program: mockito
 * @description: 乔国老开后门
 * @author: HuRan
 * @create: 2020-07-15 10:13
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}