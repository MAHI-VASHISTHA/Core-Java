package test;

public class UsingExtendsThreadClass extends Thread {

	public void run() {
		System.out.println("--------thread started-------");

		for (int i = 1; i <= 10; i++) {
			System.out.println("value of i is " + i);
		}

	}

	public static void main(String[] args) throws InterruptedException {

		UsingExtendsThreadClass mt = new UsingExtendsThreadClass();
		mt.start();
		mt.sleep(10000);

	}

}
