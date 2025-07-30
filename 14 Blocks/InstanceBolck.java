package text;

public class InstanceBolck {

	static String name;
	
	void hello(){
		System.out.println("mahi vashistha");
		}
	
	{
		System.out.println("Instance Block");
	}
		
	public static void main(String[] args) {
		InstanceBolck i=new InstanceBolck();
		i.hello();
	}

}
