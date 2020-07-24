package 工厂模式.demo02;

import 工厂模式.demo01.Human;
import 工厂模式.demo01.YellowHuman;

/**
 * @program: mockito
 * @description: 黑色人种的创建工厂实现
 * @author: HuRan
 * @create: 2020-07-06 10:05
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}