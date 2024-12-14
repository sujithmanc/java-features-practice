package tech.sujith.features.mutli_threading;

import java.util.Random;

import lombok.Data;

public class Demo__001 {
	public static void main(String[] args) throws InterruptedException {
		R r = new R();
		r.wirte();

		Random ran = new Random();
		
		Runnable reader = () -> {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(ran.nextInt(1000, 3000));
					System.out.println("Reader reading...: " + r.read());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Reader finished");
		};

		Runnable writer = () -> {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(ran.nextInt(500, 1000));

					//System.out.println("Write...");
					r.wirte();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Writer finished");
		};

		Thread t1 = new Thread(reader);
		Thread t2 = new Thread(writer);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

	}
}

@Data
class R {

	private Integer value;

	public synchronized void wirte() throws InterruptedException {
		System.out.println("Inside writer");
		if (value != null) {
			System.out.println("writer.... waiting");
			wait();
			System.out.println("writer.... after wait");
		}
		
		value = 0;
		System.out.println("writer.... wrote the value and giving notify.");
		notify();
		System.out.println("writer.... after notify");
	}

	public synchronized int read() throws InterruptedException {
		System.out.println("Inside reader");
		if (value == null) {
			System.out.println("reader.... waiting");
			wait();
			System.out.println("reader.... after waiting");
		}

		int v = value;
		value = null;
		System.out.println("reader.... read the value and giving notify.");
		notify();
		System.out.println("reader.... after notify");
		return v;
	}

}
