/*//找到倒数第K个节点
class ListNode{
    public int data;
    public ListNode next;

    public ListNode (int data){
        this.data=data;
        this.next=null;
    }
}

class TestDemon4 {
    ListNode head;

    public TestDemon4(){
        this.head=null;
    }

    public  void addLast(int data) {
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
    public void display(){
        ListNode cur =this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    public int gerlength(){
        ListNode cur=this.head;
        int count = 0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    public ListNode F(int k) {
        ListNode slow=this.head;
        ListNode fast=this.head;
        if(k<0||k>gerlength()){
          return null;
        }
        while(k>0){
            if(fast.next!=null){
               fast=fast.next;
               k--;
        }else {
                System.out.println("没有该节点");
                return null;
            }
     }
     while(fast.next!=null){
         fast=fast.next;
         slow=slow.next;
     }
      return slow;
    }

    public static void main(String[] args) {
        TestDemon4 a = new TestDemon4();
        a.addLast(1);
        a.addLast(2);
        a.addLast(3);
        a.addLast(4);
        a.addLast(5);
        a.display();

        System.out.println(a.F(2));

    }
}*/

