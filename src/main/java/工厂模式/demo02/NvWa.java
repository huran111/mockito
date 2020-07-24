package 工厂模式.demo02;

import 工厂模式.demo01.Human;

/**
 * @program: mockito
 * @description:
 * @author: HuRan
 * @create: 2020-07-06 10:07
 * <p>
 * 每一个产品类都对应了一个创建类，好处就是创建
 * 类的职责清晰，而且结构简单，但是给可扩展性和可维护性带来了一定的影响。为什么这么
 * 说呢？如果要扩展一个产品类，就需要建立一个相应的工厂类，这样就增加了扩展的难度。
 * 因为工厂类和产品类的数量相同，维护时需要考虑两个对象之间的关系。
 * 当然，在复杂的应用中一般采用多工厂的方法，然后再增加一个协调类，避免调用者与
 * 各个子工厂交流，协调类的作用是封装子工厂类，对高层模块提供统一的访问接口
 * </p>
 */
public class NvWa {
    public static void main(String[] args) {
        Human human = new WhiteHumanFactory().createHuman();
        human.getColor();
        human.talk();
    }
}