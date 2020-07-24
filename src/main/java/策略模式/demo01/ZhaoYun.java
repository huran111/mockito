package 策略模式.demo01;

/**
 * @program: mockito
 * @description:
 * @author: HuRan
 * @create: 2020-07-15 10:16
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        context = new Context(new BackDoor()); //拿到妙计
        context.operate();
        context = new Context(new GivenGreenLight());
        context.operate();
    }
}