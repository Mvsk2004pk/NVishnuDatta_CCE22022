public class datatypes {
    public static void main(String[] args) {

        System.out.println("--- Exploring Java Data Types ---");

        // Integer Data Types
        System.out.println("\n*** Integer Numbers ***");
        byte myByte = 127; // Storing a small whole number
        System.out.println("A byte stores very small whole numbers. Example: " + myByte);

        short myShort = 32767; // Storing a small to medium whole number
        System.out.println("A short stores medium-sized whole numbers. Example: " + myShort);

        int myInt = 2_000_000_000; // The most commonly used whole number type
        System.out.println("An int is for general-purpose whole numbers. Example: " + myInt);

        long myLong = 9_000_000_000_000_000_000L; // For very large whole numbers (note the 'L'!)
        System.out.println("A long handles very large whole numbers. Example: " + myLong);

        // Floating-Point Data Types
        System.out.println("\n*** Decimal Numbers (Floating-Point) ***");
        float myFloat = 3.14159f; // For single-precision decimal numbers (note the 'f'!)
        System.out.println("A float is for decimals with less precision. Example: " + myFloat);

        double myDouble = 3.1415926535; // For higher-precision decimal numbers (default)
        System.out.println("A double is for decimals with high precision. Example: " + myDouble);

        // Character Data Type
        System.out.println("\n*** Single Characters ***");
        char myChar = 'A'; // Stores a single character
        System.out.println("A char holds a single character. Example: '" + myChar + "'");

        // Boolean Data Type
        System.out.println("\n*** True/False Values ***");
        boolean myBoolean = true; // Stores true or false
        System.out.println("A boolean represents true or false. Example: " + myBoolean);

        System.out.println("\n--- End of Data Type Examples ---");
    }
}