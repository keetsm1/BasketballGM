import java.util.ArrayList;
import java.io.*;

public class Team {
    private ArrayList<Player> players; // List of players on the team
    private ArrayList<String> teamNames; // List to store team names from the CSV
    private double budget;

    public Team(double budget) {
        this.teamNames = new ArrayList<>(); // Initialize the list of team names
        this.budget = budget;
    }

    public void readTeamNames() {
        String fileName = "nba_fake_teams.csv"; // File name
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(fileName));

            // Skip the header line
            if ((line = reader.readLine()) != null) {
                System.out.println("Header: " + line); // Print header if necessary
            }

            // Read the team names
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                // Assuming the team name is in the first column
                if (row.length > 0) {
                    String teamName = row[0].trim(); // Get team name and trim whitespace
                    teamNames.add(teamName); // Add team name to the list
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Close reader if it was initialized
                }
            } catch (IOException e) {
                System.err.println("Error closing the reader: " + e.getMessage());
            }
        }
    }
    // Method to display all team names
    public void displayTeamNames() {
        System.out.println("List of NBA Teams:");
        for (String name : teamNames) {
            System.out.printf("%-30s\n", name);
        }
    }

    public void addPlayertoTeams(Player player){
        if(players.size()< 15 ){
            players.add(player);
        }
        else {
            System.out.println("Team already has 15 players. Cannot add more.");
        }
        }

    public void displayTeamPlayers() {
        System.out.println("Players in  :");
        for (Player player : players) {
            System.out.println("Position: " + player.getPosition() + ", Height: " + player.getHeight() + ", Weight: " + player.getWeight() + ", Reach: " + player.getReach());
        }


    }

}

