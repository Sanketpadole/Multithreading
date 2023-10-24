package ThreadClass;

//public class Test1 extends Thread {
//	@Override
//	public void run() {
//		System.out.println("Thread task");
//	}
//
//
//	public static void main(String[] args) {
//		Test1 t = new Test1();
////		thread1
//		t.start();
//		Test1 t2 = new Test1();
//		// thread2
//		t2.start();
//
//	}
//
//}

class xyz1 {
	public void run() {
		for (int i = 0; i <= 50; i++) {
			System.err.println("sanket");
		}
	}

}

class xyz2 {
	public void run() {
		for (int i = 0; i <= 50; i++) {
			System.out.println("bhushan");
		}
	}

}

public class Test1 {

	public static void main(String[] args) {
		xyz1 t = new xyz1();
//		thread1
		t.run();
		xyz2 t2 = new xyz2();
		// thread2
		t2.run();

	}

}

//Performing single task from multiple thread