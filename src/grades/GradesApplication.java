package grades;
import util.Input;
import java.util.HashMap;
public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        // Create Student Objects
        Student student1 = new Student("Nic");
        Student student2 = new Student("Kaite");
        Student student3 = new Student("Killian");
        Student student4 = new Student("Halen");

        //adding grades
        for (int i = 0; i < 6; i++) {
            student1.addGrade((int) (Math.random() * (100 - 70 + 1) + 70));
            student2.addGrade((int) (Math.random() * (100 - 70 + 1) + 70));
            student3.addGrade((int) (Math.random() * (100 - 70 + 1) + 70));
            student4.addGrade((int) (Math.random() * (70 - 30 + 1) + 30));
        }
        //Populate Hash with them students
        students.put("NRRowley", student1);
        students.put("KNRowley", student2);
        students.put("KORowley", student3);
        students.put("HRowley", student4);

        //MAIN MENU///////////////////////////////
        boolean runProgram;
        do {
            System.out.println("---MAIN MENU---\n--CHOOSE AN OPTION--\n1: SEARCH FOR A STUDENT\n2: DISPLAY ALL STUDENT GRADES\n3: SHOW CLASS AVERAGE\n4: PRINT CSV STUDENT REPORT");
            Input optionInput = new Input();
            int option = optionInput.getInt();

            if (option == 1) {
                boolean continueSearch;
                do {
                    System.out.println("---GitHub Usernames---\n" + students.keySet());
                    //Search for a student///////////////////
                    System.out.println("Please enter a username to display more information!");
                    Input studentInput = new Input();
                    String studentGitHubUsername = studentInput.getString();

                    //If username isn't found
                    while (!students.containsKey(studentGitHubUsername)) {
                        System.out.println("Name not found, check the list for available names and try again...\n" + students.values() + "\n Enter a username:");
                        studentGitHubUsername = studentInput.getString();
                    }

                    System.out.printf("---INFORMATION---\nNAME: %s\nUSERNAME: %s\nGRADE AVERAGE: %.2f\n", students.get(studentGitHubUsername).getStudentName(), studentGitHubUsername, students.get(studentGitHubUsername).getGradeAverage());

                    for (int i = 0; i < students.get(studentGitHubUsername).getGrades().size(); i++) {
                        System.out.printf("GRADE #%d: %d\n", i + 1, students.get(studentGitHubUsername).getGrades().get(i));
                    }

                    System.out.println("Search another username?[y/n]");
                    continueSearch = studentInput.yesNo();
                } while (continueSearch);
            } else if (option == 2) {
                for(int i = 0; i < students.size(); i++){
                    String currentStudent = students.keySet().toArray()[i].toString();
                    String currentStudentName = students.get(currentStudent).getStudentName();
                    System.out.printf("NAME: %s\nUSERNAME: %s\n",currentStudentName, currentStudent);
                    for(int ii = 0; ii < students.get(currentStudent).getGrades().size(); ii++){
                        System.out.printf("GRADE#%d: %d\n",ii+1, students.get(currentStudent).getGrades().get(ii));
                    }
                    System.out.println("------------");
                }
            } else if (option == 3){
                int gradeTotal = 0;
                int gradeAmount = 0;
                for(int i = 0; i < students.size(); i++) {
                    String currentStudent = students.keySet().toArray()[i].toString();
                    for (int ii = 0; ii < students.get(currentStudent).getGrades().size(); ii++) {
                        gradeTotal = gradeTotal + students.get(currentStudent).getGrades().get(ii);
                        gradeAmount = gradeAmount+1;
                    }
                }
                double classAverage = (double) gradeTotal /gradeAmount;
                System.out.printf("The class average is: %.2f\n", classAverage);
            }
            System.out.println("Return to main menu?[y/n]");
            runProgram = optionInput.yesNo();
        } while(runProgram);
        System.out.println("Goodbye!");
    }
}
