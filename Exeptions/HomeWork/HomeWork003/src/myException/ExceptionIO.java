package myException;

import java.io.IOException;

public class ExceptionIO extends RuntimeException {
    public ExceptionIO() {
        super("Не получилось записать в файл!");
    }
}
