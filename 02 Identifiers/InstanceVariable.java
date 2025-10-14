package test;

public class InstanceVariable {

	int a;
	 int b;

	void show() {
		System.out.println("Ducat Institude");
	}

	 void hello() {
		System.out.println("static method");
	}

	public static void main(String[] args) {
//      
//		new InstanceVariable().show();
		InstanceVariable i=new InstanceVariable();
		System.out.println(i.a);
		System.out.println(i.b);

        i.show();
        i.hello();
	}
}
