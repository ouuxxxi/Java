/*//寻找中间节点
class ListNode{
    public int data;
    public ListNode next;

    public ListNode (int data){
        this.data=data;
        this.next=null;
    }
}
class TestDemon3 {
     public ListNode head;

     public TestDemon3(){
         this.head=null;
     }
     public void addFirst(int data){
         ListNode node = new ListNode(data);
         if(this.head==null){
             this.head=node;
         }else{
             node.next=this.head;
             this.head=node;
         }
     }

     public void display(){
         ListNode cur = this.head;
         while (cur != null) {
             System.out.print(cur.data+" ");
             cur=cur.next;
         }
     }



     public ListNode middleNode() {
         ListNode fast=this.head;
         ListNode slow=this.head;
         while(fast!=null && fast.next!=null){
             fast=fast.next.next;
             slow=slow.next;
         }
         return slow;
    }

    public static void main(String[] args) {
        TestDemon3 a = new TestDemon3();
        a.addFirst(1);
        a.addFirst(2);
        a.addFirst(3);
        a.addFirst(4);
        a.addFirst(5);
        a.display();
        System.out.println();
        System.out.println(a.middleNode().data);




    }

}*/
