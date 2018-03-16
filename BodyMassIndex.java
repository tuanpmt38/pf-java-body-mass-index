public class BodyMassIndex {
    public static void main(String[] args) {
        double weight, height, bmi;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter weight: ");
        weight = sc.nextDouble();
        System.out.println("Enter height");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height, 2);
        if (bmi <= 18.5)
            System.out.println("underweight");
        else if (bmi <= 25.0) System.out.println("Nornal");
        else if (bmi <= 30.0) System.out.println("Overweight");
        else
            System.out.println("overweight");
    }
}
