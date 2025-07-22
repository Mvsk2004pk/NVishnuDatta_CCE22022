public class accessmodifier {

    public int publicVar = 10;
    private String privateVar = "Private Data";
    protected double protectedVar = 99.99;
    int defaultVar = 50;
    public final String MY_NAME = "Kartheek";

    public static void main(String[] args) {
        accessmodifier obj = new accessmodifier();

        System.out.println("--- Understanding Java Access Modifiers ---" +
                           "\n\n--- Variable Access Examples ---" +
                           "\nPublic Variable (accessible everywhere): " + obj.publicVar +
                           "\nPrivate Variable (accessible only inside this class): " + obj.privateVar +
                           "\nProtected Variable (accessible in package and subclasses): " + obj.protectedVar +
                           "\nDefault Variable (accessible only within the same package): " + obj.defaultVar +
                           "\nFinal Constant (value cannot be changed): " + obj.MY_NAME +
                           "\n\n--- End of Access Modifier Examples ---");
    }
}