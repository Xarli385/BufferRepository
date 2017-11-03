package counter;

/**
 * Class implementing a counter object
 * 
 * @author Carlos Pérez Ferrando 
 *
 */
public class Counter {
	private int counter;

	public Counter() {
		counter = 0;
	}

	public int getCounter() {
		return counter++;
	}
}
