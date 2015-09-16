package threading.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Test {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		IntStream.range(0, 1000).forEach((i) -> {
			
		});

	}

}
