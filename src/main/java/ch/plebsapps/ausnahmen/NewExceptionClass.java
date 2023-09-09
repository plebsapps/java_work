package ch.plebsapps.ausnahmen;

import java.io.IOException;

public class NewExceptionClass {
    public static void main(String[] args) throws FileException {
        throw new FileException();
    }
}

class FileException extends IOException {
    public FileException() {
        super();
    }

    public FileException(String message) {
        super(message);
    }

    public FileException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileException(Throwable cause) {
        super(cause);
    }
}