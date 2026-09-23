public class SP1copy1 {

    // Iteration 1 - Variables
    String band = "The Static Waves";
    int fans = 8500;
    int maxFans = 15000;
    int fameLevel = 2;
    int xp = 3200;
    double money = 4750.50;
    boolean isActive = true;
    String[] songNames = {"Electric Dreams", "Midnight Run", "Broken Strings", "Neon Lights"};
    String[] levels = {"Unknown - Playing in garages", "Local Hero - Small venues await",
            "Rising Star - Festival invitations coming in", "Mainstream - Arena tours possible",
            "Superstar - Stadium glory!"};

    void main() {
        System.out.println(" ");
        System.out.println("=== BAND PROFILE ===");
        System.out.println("Name: " + band);
        System.out.println("Fame level: " + fameLevel);
        System.out.println("Fans: " + fans + "/" + maxFans);
        System.out.println("XP: " + xp);
        System.out.println("Money: $" + money);
        System.out.println("Active: " + isActive);

        System.out.println(" ");

        System.out.println("Repertoire (" + songNames.length + " songs): ");
        for (int i = 0; i < songNames.length; i++) {
            System.out.println("- " + songNames[i]);
        }
    }
}



