package 建造者模式.demo01;

import java.util.ArrayList;

/**
 * @program: mockito
 * @description: 抽象汽车组装者
 * @author: HuRan
 * @create: 2020-07-06 11:13
 */
public abstract class CarBuilder {
    //建造一个模型，你要给我一个顺序要求，就是组装顺序
    public abstract void setSequence(ArrayList<String> sequence);
    //设置完毕顺序后，就可以直接拿到这个车辆模型
    public abstract CarModel getCarModel();
}