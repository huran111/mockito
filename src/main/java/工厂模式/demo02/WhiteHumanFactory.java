package 工厂模式.demo02;

import 工厂模式.demo01.Human;
import 工厂模式.demo01.WhiteHuman;

/**
 * @program: mockito
 * @description: 白色人种的创建
 * @author: HuRan
 * @create: 2020-07-06 10:06
 */
public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}