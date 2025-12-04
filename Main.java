import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        int[] marks = new int[5];
        String[] subjects = {"Maths", "Science", "English", "Computer", "GK"};

        System.out.println("Enter marks out of 100:");
        for (int i = 0; i < 5; i++) {
            System.out.print(subjects[i] + ": ");
            marks[i] = sc.nextInt();
        }

        // Create student object
        Student s = new Student(name, roll, marks);

        // Print report card
        ReportCard.printReport(s);
    }
}
