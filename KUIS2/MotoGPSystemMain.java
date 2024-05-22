package KUIS2;

public class MotoGPSystemMain {
    public static void main(String[] args) {
        // Inisialisasi data pembalap
        Tournament tournament = new Tournament();
        tournament.addRider("Marc Marquez (Repsol Honda)", 200, 10);
        tournament.addRider("Valentino Rossi (Monster Energy Yamaha)", 180, 8);
        tournament.addRider("Jorge Lorenzo (Ducati Team)", 160, 7);
        tournament.addRider("Andrea Dovizioso (Ducati Team)", 140, 5);

        // Menampilkan daftar pembalap
        tournament.printRiderStandings();

        // Simulasi pertandingan
        tournament.addMatch("Marc Marquez (Repsol Honda)", "Valentino Rossi (Monster Energy Yamaha)",
                "Marc Marquez wins", "08:00", 5, 25);
        tournament.addMatch("Jorge Lorenzo (Ducati Team)", "Andrea Dovizioso (Ducati Team)",
                "Jorge Lorenzo wins", "09:30", 7, 20);

        // Tambahkan data klasemen perancang mesin
        tournament.addConstructor("Repsol Honda", 400, 20, 10);
        tournament.addConstructor("Monster Energy Yamaha", 350, 16, 8);
        tournament.addConstructor("Ducati Team", 320, 12, 7);

        // Menampilkan hasil pertandingan dan klasemen akhir
        tournament.printMatches();
        tournament.printConstructorStandings();
    }
}
