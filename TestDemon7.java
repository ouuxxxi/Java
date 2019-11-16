// 链表的回文结构

/*
class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
}

class TestDemon7 {
   public  ListNode head;

    public TestDemon7() {
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

    public boolean chkPalindrome() {
        ListNode fast = this.head;
        ListNode slow = this.head;

        //寻找中间节点
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //反转
        ListNode p = slow.next;
        while (p != null) {
            ListNode pNext = p.next;
            //
            p.next = slow;
            slow = p;
            p = pNext;
        }
        while (this.head != slow) {
            if (this.head.data != slow.data) {
                return false;
            }
            //偶数
            if (this.head.next == slow) {
                return true;
            }
            this.head = this.head.next;
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        TestDemon7 a = new TestDemon7();
        a.addLast(1);
        a.addLast(2);
        a.addLast(3);
        a.addLast(2);
        a.addLast(5);
        a.display();

        System.out.println(a.chkPalindrome());

    }
}
*/
