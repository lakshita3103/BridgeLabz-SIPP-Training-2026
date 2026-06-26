class GameCharacter {
    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    public void performAttack() {
        System.out.println(characterName + " attacks.");
    }
}

class Warrior extends GameCharacter {

    Warrior(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " attacks with a Sword!");
    }
}

class Mage extends GameCharacter {

    Mage(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " casts a Fireball!");
    }
}

class Archer extends GameCharacter {

    Archer(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " shoots an Arrow!");
    }
}

public class gameCharacter {

    public static void startBattle(GameCharacter[] characters) {

        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;

        System.out.println("=== Battle Starts ===");

        for (GameCharacter character : characters) {

            character.performAttack(); // Dynamic Method Dispatch

            if (character instanceof Warrior) {
                warriorCount++;
            } else if (character instanceof Mage) {
                mageCount++;
            } else if (character instanceof Archer) {
                archerCount++;
            }
        }

        System.out.println("\n=== Battle Summary ===");
        System.out.println("Warriors : " + warriorCount);
        System.out.println("Mages    : " + mageCount);
        System.out.println("Archers  : " + archerCount);
    }

    public static void main(String[] args) {

        GameCharacter[] characters = {
                new Warrior("Arjun"),
                new Mage("Merlin"),
                new Archer("Robin"),
                new Warrior("Bhim"),
                new Mage("Harry")
        };

        startBattle(characters);
    }
}