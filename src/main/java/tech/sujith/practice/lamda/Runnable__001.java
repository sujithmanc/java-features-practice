package tech.sujith.practice.lamda;

public class Runnable__001 {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread(() -> {
			for(int i = 0; i <= 10_000; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("New thread-> " + i);
			}
		});
		
		t.start();
		
	
		
		for(int i = 0; i <= 10_000; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main-> " + i);
		}
		
		
		
	}
}


