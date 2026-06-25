interface Trackable {

    void logActivity();

    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Logging today's activity...");
    }

    @Override
    public void generateReport() {
        System.out.println("Generating fitness report...");
    }

    @Override
    public void sendAlert() {
        System.out.println("Sending health alert...");
    }
}

public class FitnessTrackerDemo {
    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();

        // Default method from Trackable
        device.resetData();
    }
}