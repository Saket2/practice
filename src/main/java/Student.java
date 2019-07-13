import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Student {

    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, course);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name) &&
                course.equals(student.course);
    }
}
