
public class JoinDemo {
	public static void main(String[] args) {
		System.out.println("main has STARTED....");
		
		JoinThreadDemo demo = new JoinThreadDemo();
		demo.start();
		
		try {
			demo.join();
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("main has ENDS....");
	}
}

class JoinThreadDemo extends Thread {
	public void run() {
		for(int i = 1; i <=10 ; i++){
			System.out.println("5 * " + i + " = " +(5*i));
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ex) {
				ex.printStackTrace();
			}
			
		}
	}
}