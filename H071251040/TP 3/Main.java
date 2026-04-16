public class Main {
    public static void main(String[] args) {

        DompetDigital dompetku = new DompetDigital("H071251040", "Bella", "123456");

        System.out.println("\nINFORMASI NASABAH:");
        System.out.println("ID Nasabah   : " + dompetku.getIdNasabah());
        System.out.println("Nama Nasabah : " + dompetku.getNamaNasabah());

        System.out.println("\n1. Ubah PIN (Salah)");
        dompetku.setPin("000000", "654321");

        System.out.println("\n2. Ubah PIN (Benar)");
        dompetku.setPin("123456", "654321");

        System.out.println("\n3. Setor Tunai");
        dompetku.setorTunai(50000);

        System.out.println("\n4. Setor Tunai (Input Negatif)");
        dompetku.setorTunai(-10000);

        System.out.println("\n5. Tarik Tunai (PIN Lama)");
        dompetku.tarikTunai(200000, "123456");

        System.out.println("\n6. Tarik Tunai (PIN Baru)");
        dompetku.tarikTunai(20000, "654321");

        System.out.println("SALDO AKHIR: Rp" + dompetku.getSaldo());


        System.out.println("Info Investasi:");
        System.out.println("\n1. Investasi gagal");
        dompetku.JumlahInvest(100000, "123457");

        System.out.println("\n2. Investasi berhasil");
        dompetku.JumlahInvest(10000, "654321");

        System.out.println("\n3. Total Keuntungan Investasi:");
        dompetku.Keuntungan();

        System.out.println("\nTotal Investasi Akhir: " + dompetku.getInvest());
        System.out.println("\nTotal Investasi Akhir: " + dompetku.getSaldo());
        


    }

    
}