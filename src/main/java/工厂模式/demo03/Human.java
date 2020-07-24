package 工厂模式.demo03;

/**
 * @program: mockito
 * @description: 人类
 * @author: HuRan
 * @create: 2020-07-06 10:11
 */
public interface Human {
    //每个人都因该有响应的颜色
    void getColor();

    // 人类会说话
    public void talk();

    //性别
    public void getSex();
}