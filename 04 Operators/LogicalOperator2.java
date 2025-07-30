package demo;

public class LogicalOperator2 {

	public static void main(String [] args) {
		
		String arr[]= {"ankit","Riya","Isha","Abhay","Nisha","Osha"};
		
		for(String s:arr)
		{
			char c=s.charAt(0);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U' ){
			System.out.println(s);
		}
		}
	}
	
}
