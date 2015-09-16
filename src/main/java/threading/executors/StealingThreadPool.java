package threading.executors;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StealingThreadPool {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newWorkStealingPool();
		
		List<Callable<String>> callables = Arrays.asList(
			() -> "task1",
			() -> "tas2",
			() -> "task3"
		);
		executor.invokeAll(callables)
			.stream()
			.map(future -> {
				try {
					return future.get();
				}catch (Exception e) {
					throw new IllegalStateException();
				}
			})
			.forEach(System.out::println);
	}
}
