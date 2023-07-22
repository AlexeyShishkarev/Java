package study_group;

import java.util.Iterator;
import java.util.List;

public class StudenIterator implements Iterator<Student> {
    private int index;
    private List<Student> studentList;

    public StudenIterator(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return studentList.size() > index;
    }

    @Override
    public Student next() {
        return studentList.get(index++);
    }
}