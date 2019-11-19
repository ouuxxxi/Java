/*
//环的长度
class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
}

class TestDemon10 {
   public  ListNode head;

    public TestDemon10() {
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

    public void creatLoop(){
        ListNode cur =this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=this.head.next.next;
    }

    public int listLen() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null||fast.next==null){
            return -1;
        }
        int count=1;
        fast=this.head;
        while(fast!=slow){
            fast=fast.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        TestDemon10 a = new TestDemon10();
        a.addLast(2);
        a.addLast(2);
        a.addLast(3);
        a.addLast(2);
        a.addLast(6);
        a.display();

        System.out.println(a.listLen());

       }
    }
*/
