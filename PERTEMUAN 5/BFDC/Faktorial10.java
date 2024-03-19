package BFDC;

public class Faktorial10 {

    public int nilai;

    int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    int faktorialDc(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDc(n - 1);
            return fakto;
        }
    }
}
