package 工厂模式.demo01;

/**
 * @program: mockito
 * @description:
 * @author: HuRan
 * @create: 2020-07-02 17:21
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}