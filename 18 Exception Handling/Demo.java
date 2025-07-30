package test;

public class Demo {

	public static void main(String[] args) {
		
		try {
   int a=50;
   int b=0;
   int c=a/b;
   System.out.println(c);

		}
		catch(Exception e) {
//         e.printStackTrace();
			   System.out.println("can't be divided by zero");

		}
   }

}
