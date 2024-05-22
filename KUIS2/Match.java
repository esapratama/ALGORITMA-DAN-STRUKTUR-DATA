package KUIS2;

public class Match {
    String homeTeam;
    String awayTeam;
    String result;
    String time;
    int round;
    int point;

    public Match(String homeTeam, String awayTeam, String result, String time, int round, int point) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.result = result;
        this.time = time;
        this.round = round;
        this.point = point;
    }
}
