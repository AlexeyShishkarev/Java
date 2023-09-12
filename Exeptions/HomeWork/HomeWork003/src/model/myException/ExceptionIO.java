package model.myException;

public class ExceptionIO extends RuntimeException {
    public ExceptionIO() {
        super("Не получилось записать в файл!");
    }
}
