package 工厂模式.demo03;

/**
 * @program: mockito
 * @description: 黄色男性人种
 * @author: HuRan
 * @create: 2020-07-06 10:21
 */
public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}