package test;

import org.junit.Test;

/**
 * @program: mockito
 * @description: String intern方法作用
 * @author: HuRan
 * @create: 2020-06-30 14:31
 */
public class Test01 {

    /**
     * 在字符串常量中，默认会将对象放入常量池；在字符串变量中，对象是会创建在堆内存中，同时
     * 也会在常量池中创建一个字符串对象，引用赋值到堆内存对象中，并返回堆内存对象引用。
     * 如果调用intern方法，会去查看字符串常量池中是否有等于该对象的字符串，如果没有，就在常 量池中新增该对象，并返回该对象引用；如果有，就返回常量池中的字符串引用。堆内存中原有
     * 的对象由于没有引用指向它，将会通过垃圾回收器回收。
     * @param args
     */
    public static void main(String[] args) {
        String a =new String("abc").intern();
        String b = new String("abc").intern();
        if(a==b) {    System.out.print("a==b"); }
    }
    @Test
    public void  hex(){
        String hex= Integer.toHexString(-128);
        System.out.println(hex);
    }
}