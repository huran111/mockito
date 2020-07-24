package 模板模式.demo01;

/**
 * @program: mockito
 * @description: 抽象悍马模型
 * @author: HuRan
 * @create: 2020-07-06 10:36
 */
public abstract class HummerModel {
    protected abstract void start();
    protected abstract void stop();
    //喇叭会出声音，是滴滴叫，还是哔哔叫
    protected abstract void alarm();
    //引擎会轰隆隆地响，不响那是假的
    protected abstract void engineBoom();
    //那模型应该会跑吧，别管是人推的，还是电力驱动的，总之要会跑
    public  void run(){
        this.start();
        this.engineBoom();
        //要让它叫的就是就叫，喇嘛不想让它响就不响
        if(isAlarm()){
            this.alarm();
        }
        this.stop();
    }
    //钩子方法，默认喇叭是会响的
    protected  boolean isAlarm(){
        return true;
    }
}