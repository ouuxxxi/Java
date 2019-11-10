package DaLuan_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class DaLuan_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] num = {1,2,3,4,5,6,7,8,9,10};
		ArrayList<Number> list = new ArrayList<>(Arrays.asList(num));
		System.out.println(list.toString());
		System.out.println(list);
		sort(list);
		System.out.println(list);
	}
		
		public static void sort(ArrayList<Number> list) {
			Number temp;
			for(int i=0;i<list.size();i++) {
				int m = (int)(Math.random()*(list.size()));
				temp = list.get(i);
				list.set(i, list.get(m));
				list.set(m,temp);
			}
		
		}

}
