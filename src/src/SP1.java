public class SP1 {
    public static void main(String[] args) {
        // SP1
        String band = "The Static Waves";
        int fans = 8500;
        int maxFans = 15000;
        int fameLevel = 2;
        int xp = 3200;
        double money = 4750.50;
        boolean isActive = true;
        String[] genres = {"‘R’ (Rock)", "‘E’ (Electronic)", "‘H’ (HipHop)", "‘P’ (Pop)"};
        String[] names = {"Electric Dreams", "Midnight Run", "Broken Strings", "Neon Lights"};

        System.out.println("=== BAND PROFILE ===");
        System.out.println("Name: " + band);
        System.out.println("Genre: " + genres[0]);
        System.out.println("Fame level: " + fameLevel);
        System.out.println("Fans: " + fans + "/" + maxFans);
        System.out.println("XP: " + xp);
        System.out.println("Money: $" + money);
        System.out.println("Active: " + isActive);
        System.out.println("");


        System.out.println("Repertoire (4 songs): ");

        for (int i = 0; i < 4; i++) {
            System.out.println("- " + names[i]);


        }
    }
}
