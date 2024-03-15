import java.util.Scanner;

public class GradeAnalyzerProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Grades Analyzer!");

        GradeAnalyzer analyzer = new GradeAnalyzer();

        while (true) {
            System.out.print("Enter student's name (or type 'done' to finish): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("done")) {
                break;
            }

            try {
                System.out.print("Enter " + name + "'s grade: ");
                double grade = Double.parseDouble(scanner.nextLine());

                Student student = new Student(name, grade);
                analyzer.addStudent(student);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numeric grade.");
            }
        }

        System.out.println("\nAnalysis Results:");
        System.out.println("Average Grade: " + analyzer.calculateAverage());
        System.out.println("Highest Grade: " + analyzer.findHighestGrade());
        System.out.println("Lowest Grade: " + analyzer.findLowestGrade());

        scanner.close();
    }
}
