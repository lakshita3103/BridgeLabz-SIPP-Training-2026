interface TextModeration {

    boolean checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Offensive language is not allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        String[] restrictedWords = {"hate", "abuse", "violence"};

        for (String word : restrictedWords) {
            if (post.toLowerCase().contains(word)) {
                return true;
            }
        }
        return false;
    }
}

interface SpamDetection {

    boolean checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Spam and promotional content are not allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public boolean checkOffensiveContent(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean checkSpam(String post) {
        String[] spamKeywords = {
                "buy now",
                "free money",
                "click here",
                "limited offer"
        };

        for (String keyword : spamKeywords) {
            if (post.toLowerCase().contains(keyword)) {
                return true;
            }
        }
        return false;
    }

    // Resolving default method conflict
    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class ContentModerationDemo {

    public static void main(String[] args) {

        String[] posts = {
                "I love learning Java programming.",
                "Buy now and get 50% discount!",
                "This post spreads hate among people.",
                "Click here to win free money.",
                "Have a great day everyone!"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println("\nPost Analysis:");

        for (String post : posts) {

            if (moderator.checkSpam(post)) {
                System.out.println("\"" + post + "\" -> SPAM POST");
            }
            else if (moderator.checkOffensiveContent(post)) {
                System.out.println("\"" + post + "\" -> OFFENSIVE POST");
            }
            else {
                System.out.println("\"" + post + "\" -> VALID POST");
            }
        }
    }
}