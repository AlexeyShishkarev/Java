package model.myException;

public class DateException extends RuntimeException{
    public DateException() {
        super("Введена неверная дата!");
    }
}
