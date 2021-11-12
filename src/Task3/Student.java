package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String id;
    private String name;
    private String surname;
    private int age;
    private String group;
    private List<Subject> subject;
    private List<Mark> marks;

    public Student(final String id, final String name, final String surname, final int age, final String group, final List<Subject> subject) {
        this.id = id;
        if(name!=null){
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
        if(surname!=null){
            this.surname = surname;
        } else {
            System.out.println("Invalid surname");
        }
        if(age > 0 && age < 100){
            this.age = age;
        } else {
            System.out.println("Invalid age of " + name + " " + surname);
        }
        if(group!=null){
            this.group = group;
        } else {
            System.out.println("Invalid group");
        }
        this.subject = subject;
        this.marks = setMarkSubject();
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(final List<Mark> marks) {
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

        public String getName() {
            return name;
        }

        public void setName(final String name) {
            if (name!=null) {
                this.name = name;
            } else {
                System.out.println("Invalid name");
            }
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(final String surname) {
            if(surname!=null){
                this.surname = surname;
            } else {
                System.out.println("Invalid surname");
            }
        }

        public int getAge() {
            return age;
        }

        public void setAge(final int age) {
            if(age > 0 && age < 100){
                this.age = age;
            } else {
                System.out.println("Invalid age");
            }
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(final String group) {
            if(group!=null){
                this.group = group;
            } else {
                System.out.println("Invalid group");
            }
        }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(final List<Subject> subject) {
        this.subject = subject;
    }

    public List<Mark> getMark() {
        return marks;
    }

    public void setMark(final List<Mark> mark) {
        this.marks = mark;
    }

    public void addMark(final int value, final String nameSub) {
        for (int i = 0; i < subject.size(); i++) {
            if (subject.get(i).getSubname() == nameSub) {
                if (value > 5 || value < 0)
                    marks.get(i).getMark().add(5);
                else
                    marks.get(i).getMark().add(value);
            }
        }
    }

    private List<Mark> setMarkSubject() {
        final List<Mark> marks = new ArrayList<>();
        for (int i = 0; i < subject.size(); i++) {
            final Mark mark = new Mark();
            marks.add(mark);
        }
        return marks;
    }

    public double averageMark() {
        double tmp = 0;
        int count = 0;

        for (final Mark mark : marks) {
            tmp += mark.getMark().stream().mapToInt(value -> value).sum();
            count += mark.getMark().stream().mapToInt(value -> value).count();
        }
        if (count != 0)
            return tmp / count;
        else
            return 0;
    }

    public List<Integer> onlyEnglish() {
        for (int i = 0; i < subject.size(); i++) {
            if (subject.get(i).getSubname().equals("English")) {
                return marks.get(i).getMark().stream().distinct().collect(Collectors.toList());
            }
        }
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Student: " +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                ", subject=" + subject +
                ", marks=" + marks +
                '}';
    }
}