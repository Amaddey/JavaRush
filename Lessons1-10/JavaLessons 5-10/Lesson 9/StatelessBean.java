import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class StatelessBean {
	public void log(Exception exception) {
		System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
	}
	
	public void methodThrowException() throws CharConversionException, FileSystemException, IOException {
		int i = (int) (Math.random() * 2);
		if(i == 0) {
			throw new CharConversionException();
		}
		if(i == 1) {
			throw new FileSystemException("");
		}
		if(i == 2) {
			throw new IOException();
		}
	}
}
