import java.util.Scanner;

public class RockPaperScissors {

    // Method to get computer choice
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3); // 0, 1, or 2
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            case 2: return "Scissors";
            default: return "Rock"; // fallback
        }
    }

    // Method to find winner
    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "Draw";
        }

        switch (userChoice.toLowerCase()) {
            case "rock":
                return (computerChoice.equalsIgnoreCase("Scissors")) ? "Player" : "Computer";
            case "paper":
                return (computerChoice.equalsIgnoreCase("Rock")) ? "Player" : "Computer";
            case "scissors":
                return (computerChoice.equalsIgnoreCase("Paper")) ? "Player" : "Computer";
            default:
                return "Invalid";
        }
    }

    // Method to calculate average and percentage wins
    public static String[][] calculateStats(int playerWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[3][2];

        stats[0][0] = "Player Wins"; stats[0][1] = playerWins + " (" + (playerWins * 100.0 / totalGames) + "%)";
        stats[1][0] = "Computer Wins"; stats[1][1] = computerWins + " (" + (computerWins * 100.0 / totalGames) + "%)";
        stats[2][0] = "Draws"; stats[2][1] = draws + " (" + (draws * 100.0 / totalGames) + "%)";

        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tPlayer\tComputer\tWinner");
        System.out.println("----------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nOverall Stats:");
        System.out.println("Category\tCount (Percentage)");
        System.out.println("-----------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int totalGames = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] gameResults = new String[totalGames][3];
        int playerWins = 0, computerWins = 0, draws = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("Enter your choice (Rock, Paper, Scissors) for game " + (i + 1) + ": ");
            String userChoice = sc.nextLine();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        // Calculate stats
        String[][] stats = calculateStats(playerWins, computerWins, draws, totalGames);

        // Display results
        displayResults(gameResults, stats);

        sc.close();
    }
}
