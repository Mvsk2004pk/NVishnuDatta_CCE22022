public class scanops {
    public static void main(String[] args) {
        String operation = "subtract";
        int value1 = 50;
        double value2 = 25.5;

        // Combine initial variable printouts
        System.out.println("--- Operation Details ---" +
                           "\nOperation: " + operation +
                           "\nValue 1: " + value1 +
                           "\nValue 2: " + value2);

        // Example operation based on hardcoded values
        if (operation.equals("subtract")) {
            // Combine result printout
            System.out.println("Result of subtraction: " + (value1 - value2));
        }
    }
}