import java.util.ArrayList;
//输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

}
public class Practice55{

    public ArrayList<Integer> printListFromTailToHead(ListNode node) {
        ArrayList<Integer> arr= new ArrayList<Integer>();//数组链表初始化
        ListNode cur=node;
        while(cur!=null){ //判断当前链表结点是否非空；
            arr.add(0,cur.val);//若非空，就将当前结点值添加到数组列表的第一个位置；
            cur=cur.next;//继续判断，直到结束循环，返回数组列表。
        }
        return arr;
    }

    public static void main(String[] args) {
        Practice55 a = new Practice55();

        System.out.println( a.printListFromTailToHead(null));



    }



}
