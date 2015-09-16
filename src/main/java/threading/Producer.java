package threading;

import java.util.concurrent.BlockingQueue;

public class Producer<E> implements Runnable {

	BlockingQueue<E> q;

	public Producer(BlockingQueue<E> q) {
		this.q = q;
	}

	public Producer() {

	}

	private E element;
	
	
	/**
	 * @return the element
	 */
	public E getElement() {
		return element;
	}

	/**
	 * @param element the element to set
	 */
	public void setElement(E element) {
		this.element = element;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				q.put(element);
			} catch (InterruptedException ie) {

			}

			System.out.println("Producer Added" + element);
			Thread.yield();

		}

	}
}
