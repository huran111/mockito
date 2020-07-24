package 建造者模式.demo01;

import java.util.ArrayList;

/**
 * @program: mockito
 * @description: 奔驰车组装者
 * @author: HuRan
 * @create: 2020-07-06 13:52
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}