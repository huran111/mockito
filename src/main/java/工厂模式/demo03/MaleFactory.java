package 工厂模式.demo03;

/**
 * @program: mockito
 * @description: 生产男性的八卦炉
 * @author: HuRan
 * @create: 2020-07-06 10:23
 */
public class MaleFactory implements HumanFactory {
    //生产出黑人男性
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }

    @Override
    public Human createBlackHuman() {
        return null;
    }
}