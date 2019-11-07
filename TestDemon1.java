//反转单列表
/*
class ListNode {
    public int data; //data可以是任何类型
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}  //节点类
class TestDemon1 {

    public ListNode head; //定义头部

    public TestDemon1() {
        this.head = null;
    }
    //单链表
    private void addFirst(int data) {
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
        }else{
            node.next=this.head;
            this.head=node;
        }
    }

    public ListNode reserveList(){
        ListNode prev=null;
        ListNode newHead=null;
        ListNode cur = this.head;
        while(cur!=null){
            ListNode curNext= cur.next;
            if (curNext == null) {
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
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
    public static void main(String[] args) {
        TestDemon1 mySignalList = new TestDemon1();
        mySignalList.addFirst(1);
        mySignalList.addFirst(2);
        mySignalList.addFirst(3);
        mySignalList.addFirst(4);
        mySignalList.addFirst(5);
        mySignalList.display();

       ListNode node=mySignalList.reserveList();
        mySignalList.display2(node);

    }

}
*/