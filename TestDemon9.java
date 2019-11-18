//给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
/*
class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
}

class TestDemon9 {
   public  ListNode head;

    public TestDemon9() {
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
        ListNode cur =this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=this.head.next.next;
    }

    public ListNode detectCycle() {
        ListNode fast=this.head;
        ListNode slow=this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }
        fast=this.head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }


    public static void main(String[] args) {
        TestDemon9 a = new TestDemon9();
        a.addLast(2);
        a.addLast(2);
        a.addLast(3);
        a.addLast(2);
        a.addLast(6);
        a.display();

        a.creatLoop();
        ListNode node= a.detectCycle();
        System.out.println(node.data);

    }
}
*/





