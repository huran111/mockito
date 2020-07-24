package 代理模式.demo01;

/**
 * @program: mockito
 * @description:
 * @author: HuRan
 * @create: 2020-07-13 16:20
 */
public class Client {
    public static void main(String[] args) {
        //定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
        player.login("zhangSan", "password");
        player.killBoss();
        player.upgrade();
    }
}