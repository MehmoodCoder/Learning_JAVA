// Student ID: 2026-702

import java.util.Scanner;

public class ScannerTrapLab {
    public static void main(String[] args) {
        System.out.println("Student ID: 2026-702");
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter year: ");
        int year = keyboard.nextInt();

        // resolve error
        keyboard.nextLine();
        
        System.out.print("Enter full name: ");
        String name = keyboard.nextLine();
        
        System.out.println("Name=" + name + ", year=" + year);

        keyboard.close();
    }
}
