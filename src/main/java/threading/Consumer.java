package threading;

import java.util.concurrent.BlockingQueue;

public class Consumer<E> implements Runnable {
	
	BlockingQueue<E> q;
	
	public Consumer(BlockingQueue<E> q) {
		this.q = q;
	}
	
	@Override
	public void run()  {
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println("Consumer"+ q.take() );
				Thread.sleep(1);
			}
		}catch(InterruptedException ie) {
			
		}
		
		
	}
}
