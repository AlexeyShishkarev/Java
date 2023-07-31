package study_group;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addStudent("Василий", 18);
        service.addStudent("Петр", 19);
        service.addStudent("Даша", 20);
        service.addStudent("Глаша", 17);
        service.addStudent("Паша", 21);

        System.out.println(service.info());

        service.sortByName();

        System.out.println(service.info());
    }


}