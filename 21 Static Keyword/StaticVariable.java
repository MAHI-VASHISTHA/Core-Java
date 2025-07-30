package pack1;

public class StaticVariable {

	 String name;
	 static String UpdatedName;
	 static int rollNo;
	
	 public void study() {
		 System.out.println("show details");
		 
	 }
	
	
	public static void main(String[] args) {

		StaticVariable.UpdatedName="mahi  sharma";
		StaticVariable.rollNo=102;
		
		System.out.println(UpdatedName);
		System.out.println(rollNo);


	}

}
