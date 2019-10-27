import java.util.Arrays;

class MyArrayList {
    public int usedSize;
    public int[] elem;

    public final int CAPACITY = 10;

    public MyArrayList() {
        this.usedSize = 0;
        this.elem = new int[CAPACITY];
    }

    //看是否满了；满了就扩容
    private boolean isFull() {
        if (this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }

    public void add(int pos, int data) {
        if (isFull()) {
            this.elem = new int[elem.length * 2];
            this.elem = Arrays.copyOf(this.elem, this.elem.length * 2);

        }


        //1、pos是否合法
        if ((pos < 0) || pos > this.usedSize) {
            System.out.println("不能插入");
        }

        //2、挪数据
        for (int i = usedSize - 1; i >= pos; i--) {
            elem[i + 1] = elem[i];
        }

        //3、插入数据
        this.elem[pos] = data;

        // usedSize++
        usedSize++;
    }

    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.println(elem[i]);
        }
    }
}
public class One {
    public static void main(String[] args) {
        MyArrayList myarraylist = new MyArrayList();
        myarraylist.add(0,1);
        myarraylist.add(1,2);
        myarraylist.add(2,3);
        myarraylist.add(3,4);
        myarraylist.add(4,5);
        myarraylist. display();

    }
}
