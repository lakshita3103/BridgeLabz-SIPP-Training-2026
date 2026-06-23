class Drone{
    private String droneId;
    private int batteryPercentage;

    static String companyName = "ABC Pvt Ltd";

    Drone(String droneId, int batteryPercentage){
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    void startDelivery(){
        if(batteryPercentage >= 20){
            System.out.println(droneId + "has started delivery.");
            batteryPercentage -= 10;
        }
        else{
            System.out.println(droneId + "cant start delivery. Low battery");
        }
    }

    void displayStatus(){
        System.out.println("Company Name: "+companyName);
        System.out.println("Drone ID: "+droneId);
        System.out.println("Battery Percentage: "+batteryPercentage+"%");
        System.out.println();
    }
}
public class DroneDemo {
    public static void main(String[] args) {
        Drone d1 = new Drone("ABC", 60);
        Drone d2 = new Drone("DEF", 80);
        Drone d3 = new Drone("GHT", 15);

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        System.out.println("Company of Drone 1: " + Drone.companyName);
        System.out.println("Company of Drone 2: " + Drone.companyName);
        System.out.println("Company of Drone 3: " + Drone.companyName);
    }
}
