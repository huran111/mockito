package 工厂模式.demo03;

/**
 * @program: mockito
 * @description: 八卦炉定义
 * @author: HuRan
 * @create: 2020-07-06 10:21
 */
public interface HumanFactory {
    //制造一个黄色人种
    public Human createYellowHuman();
    //制造一个白色人种
    public Human createWhiteHuman();
    //制造一个黑色人种
    public Human createBlackHuman();
}