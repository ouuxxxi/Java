//合并两个有序的单列表

/*public class TestDemon111 {

    public static ListNode mergeTwoLists(
            ListNode headA,ListNode headB) {
        ListNode node= new ListNode(-1);
        ListNode tmp=node;
        while(headA!=null && headB!=null){
            if(headA.data<headB.data){
                tmp.next=headA;
                headA=headA.next;
                tmp=tmp.next;
            }else{
                tmp.next=headB;
                headB=headB.next;
                tmp=tmp.next;
            }
        }
        if(headA!=null){
            tmp.next=headA;
        }
        if(headB!=null){
            tmp.next=headB;
        }
        return node.next;
    }


    public static void main(String[] args) {
        TestDemon11 a = new TestDemon11();
        a.addLast(1);
        a.addLast(2);
        a.addLast(3);
        a.display();

        TestDemon11 b = new TestDemon11();
        b.addLast(4);
        b.addLast(5);
        b.addLast(6);
        b.display();

        ListNode node=mergeTwoLists(a.head,b.head);
        b.display2(node);
    }
}*/

