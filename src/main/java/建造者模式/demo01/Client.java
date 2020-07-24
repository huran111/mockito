package 建造者模式.demo01;

import java.util.ArrayList;

/**
 * @program: mockito
 * @description: 奔驰模型代码
 * @author: HuRan
 * @create: 2020-07-06 11:01
 */
public class Client {
    public static void main(String[] args) {
//        BenzModel benz = new BenzModel();
//        ArrayList<String> sequence = new ArrayList<String>();
//        sequence.add("engineBoom");
//        //客户要求，run的时候先发动引擎
//        sequence.add("start");
//        //启动起来
//        sequence.add("stop");
//        //开了一段就停下来
//        benz.setSequence(sequence);
//        benz.run();
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engineBoom"); //客户要求，run时候时候先发动引擎
        sequence.add("start"); //启动起来
        sequence.add("stop"); //开了一段就停下来
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel carModel = (BenzModel) benzBuilder.getCarModel();
        carModel.run();

    }
}