public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleNullPointerException() {
        String text = null;
        try {
            // Attempt to access method on null object
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException! Cannot call methods on null objects.");
        }
    }

    public static void main(String[] args) {
        // Generate NullPointerException (unhandled)
        System.out.println("Demonstrating unhandled NullPointerException:");
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred: " + e);
        }

        // Handle NullPointerException using try-catch
        System.out.println("\nDemonstrating handled NullPointerException:");
        handleNullPointerException();
    }
}
