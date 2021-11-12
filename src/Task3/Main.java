package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(final String[] args) {

        final Subject physics = new Subject("Physics");
        final Subject math = new Subject("Math");
        final Subject english = new Subject("English");
        final Subject database = new Subject("Database");
        final List<Subject> subjects = new ArrayList<>();
        subjects.add(physics);
        subjects.add(math);
        subjects.add(english);
        subjects.add(database);

        final Student student1 = new Student("0", "Andrii", "Jonson", 19, "IT-13",subjects);
        final Student student2 = new Student("1","Tom", "Mot", 23, "IT-33", subjects);
        final Student student3 = new Student("2","Roman", "Name", 20, "IT-21", subjects);
        final Student student4 = new Student("3","Denys", "Mix", 26, "PK-21", subjects);

        final List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        final StudentSimple studentSimples = new StudentSimple();
        studentSimples.method(students);

        students.get(0).addMark(5, "English");
        students.get(1).addMark(4, "English");
        students.get(2).addMark(3, "English");
        students.get(3).addMark(4, "English");
        students.get(0).addMark(5, "Math");
        students.get(1).addMark(3, "Math");
        students.get(2).addMark(4, "Math");
        students.get(3).addMark(2, "Math");
        students.get(0).addMark(4, "Physics");
        students.get(1).addMark(3, "Physics");
        students.get(2).addMark(3, "Physics");
        students.get(3).addMark(2, "Physics");
        students.get(0).addMark(5, "Database");
        students.get(1).addMark(4, "Database");
        students.get(2).addMark(5, "Database");
        students.get(3).addMark(3, "Database");

        final StudentSimple studentSimple = new StudentSimple(students);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        studentSimple.infoAllStudents();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Average rating: " + student4.averageMark());
        System.out.print(student1.onlyEnglish());
        System.out.print(student2.onlyEnglish());
        System.out.print(student3.onlyEnglish());
        System.out.print(student4.onlyEnglish());
        System.out.println(" ");
        System.out.println("Delete users average score less than 3: "+ studentSimple.delUserWithMark());
        System.out.println("Sort by surname and name: "+ studentSimple.sort());
        System.out.println("Highest average score: "+studentSimple.getHighestAverage());
        System.out.println("Surname with hyphen: "+ studentSimple.surnameWithHyphen());
    }
}