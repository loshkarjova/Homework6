package exeptions;

public class ArrayDataException extends RuntimeException{
    public ArrayDataException(String message, Throwable e) {
        super(message,e);
    }
}
