
public class SleepDemo {
	public static void main(String[] args) {
		SleepThreadDemo th = new SleepThreadDemo();
		th.start();
	}
}

class SleepThreadDemo extends Thread 
{
	public void run() {
		for(int i = 1; i<=10 ; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
	
}
