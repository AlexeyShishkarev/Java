//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//        Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить
//        у пользователя ввод данных.
//
//        Если необходимо, исправьте данный код
//        (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
//
//        Дан следующий код, исправьте его там, где требуется
//        (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
//
//        Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import task001.InputUser;
import task004.Exception;

public class Main {
    public static void main(String[] args) {
        //region task001

//        InputUser inputUser = new InputUser();
//
//        inputUser.outputUser();
        //endregion

        //region task004

        Exception exception = new Exception();

        System.out.println(exception.userInput());

        //end region

    }
}