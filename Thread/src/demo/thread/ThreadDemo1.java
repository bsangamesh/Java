package demo.thread;

class Runner implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

public class ThreadDemo1 {

	public static void main(String[] args) {
		Thread runner1 = new Thread(new Runner());
//		Runner runner1 = new Runner();
		//
		runner1.start();
		System.out.println("name 1: " + runner1.getName());
		System.out.println("id 1: " + runner1.getId());

	}

}
