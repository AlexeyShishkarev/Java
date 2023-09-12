package model;

import model.myException.ExceptionDataLength;
import model.myException.ExceptionDataLengthMore;
import model.myException.GenderException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Service {
    public Service() {
        this.person =  new Person();
    }

    private Person person;

    /**
     * Проверка все ли данные введены
     * @param data
     * @return
     */
    public boolean isCorrectData(String data){
        String[] array = data.split(" ");
        if (array.length < 6){
            System.out.println("Введено меньше данных чем надо!!!");
            throw new ExceptionDataLength();
        } else if (array.length > 6){
            System.out.println("Введено больше данных чем надо!!!");
            throw new ExceptionDataLengthMore();
        } else {
            return true;
        }
    }

    /**
     * Разбор текста на составляющие
     * @param data
     */
    public Person parseData(String data){
        String[] array = data.split(" ");
        for (String i: array){
            if (i.equalsIgnoreCase("f" ) ||
            i.equalsIgnoreCase("m")){
                person.gender = i;
            } else if (i.length() == 1 && !i.equalsIgnoreCase("f") ||
            i.length() == 1 && !i.equalsIgnoreCase("m")){
                throw new GenderException();
            }
            else if (isNumeric(i)){
                person.phoneNumber = Long.parseLong(i);
            } else if (isDate(i)){
                person.dateOfBirth = i;
            } else {
                if (person.lastName == null){
                    person.lastName = i;
                } else if (person.firstName == null){
                    person.firstName = i;
                } else if (person.patronymicName == null){
                    person.patronymicName = i;
                }
            }
        }
        return person;
    }

    /**
     * Проверка является ли введенное числом
     * @param str
     * @return
     */
    private boolean isNumeric(String str){
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    /**
     * Проверка на дату
     * @param str
     * @return
     */
    private boolean isDate(String str){
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.M.yyyy");
            dateFormat.parse(str);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

//    private boolean isCorrectDate(String str){
//        String[] date = str.split(".");
//
//    }


}
