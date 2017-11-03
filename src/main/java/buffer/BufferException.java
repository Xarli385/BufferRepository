package buffer;

/*
 * Class exceptions for the Buffer application
 * 
 * @author: Carlos Pérez Ferrando <carlos.perez.ferrando@gmail.com>
 * 
 * 
 */
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class BufferException extends RuntimeException {

	private static final Logger LOGGER = LogManager.getLogger(Buffer.class);

	public BufferException(String message) {
		super(message);
		LOGGER.error(message);

	}

}
