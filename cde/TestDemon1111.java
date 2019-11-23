// 输入两个链表，找出它们的第一个公共结点
/*public class TestDemon1111 {
    public static  void creatCut(ListNode headA,ListNode headB){
          headA.next=headB.next.next;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     if(headA==null||headB==null){
         return null;
     }
     ListNode pL=headA;
     ListNode pS=headB;

     int lenA=0;
     int lenB=0;

     while(pL!=null){
         lenA++;
         pL=pL.next;
     }
     while(pS!=null){
         lenB++;
         pS=pS.next;
     }
     pL=headA;
     pS=headB;

     int len = lenA-lenB;

     if(len<0){
         pL=headB;
         pS=headA;
         len=lenB-lenA;
     }

     while(len>0){
         pL=pL.next;
         len--;
     }
     while (pL!=pS&&pL!=null){
         pL=pL.next;
         pS=pS.next;
     }

     if(pL==pS&&pL!=null){
         return pL;
     }
   return null;
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
        b.addLast(2);
        b.addLast(3);
        b.display();

        creatCut(a.head,b.head);
        ListNode node=getIntersectionNode(a.head,b.head);
        System.out.println(node.data);

    }
}*/
