import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		int a[] = { 5, 6, 2, 1, 4, 14, 10, 4, 8, 5, 14, };
    
		List l=new ArrayList();
		for(int i:a)
			l.add(i);
		
		System.out.println(l);
		ListIterator i=l.listIterator();
		
		while(i.hasNext())
		System.out.println(i.next());
	}

}
