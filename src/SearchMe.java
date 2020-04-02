import java.util.Scanner;

public class SearchMe {

    public static void main(String[] args) {
        String who = Utils.getInput("Enter a name: ");
// call your find student record function using the name entered by the user
// save the result and display whether the name was found or not
        boolean found = findStudentRecord(who);
        System.out.println("Did we find " + who + " " + found);
    }

    public static boolean findStudentRecord(String studentName) {
        String[] studentNames = getStudentList();
        //     your code here.
        for (String student : studentNames) {
            if (student.equals(studentName)) {
                return true;
            }
        }
        return false;
    }


    public static String[] getStudentList() {
        String [] test = {"Allen", "Bob", "Clara", "Davros", "Ethan", "Frank", "Goth", "Hank", "Ivan", "Jeremiah", "Kate"};
        return test;
    }
}
