package text;

public class StaticBlock {
	void text() {
		System.out.println("normal method");
	}

	StaticBlock() {
		System.out.println("Constructor called");
	}

	static {
		System.out.println("static block");
	}
	 {
		System.out.println("instance block");
	 }

	public static void main(String[] args) {
		StaticBlock s=new StaticBlock();
		s.text();
	}
}
