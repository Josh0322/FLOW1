public class SP1copy2 {

    // Iteration 2 - Control Structures
    String band = "The Static Waves";
    int fans = 8500;
    int maxFans = 15000;
    int xp = 3200;
    double money = 4750.50;
    boolean isActive = true;
    int fameLevel = 2;
    int eventType = 1;
    String[] genres = {"‘R’ (Rock)", "‘E’ (Electronic)", "‘H’ (HipHop)", "‘P’ (Pop)"};
    String[] songNames = {"Electric Dreams", "Midnight Run", "Broken Strings", "Neon Lights"};
    String[] levels = {"Unknown - Playing in garages", "Local Hero - Small venues await",
            "Rising Star - Festival invitations coming in", "Mainstream - Arena tours possible",
            "Superstar - Stadium glory!"};

    void main() {
        System.out.println(" ");

        System.out.println("=== BAND PROFILE ===");

        System.out.println("Name: " + band);
        System.out.println("Genre: " + genres[0]);
        System.out.println("Fame level: " + fameLevel);
        System.out.println("Fans: " + fans + "/" + maxFans);
        System.out.println("XP: " + xp);
        System.out.println("Money: $" + money);
        System.out.println("Active: " + isActive);

        // bandets nuværende status baseret på fame level
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

        System.out.println(" ");

        System.out.println("Repertoire (" + songNames.length + " songs): ");
        for (int i = 0; i < 4; i++) {
            System.out.println("- " + songNames[i]);
        }

        System.out.println(" ");
        System.out.println("=== STATUS CHECK ===");       // Fame system
        if (xp > 2000) {
            System.out.println("Ready to level up!");
        }
        System.out.println(" ");

        System.out.println("=== GIG NIGHT ===");
        int venueCapacity = 500;
        int attendance = 420;
        System.out.println("Playing at venue (capacity: " + venueCapacity + ")");
        System.out.println("Attendance: " + attendance + " (" + (attendance * 100 / venueCapacity) + "%)");

        if (attendance * 100 / venueCapacity >= 80) {
            System.out.println("Great turnout!");
        }

        int oldFans = fans;
        fans = fans + 200;
        System.out.println("Fans: " + oldFans + " -> " + fans);

        double oldMoney = money;
        money = money + 1500;
        System.out.println("Money: $" + oldMoney + " -> $" + money);

        System.out.println(" ");
        System.out.println("=== RANDOM EVENT ===");

        switch (eventType) {
            case 1:
                System.out.println("Great review! +500 fans");
                fans = fans + 500;
                break;
            case 2:
                System.out.println("Quiet week. Nothing happens.");
                break;
            case 3:
                System.out.println("Scandal! -300 fans");
                fans = fans - 300;
                break;
        }

    }
        }


