package methodInterface;

public class Main {

	public static void main(String[] args) {
		System.out.println("In main method.");
		WorkInter workObj = Job::doJob;
		workObj.doWork();
		
		Runnable obj = () -> {
			try {
				Job.doThreadStuff();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Thread t1 = new Thread(obj);
		t1.start();

	}

}
