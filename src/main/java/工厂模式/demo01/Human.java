package 工厂模式.demo01;

/**
 * @program: mockito
 * @description: 人类总称
 * @author: HuRan
 * @create: 2020-07-02 17:15
 */
public interface Human {
    //每个人种的皮肤都有相应的颜色
    public void getColor();
    //人类会说话
    public void talk();
}