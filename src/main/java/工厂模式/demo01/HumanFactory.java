package 工厂模式.demo01;

/**
 * @program: mockito
 * @description: 人类创建工厂
 * @author: HuRan
 * @create: 2020-07-02 17:25
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human=null;
        try {

            human=(T)Class.forName(c.getName()).newInstance();
        }catch (Exception e){

        }
        return (T) human;
    }
}