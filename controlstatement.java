public class controlstatement {
    public static void main(String[] args) {
        int score = 75;
        String day = "Tuesday";
        int counter = 0;

        // If-Else Statements
        System.out.println("--- If-Else Statements ---");
        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else {
            grade = "D or F";
        }
        System.out.println("Score: " + score + " -> Grade: " + grade);


        // For Loop
        System.out.println("\n--- For Loop ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        // While Loop
        System.out.println("\n--- While Loop ---");
        while (counter < 3) {
            System.out.println("While loop iteration: " + counter);
            counter++;
        }

        // Do-While Loop
        System.out.println("\n--- Do-While Loop ---");
        int doWhileCounter = 0;
        do {
            System.out.println("Do-While loop iteration: " + doWhileCounter);
            doWhileCounter++;
        } while (doWhileCounter < 2);

        // Switch Statement
        System.out.println("\n--- Switch Statement ---");
        String dayMessage;
        switch (day) {
            case "Monday":
                dayMessage = "It's Monday, start of the week.";
                break;
            case "Tuesday":
                dayMessage = "It's Tuesday, a working day.";
                break;
            case "Wednesday":
                dayMessage = "It's Wednesday, hump day!";
                break;
            default:
                dayMessage = "It's another day.";
        }
        System.out.println("Day: " + day + " -> " + dayMessage);
    }
}