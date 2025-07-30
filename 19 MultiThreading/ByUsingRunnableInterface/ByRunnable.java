package ByUsingRunnableInterface;

public class ByRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		Runnable r1 = new ByRunnable();
		Runnable r2 = new ByRunnable();
		Runnable r3 = new ByRunnable();
		Runnable r4 = new ByRunnable();

		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r2);
		Thread th3 = new Thread(r3);
		Thread th4 = new Thread(r4);

		th1.start();
		th2.start();
		th3.start();
		th4.start();

	}
}