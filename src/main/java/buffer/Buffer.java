package buffer;

/*
 * Class Buffer application
 * 
 * @author: Carlos Pérez Ferrando <carlos.perez.ferrando@gmail.com>
 * 
 * 
 */

import java.util.LinkedList;
import java.util.Queue;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Buffer<T> {
	private static final Logger LOGGER = LogManager.getLogger(Buffer.class);
	private Queue<T> objetBuffer;
	private int bufferSize;
	int numberOperationPut = 0;
	int numberOperationGet = 0;

	

	/**
	 * Constructor
	 * 
	 * @param bufferSize
	 */
	public Buffer(int bsize) {
		bufferSize = bsize;
		objetBuffer = new LinkedList<>();
	}

	public void put(T element) throws BufferException {
		if (objetBuffer.size() == bufferSize) {
			LOGGER.fatal("put() failed because the buffer is full");
			throw new BufferException("Buffer is full");
		}

		LOGGER.info("Element inserted");

		objetBuffer.add(element);
		numberOperationGet++;
	}

	public T get() throws BufferException {
		if (objetBuffer.isEmpty()) {
			throw new BufferException("Buffer is Empty");
		}

		T value = objetBuffer.remove();
		LOGGER.info("Element extracted");

		numberOperationGet++;
		return value;
	}

	public int getNumberOfElements() {
		return objetBuffer.size();
	}

	public int getNumberOfHoles() {
		return bufferSize - objetBuffer.size();
	}

	public int getCapacity() {
		return bufferSize;
	}

	public int getNumberOfOperations() {
		return numberOperationPut + numberOperationGet;
	}
}
