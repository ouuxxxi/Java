public class TestDemon1 {
    public static void main(String[] args) {
        MySignalList mySignalList = new  MySignalList();
        mySignalList.addLast(1);
        mySignalList.addLast(4);
        mySignalList.addLast(5);
        mySignalList.addLast(8);
        mySignalList.addLast(45);
        mySignalList.display();

         System.out.println(mySignalList.contains(3));
        //  System.out.println(mySignalList.getLength());

        // mySignalList.addIndex(5,19);
        //  mySignalList.display();

        // mySignalList.remove(2);
        // mySignalList.display();

        // mySignalList.removeAllKey(1);
        //mySignalList.display();

    }
}
