import java.util.Scanner;

public class TestBMI {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print(">>Enter your Weight (in kilograms): ");
        double weight = scanner.nextDouble();

        System.out.print(">>Enter your Height (in meters): ");
        double height = scanner.nextDouble();

        scanner.close();

        Person person = new Person(weight, height);
        person.showResult();
        // System.out.println("---------- ผลลัพธ์ ----------");
        // System.out.println("น้ำหนัก" + person.getWeight() + "กิโลกรัม");
        // System.out.println("ส่วนสูง" + person.getHeight() + "เมตร");
        // System.out.println("ค่า BMI" + person.BMICalculator() + "กิโลกรัม");
    }
}
