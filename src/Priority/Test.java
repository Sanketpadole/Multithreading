package Priority;

public class Test extends Thread {
	@Override
	public void run() {
		System.out.println("Child thread");
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		Test t = new Test();
		t.start();
	}

}
