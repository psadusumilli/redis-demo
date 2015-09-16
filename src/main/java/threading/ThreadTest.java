package threading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
		
		Producer<String> producer = new Producer<>(bq); 
		producer.setElement("Hello");
		
		Thread producerThread = new Thread(producer);
		Thread consumer = new Thread(new Consumer<>(bq));
		
		
		
		producerThread.setPriority(Thread.MIN_PRIORITY);
		consumer.setPriority(Thread.MAX_PRIORITY);
		
		try {
			producerThread.start();
			consumer.start();
		} finally {
			
		} 
		
		
		
	}
}
