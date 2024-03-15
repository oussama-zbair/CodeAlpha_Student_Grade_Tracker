import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GradeAnalyzer {
    private List<Student> students;

    public GradeAnalyzer() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double calculateAverage() {
        if (students.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        return sum / students.size();
    }

    public double findHighestGrade() {
        if (students.isEmpty()) {
            return 0.0;
        }
        return Collections.max(students, Comparator.comparingDouble(Student::getGrade)).getGrade();
    }

    public double findLowestGrade() {
        if (students.isEmpty()) {
            return 0.0; // No grades available
        }
        return Collections.min(students, Comparator.comparingDouble(Student::getGrade)).getGrade();
    }
}
