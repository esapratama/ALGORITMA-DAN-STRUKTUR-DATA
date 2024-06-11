package TUGAS2;

public class Film10 {
    int id;
    String judul;
    double rating;
    Film10 prev, next;

    Film10(Film10 prev, int id, String judul, double rate, Film10 next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        rating = rate;
        this.next = next;
    }
}
