public class FirstThread {
	public static void main(String[] args) {
		
		System.out.println("Main method STARTS..");
		
		CustomThread th = new CustomThread();
		th.setName("MyThread");
		th.setPriority(10);
		th.start();
		
		System.out.println("Main method ENDS..");
	}
}

class CustomThread extends Thread
{
	public void run() {
		System.out.println("This is the custom thread....");
		Thread obj = Thread.currentThread();
		System.out.println(obj);
	}
}