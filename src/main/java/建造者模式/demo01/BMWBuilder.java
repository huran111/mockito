package 建造者模式.demo01;

import java.util.ArrayList;

/**
 * @program: mockito
 * @description: 宝马车组装者
 * @author: HuRan
 * @create: 2020-07-06 13:53
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}