//给定一个链表，判断链表中是否有环

/*class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
}

class TestDemon8 {
   public  ListNode head;

    public TestDemon8() {
        this.head = null;
    }

    public void addLast(int data) {
        ListNode cur = this.head;
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void creatLoop() {
        ListNode cur = this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=this.head.next.next;
    }

    public boolean hasCycle() {
        ListNode fast =this.head;
        ListNode slow=this.head;
        while(fast!=null && fast.next!=null ){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        TestDemon8 a = new TestDemon8();
        a.addLast(1);
        a.addLast(3);
        a.addLast(2);
        a.addLast(3);
        a.addLast(5);
        a.display();

        a.creatLoop();
        boolean flg=a.hasCycle();
        System.out.println(flg);
    }
}*/
