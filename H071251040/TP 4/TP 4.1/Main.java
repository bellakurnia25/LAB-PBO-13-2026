import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lanjut;

        do {
            System.out.println(" ");
            System.out.println("===== BANGUN RUANG =====");
            System.out.println("1. KUBUS");
            System.out.println("2. BALOK");
            System.out.println("3. BOLA");
            System.out.println("4. TABUNG");
            System.out.println("===== BANGUN DATAR =====");
            System.out.println("5. PERSEGI");
            System.out.println("6. PERSEGI PANJANG");
            System.out.println("7. LINGKARAN");
            System.out.println("8. TRAPESIUM");
            System.out.println("~~~~~~~~~");
            System.out.print("Pilihan: ");
            int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1: {
                System.out.println(">>>Kubus: ");
                System.out.print("Masukkan sisi kubus: ");
                double sisi = sc.nextDouble();
                Kubus k = new Kubus(sisi);
                System.out.println("Luas kubus: " + k.luas());
                System.out.println("Volume kubus: " + k.volume());
                break;
            }
            case 2: {
                System.out.println(">>>Balok: ");
                System.out.print("Masukkan panjang balok: ");
                double p = sc.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double l = sc.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double t = sc.nextDouble();
                Balok b = new Balok(p, l, t);
                System.out.println("Luas balok: " + b.luas());
                System.out.println("Volume balok: " + b.volume());
                break;
            }
            case 3: {
                System.out.println(">>>Bola: ");
                System.out.print("Masukkan jari-jari bola: ");
                double r = sc.nextDouble();
                Bola bo = new Bola(r);
                System.out.println("Luas bola: " + bo.luas());
                System.out.println("Volume bola: " + bo.volume());
                break;
            }
            case 4: {
                System.out.println(">>>Tabung: ");
                System.out.print("Masukkan jari-jari tabung: ");
                double r = sc.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double t = sc.nextDouble();
                Tabung tb = new Tabung(r, t);
                System.out.println("Luas tabung: " + tb.luas());
                System.out.println("Volume tabung: " + tb.volume());
                break;
            }
            case 5: {
                System.out.println(">>>Persegi: ");
                System.out.print("Masukkan sisi persegi: ");
                double sisi = sc.nextDouble();
                Persegi ps = new Persegi(sisi);
                System.out.println("Luas persegi: " + ps.luas());
                System.out.println("Keliling persegi: " + ps.keliling());
                break;
            }
            case 6: {
                System.out.println(">>>Persegi Panjang: ");
                System.out.print("Masukkan panjang persegi panjang: ");
                double p = sc.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double l = sc.nextDouble();
                PersegiPanjang pp = new PersegiPanjang(p, l);
                System.out.println("Luas persegi panjang: " + pp.luas());
                System.out.println("Keliling persegi panjang: " + pp.keliling());
                break;
            }
            case 7: {
                System.out.println(">>>Lingkaran: ");
                System.out.print("Masukkan jari-jari lingkaran: ");
                double r = sc.nextDouble();
                Lingkaran li = new Lingkaran(r);
                System.out.println("Luas lingkaran: " + li.luas());
                System.out.println("Keliling lingkaran: " + li.keliling());
                break;
            }
            case 8: {
                System.out.println(">>>Trapesium: ");
                System.out.print("Masukkan sisi 1 trapesium: ");
                double s1 = sc.nextDouble();
                System.out.print("Masukkan sisi 2 trapesium: ");
                double s2 = sc.nextDouble();
                System.out.print("Masukkan sisi 3 trapesium: ");
                double s3 = sc.nextDouble();
                System.out.print("Masukkan sisi 4 trapesium: ");
                double s4 = sc.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                double t = sc.nextDouble();
                Trapesium tr = new Trapesium(s1, s2, s3, s4, t);
                System.out.println("Luas trapesium: " + tr.luas());
                System.out.println("Keliling trapesium: " + tr.keliling());
                break;
            }
            default:
                System.out.println("Pilihan tidak valid!");
        }
        System.out.println("----------------------------------------");
            System.out.print("Apakah Anda ingin mengecek menu lain? (y/n): ");
            lanjut = sc.next();
            System.out.println();

        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("Pengecekkan telah selesai, Terima kasih!");

        sc.close();
        
    }
}
