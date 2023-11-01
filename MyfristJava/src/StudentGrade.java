import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        System.out.println("Nakhon Pathon Vocational Cllege");
        System.out.println("Name :" + "Narongsak P.");
        System.out.println("Nickname :" + "Phoom");
        System.out.println("Student ID :" + "65309010004");
        System.out.println("----------------------------");

        // String name = "Narongsak P";
        // System.out.print("My Name is :" + name);

        // System.out.print("Enter your number1 :");
        // Scanner sc1 = new Scanner(System.in);
        // int x = sc1.nextInt();

        // System.out.print("Enter your number2 :");
        // Scanner sc2 = new Scanner(System.in);
        // int y = sc2.nextInt();

        // sc1.close();
        // sc2.close();

        // System.out.println("\n x + y = " + (x + y));

        System.out.print("Eneter your GPA :");
        Scanner sc = new Scanner(System.in);
        int gpa = sc.nextInt();

        sc.close();
        System.out.println("Result GPA :" + gpa);
    }
}
