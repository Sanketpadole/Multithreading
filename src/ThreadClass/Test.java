package ThreadClass;

public class Test extends Thread {
	@Override
	public void run() {
		System.out.println("Execute thread");

	}

	public static void main(String[] args) {
		Test t = new Test();
		t.start();
		// t.start();...we cant envoke thread again...because thread is in dead state

	}

}

//
//executing multiple task (thread) at a single  time.....thread ===small tasks

//VLC====music,video,game...vlc pe ye task ek saath execute ho rahe...ye sare ke sare task ek task complete krte hain i.e VLC