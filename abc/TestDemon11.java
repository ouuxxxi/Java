/*
class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next=null;
    }
}

class TestDemon11 {
   public  ListNode head;

    public TestDemon11() {
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

}
*/
