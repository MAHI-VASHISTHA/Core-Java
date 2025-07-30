package ArrayDeque;

import java.util.ArrayDeque;

public class OddEven {

	public static void main(String[] args) {
     
		int a[]= {5,2,4,96,2,1,36,20,40,74,4,5,21,14,15};
		ArrayDeque ar=new ArrayDeque();
		
		for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			ar.addFirst(a[i]);
		}else {
			ar.addLast(a[i]);

		}
		}
		System.out.println(ar);
	}

}
