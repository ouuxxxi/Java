// 分割单链表 display2
//以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前

/*
class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next=null;
    }
}

class TestDemon5 {
    ListNode head;

    public TestDemon5() {
        this.head = null;
    }

    public void addLast(int data){
        ListNode cur=this.head;
        ListNode node = new ListNode(data);
        if(this.head==null){
            this.head=node;
        }else{
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }
    }

    public void display(){
        ListNode cur =this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
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

    public ListNode partition(int x) {
        ListNode cur = this.head;
        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        ListNode afterStart = null;
        ListNode afterEnd = null;

        while(cur!=null){
            if(cur.data<x){
                if(beforeStart==null){
                    beforeStart=cur;
                    beforeEnd=beforeStart;
                }else{
                    beforeEnd.next=cur;
                    beforeEnd=beforeEnd.next;
                }
            }else{
                if(afterStart==null){
                    afterStart=cur;
                    afterEnd=afterStart;
                }else{
                    afterEnd.next=cur;
                    afterEnd=afterEnd.next;
                }
            }
            cur=cur.next;
        }
        if(beforeStart==null){
            return afterStart;
        }else{
            beforeEnd.next=afterStart;
        }
        if(afterStart!=null){
            afterEnd.next=null;
        }
      return beforeStart;
    }

    public static void main(String[] args) {
        TestDemon5 a = new TestDemon5();
        a.addLast(1);
        a.addLast(20);
        a.addLast(3);
        a.addLast(5);
        a.addLast(9);
        a.addLast(2);
        a.display();

        ListNode node =a.partition(4);
        a.display2(node);

    }
}
*/

