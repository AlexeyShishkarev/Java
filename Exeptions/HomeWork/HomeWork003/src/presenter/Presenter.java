package presenter;

import model.Person;
import model.Service;
import myException.ExceptionIO;
import view.UserIO;

import javax.swing.text.View;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Presenter {
    private UserIO userIO;
    private Service service;

    public Presenter(UserIO userIO){
        service = new Service();
        this.userIO = userIO;
    }

    public void dataInput(String data){
        if (service.isCorrectData(data)){
            Person person = service.parseData(data);
            try (FileWriter fileWriter = new FileWriter(person.lastName, true)){
                fileWriter.append(person.toString());
                fileWriter.append("\n");
            } catch (IOException e) {
                throw new ExceptionIO();
            }
        }
    }


}
