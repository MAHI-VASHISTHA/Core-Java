package text;

public class ParameterizedConstructor {

		int rollno;
		String name;
		String cource;
		
		ParameterizedConstructor(int rollno,String name,String cource){
			this.rollno=rollno;
			this.name=name;
			this.cource=cource;
		}
		
		public static void main(String[] args) {
			ParameterizedConstructor n=new ParameterizedConstructor(21222998,"mahi vashistha","java fullstack");
			System.out.println(n.rollno);
			System.out.println(n.name);
			System.out.println(n.cource);


	}

}
