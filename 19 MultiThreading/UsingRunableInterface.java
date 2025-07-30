package Test2;

public class UsingRunableInterface implements Runnable{

	@Override
	public void run() {
		System.out.println("-----thread started-----");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args)throws Exception {

		UsingRunableInterface ur=new UsingRunableInterface();
		
		Thread t1=new Thread(ur);
		t1.start();
		t1.sleep(10000);
		
		t1.currentThread();
		System.out.println(t1.getName());
		
	}

	

}
