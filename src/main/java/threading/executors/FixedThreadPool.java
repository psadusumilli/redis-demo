package threading.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FixedThreadPool {
	public static void main(String[] args) {

		ExecutorService exectuor = Executors.newFixedThreadPool(1);
		
		Future<Integer> future = exectuor.submit(() -> {
			try {
				TimeUnit.SECONDS.sleep(0);
				return 123;
			} catch (InterruptedException ie) {
			}
			return 0;
		});

		try {
			future.get(1, TimeUnit.SECONDS);
			System.out.println("Finished");
		} catch (Exception te) {
			System.out.println(te);
		}
		
	}
	
}
