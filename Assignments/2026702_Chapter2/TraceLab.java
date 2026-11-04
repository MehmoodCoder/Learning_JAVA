// Student ID: 2026-702

public class TraceLab {
    public static void main(String[] args) {
        System.out.println("Student ID: 2026-702");
        
        // Student ID: 2026-702
        // Tens digit (T) = 0 (from the second last digit of 702)
        // Units digit (U) = 2 (from the last digit of 702)
        // A Calculation: T + 3 -> 0 + 3 = 3
        // B Calculation: U + 4 -> 2 + 4 = 6

        int a = 3; // A = 3
        int b = 6; // B = 6
        int whole = a / b;
        int remainder = a % b;
        double result1 = a / b;
        double result2 = (double) a / b;
        int counter = a;
        counter += b;
        counter++;
        
        System.out.println(whole);
        System.out.println(remainder);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(counter);
    }
}