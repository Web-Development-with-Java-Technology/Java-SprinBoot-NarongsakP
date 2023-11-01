import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // int score = 45;

        // String result = (score >= 50) ? "pass" : "Fail";

        // System.out.println((score >= 50) ? "pass" : "fail");
        // System.out.println(result);

        // switch case
        System.out.println("-----------------Menu-------------------");
        System.out.println("1: Spaghetti");
        System.out.println("3: Hamburger");
        System.out.println("4: Pizza");
        System.out.println("5: Sushi");
        System.out.println("------------------------------------");
        System.out.print(">>Plese enter number for select menu :");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        sc.close();
        switch (day) {
            case 1:
                System.out.println("You select : Spaghetti ");
                break;
            case 2:
                System.out.println("You select : Green curry");
                break;
            case 3:
                System.out.println("You select : Hamburger");
                break;
            case 4:
                System.out.println("You select :Pizza");
                break;
            case 5:
                System.out.println("You select : Sushi");
                break;
            default:
                System.out.println("don't menu");
                break;
        }
    }
}
