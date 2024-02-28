public class Kerucut10 {

    public int sisi;
    public int rusuk;
    public int titikSudut;

    public Kerucut10(int s, int r, int t) {
        sisi = s;
        rusuk = r;
        titikSudut = t;
    }

    public int hitungVolume() {
        return sisi * rusuk * titikSudut;
    }

}