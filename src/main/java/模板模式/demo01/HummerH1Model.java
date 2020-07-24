package 模板模式.demo01;

/**
 * @program: mockito
 * @description: H1型号悍马模型
 * @author: HuRan
 * @create: 2020-07-06 10:38
 */
public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true; //要响喇叭
    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }

    @Override
    protected boolean isAlarm() {
        return alarmFlag;
    }
    //要不要响喇叭，是由客户来决定的
    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }
}