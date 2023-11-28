class MyThread extends Thread {
	
	
//	public void start() {
//		super.start();
//		System.out.println("start method");
//	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("run method");
		}
	}
}

public class StartOverride {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
//		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main method");
		}
	}
}