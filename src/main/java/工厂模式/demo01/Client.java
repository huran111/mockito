package 工厂模式.demo01;

/**
 * @program: mockito
 * @description:
 * @author: HuRan
 * @create: 2020-07-02 17:27
 */
public class Client {
    public static void main(String[] args) {
        AbstractHumanFactory factory=new HumanFactory();
        WhiteHuman human = factory.createHuman(WhiteHuman.class);
        human.getColor();human.talk();
        YellowHuman yellowHuman = factory.createHuman(YellowHuman.class);
        yellowHuman.getColor();yellowHuman.talk();

    }
}