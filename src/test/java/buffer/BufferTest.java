package buffer;

/*
 * JUnit Test for the Buffer application
 * 
 * @author: Carlos Pérez Ferrando <carlos.perez.ferrando@gmail.com>
 * 
 * 
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class BufferTest {
	private static final double EPSILON = 00000000000000000000000;

	@Test
	public void shouldConstructorCreateABuffer() {
		int capacity = 4;
		Buffer<Integer> buffer = new Buffer<>(capacity);

		assertNotNull(buffer);
		assertEquals(capacity, buffer.getCapacity());
		assertEquals(capacity, buffer.getNumberOfHoles());
		assertEquals(0, buffer.getNumberOfElements());
		assertEquals(0, buffer.getNumberOfOperations());
	}

	@Test(expected = BufferException.class)
	public void shouldAGetOnAnEmptyBufferRaiseAnException() {
		int capacity = 2;
		Buffer<String> buffer = new Buffer<>(capacity);
		buffer.get();
	}

	@Test
	public void shouldAGetOnDecreaseTheNumberOfElementsInOne() {
		int capacity = 2;
		Buffer<String> buffer = new Buffer<>(capacity);
		buffer.put("hola");
		buffer.put("hello");

		int numberOfelements = buffer.getNumberOfElements();

		buffer.get();
	}

	@Test(expected = BufferException.class)
	public void shouldPutOnAFullByufferRaiseAnException() {
		int capacity = 2;
		Buffer<Double> buffer = new Buffer<>(capacity);
		buffer.get();
		buffer.put(2.0);
		buffer.put(3.0);
		buffer.put(4.0);
	}

	@Test
	public void shouldAPutOnEmptyBufferMakeTheBufferContainOneElement() {
		int capacity = 2;
		Buffer<Double> buffer = new Buffer<>(capacity);
		buffer.put(4.0);

		assertEquals(1, buffer.getNumberOfElements());
	}

	@Test
	public void shouldAPutOnEmptyBufferMakeTheBufferContainOneMoreElement() {
		int capacity = 2;
		Buffer<Double> buffer = new Buffer<>(capacity);
		buffer.put(4.0);
		int numberOfElements = buffer.getNumberOfElements();
		buffer.put(5.0);

		assertEquals(numberOfElements + 1, buffer.getNumberOfElements());
		assertEquals(0, buffer.getNumberOfHoles());
		assertEquals(capacity, buffer.getNumberOfElements());
	}

	@Test
	public void shouldAGetReturnTheValueOfTheLastPut() {
		int capacity = 5;
		Buffer<Double> buffer = new Buffer<>(capacity);
		buffer.put(23.0);

		double value = buffer.get();

		int numberOfElements = buffer.getNumberOfElements();
		buffer.put(5.0);

		assertEquals(23.0, value, EPSILON);

	}

}
