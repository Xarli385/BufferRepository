package buffer;

public class BufferException extends RuntimeException {

	public BufferException(String message) {
		super(message);

		System.err.println(message);

	}

}
