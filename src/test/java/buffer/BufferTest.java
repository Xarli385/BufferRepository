package buffer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BufferTest {

	private Buffer buffer;
	private static final int CAPACITY = 100;
	private static final int NEGATIVE_CAPACITY = -1;

	@Before
	public void init() {
		buffer = new Buffer(CAPACITY);
	}

	@Test
	public void shouldBufferIsEmptyAnException() throws BufferException {

		assertNotNull(buffer);

	}

	// @Test
	// public void
	/*
	 * @Test public void shouldFactorialOfOneReturnOne() {
	 * 
	 * long expectedValue = 1;
	 * 
	 * assertEquals(expectedValue, result);
	 * 
	 * 
	 * @Test (expected = RuntimeException.class) public void
	 * shouldFactorialOfNegativeNumberRaiseAnException() {
	 * 
	 * factorial.compute(-1);
	 * 
	 * 
	 * }
	 */

}
