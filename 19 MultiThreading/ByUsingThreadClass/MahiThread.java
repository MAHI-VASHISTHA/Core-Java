package ByUsingThreadClass;

public class MahiThread extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		MahiThread m1 = new MahiThread();
		MahiThread m2 = new MahiThread();
		MahiThread m3 = new MahiThread();
		MahiThread m4 = new MahiThread();
		
		m1.start();
		m2.start();
		m3.start();
		m4.start();

	}
}
