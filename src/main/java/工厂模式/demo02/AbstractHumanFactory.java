package 工厂模式.demo02;

import 工厂模式.demo01.Human;

/**
 * @program: mockito
 * @description:
 * @author: HuRan
 * @create: 2020-07-06 10:04
 */
public abstract class AbstractHumanFactory {
    //　抽象方法中已经不再需要传递相关参数了，因为每一个具体的工厂都已经非常明
    //确自己的职责：创建自己负责的产品类对象。
    public abstract Human createHuman();
}