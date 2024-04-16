/**
 * 
 */
package ec.workshop.java8.concurrency.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Openwebinars
 *
 */
public class Ejemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// Colecci�n compartida
		BlockingQueue<Integer> q = new ArrayBlockingQueue<>(20);
		
		// Productores y consumidores
		ExecutorService executor = Executors.newCachedThreadPool();
		
		executor.submit(new Producer(q));
		executor.submit(new Producer(q));
		executor.submit(new Consumer(q));

	}

}
