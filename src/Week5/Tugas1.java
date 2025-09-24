package Week5;

import java.util.Scanner;

// Class induk
abstract class BangunRuang {
    protected String warna;

    public BangunRuang(String warna) {
        this.warna = warna;
    }

    public abstract double luas();
    public abstract double keliling();

    public String getWarna() {
        return warna;
    }
}

// Class Lingkaran
class Lingkaran extends BangunRuang {
    private double jariJari;

    public Lingkaran(double jariJari, String warna) {
        super(warna);
        this.jariJari = jariJari;
    }

    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }

    @Override
    public String toString() {
        return "-----------Lingkaran-----------\n" +
               "Warna           : " + warna + "\n" +
               "Jari-jari       : " + jariJari + "\n" +
               "Keliling        : " + keliling() + "\n" +
               "Luas            : " + luas();
    }
}

// Class Persegi
class Persegi extends BangunRuang {
    private double sisi;

    public Persegi(double sisi, String warna) {
        super(warna);
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }

    @Override
    public double keliling() {
        return 4 * sisi;
    }

    @Override
    public String toString() {
        return "-----------Persegi-----------\n" +
               "Warna           : " + warna + "\n" +
               "Panjang Sisi    : " + sisi + "\n" +
               "Keliling        : " + keliling() + "\n" +
               "Luas            : " + luas();
    }
}

// Class Persegi Panjang
class PersegiPanjang extends BangunRuang {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, String warna) {
        super(warna);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public String toString() {
        return "-----------Persegi Panjang-----------\n" +
               "Warna           : " + warna + "\n" +
               "Panjang         : " + panjang + "\n" +
               "Lebar           : " + lebar + "\n" +
               "Keliling        : " + keliling() + "\n" +
               "Luas            : " + luas();
    }
}

// Class Segitiga
class Segitiga extends BangunRuang {
    private double a, b, c, tinggi;

    public Segitiga(double a, double b, double c, double tinggi, String warna) {
        super(warna);
        this.a = a;
        this.b = b;
        this.c = c;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * a * tinggi;
    }

    @Override
    public double keliling() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "-----------Segitiga-----------\n" +
               "Warna           : " + warna + "\n" +
               "Sisi a          : " + a + "\n" +
               "Sisi b          : " + b + "\n" +
               "Sisi c          : " + c + "\n" +
               "Tinggi          : " + tinggi + "\n" +
               "Keliling        : " + keliling() + "\n" +
               "Luas            : " + luas();
    }
}

// Main Class
public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n-------Program Menghitung Bangun Ruang-------");
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            System.out.print("Pilihan : ");
            int pilihan = sc.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan jari-jari : ");
                double r = sc.nextDouble();
                Lingkaran lingkaran = new Lingkaran(r, "Biru");
                System.out.println(lingkaran);

            } else if (pilihan == 2) {
                System.out.print("Masukkan panjang sisi : ");
                double s = sc.nextDouble();
                Persegi persegi = new Persegi(s, "Merah");
                System.out.println(persegi);

            } else if (pilihan == 3) {
                System.out.print("Masukkan panjang : ");
                double p = sc.nextDouble();
                System.out.print("Masukkan lebar   : ");
                double l = sc.nextDouble();
                PersegiPanjang pp = new PersegiPanjang(p, l, "Hijau");
                System.out.println(pp);

            } else if (pilihan == 4) {
                System.out.print("Masukkan sisi a : ");
                double a = sc.nextDouble();
                System.out.print("Masukkan sisi b : ");
                double b = sc.nextDouble();
                System.out.print("Masukkan sisi c : ");
                double c = sc.nextDouble();
                System.out.print("Masukkan tinggi : ");
                double t = sc.nextDouble();
                Segitiga segitiga = new Segitiga(a, b, c, t, "Kuning");
                System.out.println(segitiga);

            } else if (pilihan == 5) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }

        sc.close();
    }
}
