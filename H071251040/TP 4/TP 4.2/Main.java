import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Product> stok = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Data produk awal
        stok.add(new Smartphone("Samsung", 123456, 899.99, 6.5, 256));
        stok.add(new Laptop("Dell", 987654, 1299.99, 16, "Intel Core i7"));
        stok.add(new Camera("Canon", 456789, 699.99, 24, "Telephoto"));

        while (true) {
            tampilkanMenu();
            System.out.print(">>> Pilih menu (1-4):  ");
            int pilihan = sc.nextInt();
            sc.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    tambahProduk(sc);
                    break;
                case 2:
                    tampilkanSemuaProduk();
                    break;
                case 3:
                    beliProduk(sc);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                    sc.close();
                    return; // keluar dari program
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih 1-4.");
            }
        }
    }

    static void tampilkanMenu() {
        System.out.println("Menu:");
        System.out.println("1. Tambah Produk");
        System.out.println("2. Tampilkan Semua Produk");
        System.out.println("3. Beli Produk");
        System.out.println("4. Keluar");
        System.out.println();
    }

    // Menu 1
    static void tambahProduk(Scanner sc) {
        System.out.print("Masukkan nama produk: ");
        String brand = sc.nextLine();

        System.out.print("Masukkan nomor seri: ");
        int seriesNumber = sc.nextInt();

        System.out.print("Masukkan harga: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.println("Pilih tipe produk:");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Camera");
        System.out.print("Pilih tipe produk (1-3): ");
        int tipe = sc.nextInt();
        sc.nextLine();

        switch (tipe) {
            case 1:
                System.out.print("Masukkan ukuran layar (inci): ");
                double screenSize = sc.nextDouble();
                System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                int storage = sc.nextInt();
                sc.nextLine();
                stok.add(new Smartphone(brand, seriesNumber, price, screenSize, storage));
                break;
            case 2:
                System.out.print("Masukkan ukuran RAM (GB): ");
                int ram = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan tipe prosesor: ");
                String processor = sc.nextLine();
                stok.add(new Laptop(brand, seriesNumber, price, ram, processor));
                break;
            case 3:
                System.out.print("Masukkan resolusi (MP): ");
                int resolution = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan tipe lensa: ");
                String lensType = sc.nextLine();
                stok.add(new Camera(brand, seriesNumber, price, resolution, lensType));
                break;
            default:
                System.out.println("Tipe produk tidak valid!");
        }
    }

    // Menu 2 
    static void tampilkanSemuaProduk() {
        System.out.println("Daftar Produk:");
        for (Product p : stok) {
            p.displayInfo();
            System.out.println();
        }
    }

    // Menu 3 
    static void beliProduk(Scanner sc) {
        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
        int nomorSeri = sc.nextInt();
        sc.nextLine();

        boolean ditemukan = false;
        for (Product p : stok) {
            if (p.seriesNumber == nomorSeri) {
                System.out.println("Anda telah membeli produk:");
                p.displayInfo();
                stok.remove(p); // hapus dari stok setelah dibeli
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
        }
    }
}
