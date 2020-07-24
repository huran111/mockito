package 工厂模式.demo03;

/**
 * @program: mockito
 * @description: 生产女性的八卦炉
 * @author: HuRan
 * @create: 2020-07-06 10:22
 */
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }

    @Override
    public Human createBlackHuman() {
        return null;
    }
}