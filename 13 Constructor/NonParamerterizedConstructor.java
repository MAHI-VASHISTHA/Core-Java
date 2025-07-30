package text;

public class NonParamerterizedConstructor {

	int rollno;
	String name;
	String cource;
	
	NonParamerterizedConstructor(){
		
	}
	
	public static void main(String[] args) {
		NonParamerterizedConstructor n=new NonParamerterizedConstructor();
		System.out.println(n.rollno);
		System.out.println(n.name);
		System.out.println(n.cource);

	}

}
