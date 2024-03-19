package LATIHAN5;

import java.util.ArrayList;

public class MainMobil10 {
    public static void main(String[] args) {
        ArrayList<Mobil10> cars = new ArrayList<>();
        cars.add(new Mobil10("BMW", "M2 Coupe", 2016, 6816, 728));
        cars.add(new Mobil10("Ford", "Fiesta ST", 2014, 3921, 575));
        cars.add(new Mobil10("Nissan", "370Z", 2009, 4360, 657));
        cars.add(new Mobil10("Subaru", "BRZ", 2014, 4058, 609));
        cars.add(new Mobil10("Subaru", "Impreza WRX STI", 2013, 6255, 703));
        cars.add(new Mobil10("Toyota", "AE86 Trueno", 1986, 3700, 553));
        cars.add(new Mobil10("Toyota", "86/GT86", 2014, 4180, 609));
        cars.add(new Mobil10("Volkswagen", "Golf GTI", 2014, 4180, 631));

        // Menemukan nilai tertinggi dan terendah menggunakan Divide and Conquer
        int maxAcceleration = maxDivideConquer(cars, 0, cars.size() - 1);
        int minAcceleration = minDivideConquer(cars, 0, cars.size() - 1);

        // Menghitung rata-rata top_power menggunakan Brute Force
        double averagePower = averageBruteForce(cars);

        // Menampilkan hasil
        System.out.println("a) Top acceleration tertinggi: " + maxAcceleration);
        System.out.println("b) Top acceleration terendah: " + minAcceleration);
        System.out.println("c) Rata-rata top power dari seluruh mobil: " + averagePower);
    }

    // Fungsi Divide and Conquer untuk mencari nilai tertinggi
    public static int maxDivideConquer(ArrayList<Mobil10> cars, int low, int high) {
        if (low == high)
            return cars.get(low).top_acceleration;

        int mid = (low + high) / 2;
        int leftMax = maxDivideConquer(cars, low, mid);
        int rightMax = maxDivideConquer(cars, mid + 1, high);

        return Math.max(leftMax, rightMax);
    }

    // Fungsi Divide and Conquer untuk mencari nilai terendah
    public static int minDivideConquer(ArrayList<Mobil10> cars, int low, int high) {
        if (low == high)
            return cars.get(low).top_acceleration;

        int mid = (low + high) / 2;
        int leftMin = minDivideConquer(cars, low, mid);
        int rightMin = minDivideConquer(cars, mid + 1, high);

        return Math.min(leftMin, rightMin);
    }

    // Fungsi Brute Force untuk menghitung rata-rata
    public static double averageBruteForce(ArrayList<Mobil10> cars) {
        int totalPower = 0;
        for (Mobil10 car : cars) {
            totalPower += car.top_power;
        }
        return (double) totalPower / cars.size();
    }
}
