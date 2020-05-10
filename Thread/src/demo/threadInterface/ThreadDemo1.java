package demo.threadInterface;

class Runner implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
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
		Thread t1 = new Thread(new Runner());
		Thread t2 = new Thread(new Runner());
		
		t1.start();
		t2.start();
		
	}

}
