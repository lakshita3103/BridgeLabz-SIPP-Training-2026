interface StreamingService {

    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription: Premium Movies Plan");
    }
}

interface GamingService {

    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription: Ultimate Gaming Pass");
    }
}

class SmartTV implements StreamingService, GamingService {

    String[] movies = {
            "Avengers",
            "Inception",
            "Interstellar",
            "Joker"
    };

    String[] games = {
            "FIFA 25",
            "Minecraft",
            "GTA V",
            "Forza Horizon"
    };

    @Override
    public void streamMovie() {
        System.out.println("\nAvailable Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void playGame() {
        System.out.println("\nAvailable Games:");
        for (String game : games) {
            System.out.println(game);
        }
    }

    // Resolving default method conflict
    @Override
    public void showSubscriptionDetails() {
        System.out.println("\nSubscription Details:");

        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class SmartTVDemo {
    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();
        tv.streamMovie();
        tv.playGame();
    }
}