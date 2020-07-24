package 建造者模式.demo01;

import java.util.ArrayList;

/**
 * @program: mockito
 * @description: 车辆模型的抽象类
 * @author: HuRan
 * @create: 2020-07-06 10:52
 */
public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<String>();
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    final public void run(){
        for (int i = 0; i < this.sequence.size(); i++) {
            String s = this.sequence.get(i);
            if(s.equalsIgnoreCase("start")){
                this.start();
            }
            if(s.equalsIgnoreCase("stop")){
                this.stop();
            }
            if(s.equalsIgnoreCase("alarm")){
                this.alarm();
            }
            if(s.equalsIgnoreCase("engineBoom")){
                this.engineBoom();
            }
        }
    }

   final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}