import java.util.Scanner;
public class latihanmethod {
    public static void main(String []args) {
    Scanner in = new Scanner(System.in);
String ulang;

do {
    System.out.println("Menghitung Luas");
    System.out.println("1. Luas Persegi");
    System.out.println("2. Luas Persegi Panjang");
    System.out.println("3. Luas Segitiga");
    System.out.println("4. Luas Lingkaran");
    System.out.print("Masukkan pilihan anda: ");
    int pilihan = in.nextInt();

    switch (pilihan) {
        case 1:
            System.out.print("Masukkan panjang sisi: ");
            int s = in.nextInt();
            System.out.println("Luas Persegi: " + LuasPersegi(s));
            break;

        case 2:
            System.out.print("Masukkan panjang: ");
            int p = in.nextInt();
            System.out.print("Masukkan lebar: ");
            int l = in.nextInt();
            System.out.println("Luas Persegi Panjang: " + luaspersegi(p, l));
            break;

        case 3:
            System.out.print("Masukkan alas: ");
            int a = in.nextInt();
            System.out.print("Masukkan tinggi: ");
            int t = in.nextInt();
            System.out.println("Luas Segitiga: " + LuasSegitiga(a, t));
            break;

        case 4:
            System.out.print("Masukkan jari-jari: ");
            int r = in.nextInt();
            System.out.println("Luas Lingkaran: " + LuasLingkaran(r));
            break;
    }

    in.nextLine();
    System.out.print("Apakah anda ingin mengulang? Ya/Tidak: ");
    ulang = in.nextLine();
    } while (!ulang.equalsIgnoreCase("Tidak"));


    }
    public static int LuasPersegi(int s) {
        Scanner in = new Scanner(System.in);
        return s*s;
    }
    public static int luaspersegi(int p, int l) {
        Scanner in = new Scanner(System.in);
        return p*l;
    }
    public static double LuasSegitiga(int a, int t) {
        Scanner in = new Scanner(System.in);
        return a*t*0.5;
        
    }
    public static double LuasLingkaran(int r) {
        Scanner in = new Scanner(System.in);
        return 3.14*r*r;
    }
}