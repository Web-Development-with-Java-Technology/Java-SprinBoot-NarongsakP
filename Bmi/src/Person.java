public class Person {
    public double height;
    public double weight;

    public Person() {
        this.height = 54;
        this.weight = 1.57;
    }

    public Person(double weight, double height) {
        this.height = height;
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getHeight() {
        return this.height;
    }

    public double BMICalculator() {
        return this.weight / (this.height * this.height);
    }

    public void interpretBMI() {
        double bmi = this.BMICalculator();
        if (bmi < 18.5) {
            System.out.println("น้ําหนักน้อยเกินไป (Underweight)");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("น้ําหนักปกติ (Normal Weight)");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("น้ําหนักเกิน (Overweight)");
        } else if (bmi >= 30) {
            System.out.println("น้ําหนักอ้วน (Obese)");
        } else {
            System.out.println("เกิดข้อผิดพลาด");
        }
    }

    public void showResult() {
        System.out.println("---------- Result ----------");
        System.out.println("weight: " + this.weight + " kilogram");
        System.out.println("height: " + this.height + " metre");
        System.out.println("BMI value: " + this.BMICalculator() + " metre");
        System.out.print("appraisal: ");
        this.interpretBMI();
    }
}
