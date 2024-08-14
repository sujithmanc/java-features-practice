package tech.sujith.practice.lamda;


public class Runnable__002 {
	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		Thread t = new Thread(a);
		t.start();
		t.join();
		System.out.println(a.getTotal());
	}
}



class A implements Runnable {

	private int total;
	
	@Override
	public void run() {
		for(int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			total += 1;
			System.out.println("New thread-> " + i);
		}
	}
	
	public int getTotal() {
		return total;
	}
	
}


