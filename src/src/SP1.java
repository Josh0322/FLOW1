import org.w3c.dom.ls.LSOutput;

public class SP1 {

        // Iteration 4 - Objects
        class Band {

            // instance fields
            // Data, som hvert objekt har sin egen version af.Data, som hvert objekt har sin egen version af.
            String band;
            int fans;
            int maxFans;
            int xp;
            double money;
            boolean isActive;
            int fameLevel;
            char genre;

            String[] songNames = {
                    "Electric Dreams",
                    "Midnight Run",
                    "Broken Strings",
                    "Neon Lights"
            };

            String[] levels = {
                    "Unknown - Playing in garages",
                    "Local Hero - Small venues await",
                    "Rising Star - Festival invitations coming in",
                    "Mainstream - Arena tours possible",
                    "Superstar - Stadium glory!"
            };


            // Constructor
            Band(String band, char genre) {
                this.band = band;
                this.genre = genre;

                fans = 1000;
                maxFans = 5000;
                xp = 0;
                money = 500;
                isActive = true;
                fameLevel = 1;
            }

            // Instance methods:
            int getFans() {
                return fans;
            }


            String getName() {
                return band;
            }

            void printBandProfile() {

                String genreName = "";
                if (genre == 'R') {
                    genreName = "Rock";
                } else if (genre == 'E') {
                    genreName = "Electronic";
                } else if (genre == 'H') {
                    genreName = "HipHop";
                } else if (genre == 'P') {
                    genreName = "Pop";
                }

                title("=== " + band + " (" + genreName + ") ===");
                System.out.println("Fame Level: " + fameLevel + " | Fans: " + fans + "/" + maxFans + " | Money: $" + money);
                emptyLine();
            }


            void playGig(int venueCapacity, int attendance) { // 2 paramtere

                int oldFans = fans;
                double oldMoney = money;

                int attendancePercentage = attendance * 100 / venueCapacity;

                System.out.println(band + " plays to " + attendance + " people! (" + attendancePercentage + "% full)");

                // Gaining fans after concert:
                int fanGain = attendance / 4;
                gainFans(fanGain);
                earnMoney(3000);

                System.out.println("Fans: " + oldFans + " -> " + fans);
                System.out.println("Money: $" + oldMoney + " -> $" + money);
                emptyLine();

            }


            void gainFans(int amount) {
                int newFans = fans + amount;

                if (newFans > maxFans) {
                    newFans = maxFans;
                }

                fans = newFans;
            }

            void loseFans(int amount) {
                int newFans = fans - amount;

                if (newFans < 0) {
                    newFans = 0;
                }

                System.out.println("Fans: " + fans + " -> " + newFans);
                fans = newFans;
            }


            void earnMoney(double amount) {
                double newMoney = money + amount;
                money = newMoney;
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

            void addXP(int amount) {

                int newXP = xp + amount;
                xp = newXP;

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

                double fanPercentage =
                        (fans * 100.0) / maxFans;

                return fanPercentage;
            }

            void printSongs() {

                System.out.println("Repertoire (" + songNames.length + " songs): ");

                for (int i = 0; i < songNames.length; i++) {
                    System.out.println("- " + songNames[i]);
                }
            }


            void getStatusTitle(int famelevel) { // famelevel som parameter

                // switch bruges, når du vil vælge mellem flere
                // bestemte muligheder ud fra værdien af en variabel
                switch (famelevel) {
                    case 1:
                        System.out.println(levels[0]);
                        break;

                    case 2:
                        System.out.println(levels[1]);
                        break;

                    case 3:
                        System.out.println(levels[2]);
                        break;

                    case 4:
                        System.out.println(levels[3]);
                        break;

                    case 5:
                        System.out.println(levels[4]);
                        break;

                    default:
                        System.out.println("Unknown fame level");

                }

            }


            void compete(Band opponent) {

                System.out.println(band + " competes against " + opponent.band);

                if (fans > opponent.fans) {
                    System.out.println(band + " is dominating the scene!");

                } else if (opponent.fans > fans) {
                    System.out.println(opponent.band + " is the crowd favorite!");

                } else {
                    System.out.println("Both bands have the same number of fans!");
                }
            }


            void getEventType(int type) {

                int newFans;
                switch (type) {

                    case 1:
                        System.out.println("Great review! +500 fans");
                        newFans = fans + 500;

                        if (newFans > maxFans) {
                            newFans = maxFans;
                        }

                        System.out.println(fans + " -> " + newFans);
                        fans = newFans;
                        break;

                    case 2:
                        System.out.println("Quiet week. Nothing happens.");
                        break;

                    case 3:
                        System.out.println("Scandal! -300 fans");
                        newFans = fans - 300;

                        if (newFans < 0) {
                            newFans = 0;
                        }

                        System.out.println(fans + " -> " + newFans);
                        fans = newFans;
                        break;

                    default:
                        System.out.println("Unknown event type");
                }
            }
        }

             void emptyLine() {
                System.out.println();
            }


        void title(String message) {
            System.out.println("=== " + message + " ===");
        }


        // Main method
        void main() {
            emptyLine();

            // Create  differents band objects:
            Band myBand = new Band("The Static Waves", 'R');

            Band rival = new Band("Neon Disaster", 'E');

            // Band rival2 = new Band("The Sharks", 'H'); Kan tilføje flere bands.

            // Print starting profiles
            myBand.printBandProfile();
            rival.printBandProfile();

            // rival2.printBandProfile();

            // Festival with both bands:
            title("=== SUMMER FESTIVAL ===");

            myBand.playGig(2000, 1800);
            rival.playGig(2000, 1650);

            // Who's better:
            myBand.compete(rival);
            emptyLine();

            myBand.levelUp(); // Leveler myBand op
            myBand.earnMoney(3000);

            // Print final profiles
            myBand.printBandProfile();
            rival.printBandProfile();

            title("STATUS TITLES");
            System.out.println(myBand.getName());
            myBand.getStatusTitle(myBand.fameLevel);
            emptyLine();
            System.out.println(rival.getName());
            rival.getStatusTitle(rival.fameLevel);

        }
    }
