package grades;

//Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 Student objects with at least 3 grades each, and add them to the map.
//
//Be creative! Make up GitHub usernames and grades for your student objects.

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Nic");
        Student student2 = new Student("Kaite");
        Student student3 = new Student("Killian");
        Student student4 = new Student("Halen");

        //adding grades
        for (int i = 1; i < 3; i++) {
            student1.addGrade(100);
            student2.addGrade(95);
            student3.addGrade(85);
            student4.addGrade(52);
        }

        students.put("NRRowley", student1);
        students.put("KNRowley", student2);
        students.put("KORowley", student3);
        students.put("HRowley", student4);

//        Create the command line interface (CLI)
//
//Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about. The user should enter a GitHub username (i.e. one of the keys in your map). If the given input does not match up with a key in your map, tell the user that no users with that username were found. If the given username does exist, display information about that student, including their name and their grades.
//
//After the information is displayed, the application should ask the user if they want to continue, and keep running so long as the answer is yes.

        System.out.println("---GitHub Usernames---\n" + students.keySet());

        boolean continueSearch = true;
        do {
            System.out.println("Please enter a username to display more information!");
            Input studentInput = new Input();
            String studentGitHubUsername = studentInput.getString();

            while (!students.containsKey(studentGitHubUsername)) {
                System.out.println("Name not found, check the list for available names and try again...\n" + students.values() + "\n Enter a username:");
                studentGitHubUsername = studentInput.getString();
            }

            System.out.printf("---INFORMATION---\nNAME: %s\nUSERNAME: %s\nGRADE AVERAGE: %.2f\n",students.get(studentGitHubUsername).getStudentName(),studentGitHubUsername, students.get(studentGitHubUsername).getGradeAverage());
            System.out.println("Search another username?[y/n]");
            continueSearch = studentInput.yesNo();
        } while (continueSearch);

    }
}
