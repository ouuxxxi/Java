//在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
//如果没有把tmp.next设置为空？ display2

/*class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data){
        this.data=data;
        this.next=null;
        }
  }

class TestDemon6 {
    ListNode head;

    public TestDemon6() {
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

    public void display2(ListNode newHead){
        ListNode cur =newHead;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    public ListNode deleteDuplication() {
        ListNode cur = this.head;
        ListNode node = new ListNode(-1);
        ListNode tmp = node;
        while (cur != null) {
            if (cur.next != null
                    && cur.data == cur.next.data) {
                {
                    while (cur.next != null
                            && cur.data == cur.next.data) {
                        cur = cur.next;
                    }
                    cur = cur.next;
                }
            } else {
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }
        }
        tmp.next = null;
        return node.next;
    }

    public static void main(String[] args) {
        TestDemon6 a = new TestDemon6();
        a.addLast(2);
        a.addLast(2);
        a.addLast(2);
        a.addLast(2);
        a.addLast(5);
        a.display();

        ListNode node=a.deleteDuplication();
        a.display2(node);

    }
}*/

