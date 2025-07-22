public class BasicOperations {
    public static void main(String[] args) {

        System.out.println("--- Arithmetic Operations ---");
        int a = 10;
        int b = 3;
        System.out.println("Numbers: a = " + a + ", b = " + b);
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b)); // Integer division
        System.out.println("Modulus (a % b): " + (a % b));

        System.out.println("\n--- Logical Operations ---");
        boolean x = true;
        boolean y = false;
        System.out.println("Booleans: x = " + x + ", y = " + y);
        System.out.println("Logical AND (x && y): " + (x && y));
        System.out.println("Logical OR (x || y): " + (x || y));
        System.out.println("Logical NOT (!x): " + (!x));
    }
}