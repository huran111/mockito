package 门面模式.demo01;

/**
 * @program: mockito
 * @description: 客户端
 * @author: HuRan
 * @create: 2020-07-02 16:01
 */
public class Client {
    public static void main(String[] args) {
        ILetterProcess letterProcess=new LetterProcessImpl();
        letterProcess.writeContext("hello huran");
        letterProcess.fillEnvelope("43434");
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();
    }
}