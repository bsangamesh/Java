package demo.thread;

class Runner extends Thread{
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
	
	@Deprecated
	public void name() {
		System.out.println("method depreceated");
	}
	
}


public class ThreadDemo1 {

	public static void main(String[] args) {
		Runner runner1 = new Runner();
		runner1.start();
		System.out.println("name 1: " + runner1.getName());
		System.out.println("id 1: " + runner1.getId());
		
		Runner runner2 = new Runner();
		runner2.start();
		
	
		
		System.out.println("name 2: " + runner2.getName());
		System.out.println("id 2: " + runner2.getId());
		

	}

}
