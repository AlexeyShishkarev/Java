package model.myException;

public class GenderException extends RuntimeException{
    public GenderException() {
        super("Введен неверный пол!");
    }
}
