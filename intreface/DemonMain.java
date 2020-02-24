package com.java.intreface;

public class DemonMain {
    public static void main(String[] args) {
        //创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();
        System.out.println("============");

        /*
        方法①：向下转型
        */
        USB usbMouse = new Mouse();
        computer.use(usbMouse);
        System.out.println("============");
        /*
        方法二：可以直接new: 类似于把int转成double => 把keyboard转成USB
        */
        Keyboard useKeyboard = new Keyboard();
        computer.use(useKeyboard); //本来括号里面是USB类型 ①
        //computer.use(new Keyboard());//使用匿名对象也可以 ②

        System.out.println("============");
        computer.powerOf();
    }
}
