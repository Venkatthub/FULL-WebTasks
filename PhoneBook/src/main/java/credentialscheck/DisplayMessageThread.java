package credentialscheck;

public class DisplayMessageThread extends Thread {

	@Override
	public void run() {

		try {

			Thread.sleep(20000L);

		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}

	}

}
