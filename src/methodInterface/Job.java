package methodInterface;

public class Job {
	public static void doJob() {
		System.out.println("Doing my job for 9 hours!!");
	}
	
	public static void doThreadStuff() throws InterruptedException {
		for(int i=1; i <= 10; i++) {
			System.out.println(2*i);
			Thread.sleep(1000);
		}
	}

}
