package buffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Buffer {
	private Queue buffer;
	private int capacityBuffer;
	int numberOperationPut = 0;
	int numberOperationGet = 0;

	/**
	 * Constructor
	 * 
	 * @param bufferSize
	 */
	public Buffer(int bsize) {
		capacityBuffer = bsize;
		buffer = new LinkedList();
	}

	public void put(Object element) {
		if (buffer.size() == capacityBuffer)
			System.exit(-1);
		

		System.out.println("Element inserted");

		buffer.add(element);
		numberOperationGet++;
	}

	public Object get() throws BufferException {
		if (buffer.isEmpty())
			throw new BufferException("Buffer is Empty");

		Object value = buffer.remove();
		System.out.println("Element extracted");

		numberOperationGet++;
		return value;
	}

	public int getNumberOfElements() {
		return buffer.size();
	}

	public int getNumberOfHoles() {
		return capacityBuffer - buffer.size();
	}

	public int getCapacity() {
		return capacityBuffer;
	}

	public double getNumberOfOperations() {
		return numberOperationPut + numberOperationGet;
	}
}
