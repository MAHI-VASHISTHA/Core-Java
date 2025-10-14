package test;

public class LocalVariable {

	int id;
	String name;
	int dob;

	void text() {
		
		int a=5;
		System.out.println(id);
		System.out.println(name);
		System.out.println(dob);
		System.out.println(a);

	} 
//local variable does not use outside the block ex-a can not be used outside the 
// text() method.
	public static void main(String[] arr) {

		LocalVariable lv=new LocalVariable();
		lv.text();
	}
}
