package threading.locks;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantLockTest {

	public static void main(String[] args) {
		ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
		ExecutorService executors = Executors.newFixedThreadPool(2);
		Map<String, String> map = new HashMap<>();

		executors.submit(() -> {
			lock.writeLock().lock();

			try {
				Thread.sleep(1000);
				map.put("foo", "bar");
			} catch (InterruptedException ie) {

			} finally {
				lock.writeLock().unlock();
			}
		});

		Runnable readTask = () -> {
			lock.readLock().lock();

			try {
				Thread.sleep(100);
				System.out.println(map.get("foo"));
			} catch (InterruptedException ie) {

			} finally {
				lock.readLock().unlock();
			}
		};

		executors.submit(readTask);
		executors.submit(readTask);

		executors.shutdown();

		while (!executors.isTerminated())
			;
	}
}
