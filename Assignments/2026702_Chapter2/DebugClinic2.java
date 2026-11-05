// Student ID: 2026-702

public class DebugClinic2 {
    public static void main(String[] args) {
        System.out.println("Student ID: 2026-702");
        
        int pages = 3 + 2;          // 5 pages
        double price = 6 + 0.5;     // 6.5 per page
        
        // Fixed: changed '+' to '*'
        double total = pages * price; 
        
        System.out.println("Correct Total Cost: " + total);
    }
}