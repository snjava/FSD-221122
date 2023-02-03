public class SynchronizationDemo {
	public static void main(String[] args) {
		Printer printer = new Printer();
		Thread1 th1 = new Thread1(printer);
		Thread2 th2 = new Thread2(printer);
		th1.start();
		th2.start();
	}
}

class Thread1 extends Thread {
	Printer printer;
	int num = 5;

	Thread1(Printer printer) {
		this.printer = printer;
	}

	public void run() {
		synchronized (printer) { // synchronized block
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(i==3) {
					try {
						printer.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				printer.print(num + " * " + i + " = " + (num * i));
			}
		}
		// printer.print(num);
	}
}

class Thread2 extends Thread {
	Printer printer;
	int num = 12;

	Thread2(Printer printer) {
		this.printer = printer;
	}

	public void run() {
		synchronized (printer) { // synchronized block
			for (int i = 1; i <= 10; i++) {
				printer.print(num + " * " + i + " = " + (num * i));
			}
			printer.notify();
		}
		// printer.print(num);
	}
}

class Printer {
	public void print(String value) {
		System.out.println(value);
	}

	public synchronized void print(int num) { // synchronized method
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

}
