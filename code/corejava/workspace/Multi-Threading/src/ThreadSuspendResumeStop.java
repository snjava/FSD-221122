
public class ThreadSuspendResumeStop {
	public static void main(String[] args) {
		System.out.println("-----------Start of the Main thread--------");
		
		SuspendResumeDemo th = new SuspendResumeDemo(); // New/Born Stage
		th.start(); // Runnable stage
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th.resume();
		th.stop();
		System.out.println("-----------End of the Main thread--------");
	}
}

class SuspendResumeDemo extends Thread {
	public void run() {
		System.out.println("-----------Start of the custom thread--------");
		
		suspend();
		
		for(int i =1 ; i<=10; i++) {
			System.out.println("i : " + i);
		}
		
		System.out.println("-----------End of the custom thread--------");
	}
}
