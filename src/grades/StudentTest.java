package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Nic");
        Student student2 = new Student("Kaite");
        Student student3 = new Student("Killian");

        System.out.printf("--STUDENTS--\n%s\n%s\n%s\n", student1.getStudentName(), student2.getStudentName(), student3.getStudentName());

        //adding grades
        for (int i = 1; i < 3; i++) {
            student1.addGrade(100);
            student2.addGrade(90);
            student3.addGrade(70);
        }

        System.out.printf("--GRADE AVERAGES--\n%s: %f\n%s: %f\n%s: %f\n", student1.getStudentName(), student1.getGradeAverage(), student2.getStudentName(), student2.getGradeAverage(), student3.getStudentName(), student3.getGradeAverage());

    }
}
