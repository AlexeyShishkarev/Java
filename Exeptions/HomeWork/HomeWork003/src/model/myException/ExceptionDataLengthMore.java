package model.myException;

public class ExceptionDataLengthMore extends RuntimeException{
    public ExceptionDataLengthMore() {
        super("Введено слишком много данных...");
    }
}
