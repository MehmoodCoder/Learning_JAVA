// Student ID: 2026-702

import java.util.Scanner;

public class CampusKiosk {
    public static void main(String[] args) {
        // Personalized pricing constants based on ID 2026-702 (A=3, B=6)
        final int BLACK_PRICE_CENTS = 13;
        final int COLOR_PRICE_CENTS = 31;
        final int SERVICE_FEE_CENTS = 9;

        System.out.println("Student ID: 2026-702");
        System.out.println("Black & White Rate: " + BLACK_PRICE_CENTS + " cents");
        System.out.println("Color Rate: " + COLOR_PRICE_CENTS + " cents");
        System.out.println("Service Fee: " + SERVICE_FEE_CENTS + " cents\n");

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter student display name: ");
        String studentName = keyboard.nextLine();

        System.out.print("Enter number of Black & White pages: ");
        int bwPages = keyboard.nextInt();

        System.out.print("Enter number of Color pages: ");
        int colorPages = keyboard.nextInt();

        int bwSubtotal = bwPages * BLACK_PRICE_CENTS;
        int colorSubtotal = colorPages * COLOR_PRICE_CENTS;
        int subtotal = bwSubtotal + colorSubtotal;
        int totalCents = subtotal + SERVICE_FEE_CENTS;

        double subtotalCurrency = subtotal / 100.0;
        double serviceFeeCurrency = SERVICE_FEE_CENTS / 100.0;
        double totalCurrency = totalCents / 100.0;

        // Receipt
        System.out.println("\n--- RECEIPT ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("B&W Pages Cost: " + bwSubtotal + " cents");
        System.out.println("Color Pages Cost: " + colorSubtotal + " cents");
        System.out.println("Subtotal: " + subtotal + " cents ($" + String.format("%.2f", subtotalCurrency) + ")");
        System.out.println("Service Fee: " + SERVICE_FEE_CENTS + " cents ($" + String.format("%.2f", serviceFeeCurrency) + ")");
        System.out.println("Total Due: " + totalCents + " cents ($" + String.format("%.2f", totalCurrency) + ")");

        keyboard.close();
    }
}