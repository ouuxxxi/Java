package com.java.intreface;

//笔记本电脑
public class Computer {
    public void powerOn() {
        System.out.println("电脑开机");
    }
    public void powerOf() {
        System.out.println("电脑关机");
    }

    public void use(USB usb){
        usb.open();
        usb.close();
        if(usb instanceof Mouse){ //向下转型
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard)usb;
            keyboard.input();
        }
    }
}
