
class Person {
    private String name;
    private int age;

    // 默认构造函数； 构造对象
    public Person() {
        this.name = "易烊千玺";
        this.age = 19;
    }

    //带有两个参数的构造函数
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(this.name + "吃饭！");
    }

    public void sleep() {
        System.out.println(this.name + "睡觉！");
    }

    public void show() {
        System.out.println("name: " + name + " age: " + age);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("小余",20);
        Person person2= new Person("小张",19);
        person1.eat();
        person2.sleep();
        person.show();
        person1.show();
    }
}
