class ListNode {
    public int data; //data可以是任何类型
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}  //节点类
 class MySignalList {

     public ListNode head; //定义头部

     public MySignalList() {
         this.head = null;
     }
     //单链表


     //一、头插法   node 代表该节点的地址
     public void addFirst(int data) {
         ListNode node = new ListNode(data);//列表为空

         // 判断是不是第一插入？ 不是的话就如下代码所示
         if (this.head == null) {
             this.head = node;
         } else {
             node.next = this.head;
             this.head = node;
         }

     }

     //二、尾插法  cur:定义的引用 指向head
     public void addLast(int data) {
         ListNode node = new ListNode(data);
         ListNode cur = this.head;
         if (this.head == null) {
             this.head = node;
         } else {
             while (cur.next != null) {
                 cur = cur.next;//不为空，就一直往后走
             }
             cur.next = node;
         }
     }

     //三、查找是否包含关键字key是否在单链表当中
     public boolean contains(int key) {
         ListNode cur = this.head;//从头开始
         while (cur != null) {
             if (cur.data == key) {
                 return true;
             }
             cur = cur.next;//一直往后走
         }
         return false;
     }

     //四、得到单链表的长度
     public int getLength() {
         ListNode cur = this.head;
         int count = 0;
         while (cur != null) {
             count++;
             cur = cur.next;
         }
         return count;
     }

     //五、任意位置插入,第一个数据节点为0号下标

     private ListNode searchIndex(int index) {
         ListNode cur = this.head;
         //cur -> index-1
         int count = 0;
         while (count < index - 1) {
             count++; //每走一次 count就加一次
             cur = cur.next;
         }
         return cur;
     }

     public boolean addIndex(int index, int data) {

         //判断index是否合法

         if (index < 0 | index > getLength()) {
             System.out.println("index不合法！");
             return false;
         }
         if (index == 0) { //头插法
             addFirst(data);
             return true;
         }

         //找到index-1的位置
         ListNode cur = searchIndex(index);
         ListNode node = new ListNode(data);//每次node引用时，需要先new一个node
         node.next = cur.next;
         cur.next = node;
         return true;
     }


     //
     private ListNode searchPre(int key) {
         //创建一个方法便于找到前驱
         ListNode pre = this.head;
         //头已经判断过了
         while (pre.next != null) {
             if (pre.next.data == key) {
                 return pre;
             }
         }
         return null;
     }

     //六、删除第一次出现关键字为key的节点
     public void remove(int key) {
         if (this.head == null) {
             System.out.println("单链表为空");
             return;
         }
         //0、删除的节点是否是头结点
         if (this.head.data == key) {
             this.head = this.head.next;
             return;
         }

         //1、找到key的前驱  如果返回空
         ListNode pre = searchPre(key);
         //2、删除节点
         ListNode del = pre.next;
         pre.next = del.next;
     }


     //七、删除所有值为key的节点
     public void removeAllKey(int key) {
         ListNode pre = this.head;
         ListNode cur = this.head.next;
         while (cur != null) {
             if (pre.next.data == key) {
                 pre.next = cur.next;
                 cur = cur.next;
             } else {    //  if(pre.next.data!=key)
                 pre = cur;
                 cur = cur.next;
             }
             if (this.head.data == key) { //如果头节点为删除的数
                 this.head = this.head.next;
             }
         }

     }

     //打印单链表
     public void display() {
         ListNode cur = this.head;
         while (cur != null) {
             System.out.print(cur.data + " ");
             cur = cur.next;
         }
         System.out.println();
     }
     public void display2(ListNode newHead) {
         ListNode cur = newHead;
         while (cur != null) {
             System.out.print(cur.data + " ");
             cur = cur.next;
         }
         System.out.println();
     }

}

