package study_group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Service {
    private List<StudyGroup> studyGroupList;
    private StudyGroup activeGroup;
    private int id;

    public Service() {
        activeGroup = new StudyGroup();
        studyGroupList = new ArrayList<>();
        studyGroupList.add(activeGroup);
    }
    public  void addStudent(String name, int age){
        Student student = new Student(id++, name, age);
        activeGroup.addStudent(student);
    }

    public String info(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список группы: \n");

//        Iterator<Student> iterator = activeGroup.iterator();
//        while (iterator.hasNext()){
//            Student student = iterator.next();
//            stringBuilder.append(student);
//            stringBuilder.append("\n");
//        }

        for (Student student: activeGroup) {
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public void sortByName(){
        activeGroup.sortByName();
    }

}
