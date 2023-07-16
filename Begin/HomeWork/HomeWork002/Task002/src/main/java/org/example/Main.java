//Задание
//
//        1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
//        используя StringBuilder или String. Данные для фильтрации приведены ниже в виде json-строки.
//        Если значение null, то параметр не должен попадать в запрос.
//        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//
//        Дополнительные задания
//
//        2) Дана json-строка (можно сохранить в файл и читать из файла)
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4",
//        "предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//        Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
//        Студент [фамилия] получил [оценка] по предмету [предмет].
//        Пример вывода:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.



package org.example;

public class Main {
    static String firstPartText = "select * from students where ";
    static String parameters = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
    static StringBuilder result = new StringBuilder(firstPartText);
    static String[] forParsing = null;

    static String initionData = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\"," +
            "\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
    static String Students(String params){
        params = params.replaceAll("[\\[\\]\"{]", "")
                .replaceAll("[:,]", " ")
                .replaceAll("фамилия", "студент")
                .replaceAll("оценка", "получил")
                .replaceAll("предмет", "по предмету")
                .replaceAll("[}]", ".\n");

        return params;
    }

    public static void main(String[] args) {
        parameters = parameters.replaceAll("[{}\"]", "");
        parameters = parameters.replaceAll("[,]", " AND");
        parameters = parameters.replaceAll("[:]", " = ");

        forParsing = parameters.split("AND");

        for (int i = 0; i < forParsing.length; i++){
            if (!forParsing[i].contains("null")){
                if (i == 0) {
                    result.append(forParsing[i]);
                } else {
                    result.append("AND");
                    result.append(forParsing[i]);
                }
            }
        }
        System.out.println(Students(initionData));
        System.out.println(result);
    }
}