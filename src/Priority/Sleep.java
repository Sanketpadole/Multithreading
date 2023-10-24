package Priority;

public class Sleep {

	public static void main(String[] args) {
		try {
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(i);
				System.out.println(i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
