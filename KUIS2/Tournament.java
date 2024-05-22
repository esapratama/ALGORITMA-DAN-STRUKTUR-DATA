package KUIS2;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    // Inner class for Rider
    public static class Rider {
        String name;
        int points;
        int podiums;

        public Rider(String name, int points, int podiums) {
            this.name = name;
            this.points = points;
            this.podiums = podiums;
        }

        @Override
        public String toString() {
            return name + " - Points: " + points + ", Podiums: " + podiums;
        }
    }

    // Inner class for Constructor
    public static class Constructor {
        String name;
        int points;
        int wins;
        int podiums;

        public Constructor(String name, int points, int wins, int podiums) {
            this.name = name;
            this.points = points;
            this.wins = wins;
            this.podiums = podiums;
        }

        @Override
        public String toString() {
            return name + " - Points: " + points + ", Wins: " + wins + ", Podiums: " + podiums;
        }
    }

    // Class attributes
    List<Match> matches;
    List<Rider> riderStandings;
    List<Constructor> constructorStandings;

    public Tournament() {
        matches = new ArrayList<>();
        riderStandings = new ArrayList<>();
        constructorStandings = new ArrayList<>();
    }

    public void addMatch(String homeTeam, String awayTeam, String result, String time, int round, int point) {
        Match match = new Match(homeTeam, awayTeam, result, time, round, point);
        matches.add(match);
    }

    public void addRider(String name, int points, int podiums) {
        Rider rider = new Rider(name, points, podiums);
        riderStandings.add(rider);
    }

    public void addConstructor(String name, int points, int wins, int podiums) {
        Constructor constructor = new Constructor(name, points, wins, podiums);
        constructorStandings.add(constructor);
    }

    public void printMatches() {
        System.out.println(
                "=========================================================================================================================");
        System.out.printf("| %-4s| %-30s| %-30s| %-20s| %-10s| %-6s| %-6s|\n",
                "No.", "Home Team", "Away Team", "Result", "Time", "Round", "Point");
        System.out.println(
                "=========================================================================================================================");
        for (int i = 0; i < matches.size(); i++) {
            Match match = matches.get(i);
            // Pastikan setiap atribut memiliki lebar maksimum yang sesuai
            String homeTeam = match.homeTeam.length() > 30 ? match.homeTeam.substring(0, 27) + "..." : match.homeTeam;
            String awayTeam = match.awayTeam.length() > 30 ? match.awayTeam.substring(0, 27) + "..." : match.awayTeam;
            String result = match.result.length() > 20 ? match.result.substring(0, 17) + "..." : match.result;
            String time = match.time.length() > 10 ? match.time.substring(0, 7) + "..." : match.time;
            System.out.printf("| %-4d| %-30s| %-30s| %-20s| %-10s| %-6d| %-6d|\n",
                    i + 1, homeTeam, awayTeam, result, time, match.round, match.point);
        }
        System.out.println(
                "=========================================================================================================================");
    }

    public void printRiderStandings() {
        System.out.println(
                "===============================================================");
        System.out.printf("| %-4s| %-30s| %-10s| %-10s|\n",
                "No.", "Rider", "Points", "Podiums");
        System.out.println(
                "===============================================================");
        for (int i = 0; i < riderStandings.size(); i++) {
            Rider rider = riderStandings.get(i);
            System.out.printf("| %-4d| %-30s| %-10d| %-10d|\n",
                    i + 1, rider.name, rider.points, rider.podiums);
        }
        System.out.println(
                "===============================================================");
    }

    public void printConstructorStandings() {
        System.out.println(
                "===========================================================================");
        System.out.printf("| %-4s| %-30s| %-10s| %-10s| %-10s|\n",
                "No.", "Constructor", "Points", "Wins", "Podiums");
        System.out.println(
                "===========================================================================");
        for (int i = 0; i < constructorStandings.size(); i++) {
            Constructor constructor = constructorStandings.get(i);
            System.out.printf("| %-4d| %-30s| %-10d| %-10d| %-10d|\n",
                    i + 1, constructor.name, constructor.points, constructor.wins, constructor.podiums);
        }
        System.out.println(
                "===========================================================================");
    }
}
