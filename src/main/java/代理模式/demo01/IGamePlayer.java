package 代理模式.demo01;

/**
 * @program: mockito
 * @description: 游戏者接口
 * @author: HuRan
 * @create: 2020-07-13 16:08
 */
public interface IGamePlayer {
    //登录游戏
    public void login(String user,String password);
    public void killBoss();
    void upgrade();
}