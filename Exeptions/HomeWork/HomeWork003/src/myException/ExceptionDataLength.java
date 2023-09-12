package myException;

public class ExceptionDataLength extends RuntimeException{
    public ExceptionDataLength() {
        super("Введены не все данные!!!");
    }
}
