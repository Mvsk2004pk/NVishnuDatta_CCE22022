
class Calculator {

    
    int add(int a, int b) {
        System.out.print("Adding two integers: ");
        return a + b;
    }

    
    double add(double a, double b) {
        System.out.print("Adding two doubles: ");
        return a + b;
    }

    
    int add(int a, int b, int c) {
        System.out.print("Adding three integers: ");
        return a + b + c;
    }
}

// Main class to run the code
public class TestOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // The compiler knows which 'add' method to call based on the arguments
        System.out.println(calc.add(5, 10));         
        System.out.println(calc.add(5.5, 4.5));      
        System.out.println(calc.add(5, 10, 15));   
    }
}