import java.sql.SQLOutput;

public class SP1copy3 {

    // Iteration 3 - Methods
    String band = "The Static Waves";
    int fans = 8500;
    int maxFans = 15000;
    int xp = 3200;
    double money = 4750.50;
    boolean isActive = true;
    int fameLevel = 2;
    String[] genres = {"‘R’ (Rock)", "‘E’ (Electronic)", "‘H’ (HipHop)", "‘P’ (Pop)"};
    String[] songNames = {"Electric Dreams", "Midnight Run", "Broken Strings", "Neon Lights"};
    String[] levels = {"Unknown - Playing in garages", "Local Hero - Small venues await",
            "Rising Star - Festival invitations coming in", "Mainstream - Arena tours possible",
            "Superstar - Stadium glory!"};

    void emptyLine() { // Metode der printer tom linje
        System.out.println(" ");
    }

    void title(String message) { // Metode med parameter der printer titler
        System.out.println("=== " + message + " ===");
    }

    void printBandProfile() {
        System.out.println("Name: " + band);
        System.out.println("Genre: " + genres[0]);
        System.out.println("Fame level: " + fameLevel);
        System.out.println("Fans: " + fans + "/" + maxFans);
        System.out.println("XP: " + xp);
        System.out.println("Money: $" + money);
        System.out.println("Active: " + isActive);
    }

    void playGig(int venueCapacity, int attendance) {
        System.out.println("Playing at venue (capacity: " + venueCapacity + ")");
        System.out.println("Attendance: " + attendance + " ("
                + (attendance * 100 / venueCapacity) + "%)");

        if (attendance * 100 / venueCapacity >= 80) {
            System.out.println("Great turnout!");
        }

        gainFans(200);

        earnMoney(1500);
    }

    void gainFans(int amount) {
        int newFans = 0;
        newFans = fans + amount;
        System.out.println("fans: " + fans + " -> " + newFans);
    }

    void loseFans(int amount) {
        int newFans;
        newFans = fans - amount;
        System.out.println("fans: " + fans + " -> " + newFans);
    }

    void earnMoney(double amount) {
        double newMoney;
        newMoney = money + amount;
        System.out.println("money: " + money + " -> " + newMoney);
    }

    boolean spendMoney(double amount) {
        if (money >= amount) {
            double newMoney;
            newMoney = money - amount;
            System.out.println("Spent money: " + money + " -> " + newMoney);
            money = newMoney;
            return true;
        } else {
            return false;
        }
    }

    void addXP(int amount) { // Fame system
        int newXP;
        newXP = xp + amount;
        title("STATUS CHECK");
        if (xp > 2000) {
            System.out.println("Ready to level up!");
        }
        if (xp <= 0) {
            System.out.println("The band has broken up...");
        }
    }

    void levelUp() {
        fameLevel = fameLevel + 1;
        xp = 0;

        if (fameLevel == 2) {
            maxFans = 15000;
        } else if (fameLevel == 3) {
            maxFans = 50000;
        } else if (fameLevel == 4) {
            maxFans = 200000;
        } else if (fameLevel == 5) {
            maxFans = 1000000;
        }
    }

    boolean isLosingRelevance() {
        if (fans < maxFans * 0.25) {
            System.out.println("The band is losing relevance.");
            return true;
        } else {
            System.out.println("The band is still relevant.");
            return false;
        }
    }

    boolean isActive() {
        if (fans > 0) {
            return true;
        } else {
            return false;
        }
    }

    double getFanPercentage() {
        double fanPercentage = (fans * 100.0) / maxFans;
        return fanPercentage;
    }

    void printSongs() {
        System.out.println("Repertoire (" + songNames.length + " songs): ");
        for (int i = 0; i < 4; i++) {
            System.out.println("- " + songNames[i]);
        }
    }

    void getStatusTitle(int famelevel) {
        switch (fameLevel) {
            case 1:
                System.out.println(levels[0]);
                break;
            case 2:
                System.out.println(levels[1]);
                break;
            case 3:
                System.out.println(levels[2]);
                break;
            default:
                System.out.println(levels[3]);
        }
    }

    void getEventType(int type) {
        switch (type) {
            case 1:
                System.out.println("Great review! +500 fans");
                int newFans;
                newFans = fans + 500;
                System.out.println(fans + " -> " + newFans);
                break;
            case 2:
                System.out.println("Quiet week. Nothing happens.");
                break;
            case 3:
                System.out.println("Scandal! -300 fans");
                newFans = fans - 300;
                System.out.println(fans + " -> " + newFans);
                break;
        }
    }


    void main() {
        emptyLine();

        title("BAND PROFILE");
        printBandProfile();

        // bandets nuværende status baseret på fame level
        getStatusTitle(1);

        emptyLine();
        printSongs();
        emptyLine();
        addXP(0);
        emptyLine();
        title("GIG NIGHT");
        playGig(500, 400);
        emptyLine();
        title("RELEVANCEY");
        isLosingRelevance();
        System.out.println(getFanPercentage() + "% of max fans!");
        emptyLine();
        title("RANDOM EVENT");
        getEventType(1);

    }
        }


