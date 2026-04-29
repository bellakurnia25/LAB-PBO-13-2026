public class MainGaji {
    public static void main(String[] args) {
        KaryawanT tetap = new KaryawanT("Bella", "H001", 4000000, 50000);
        tetap.absen();
        tetap.absen();
        tetap.absen();
        System.out.println("---Data Gaji Karyawan---");
        System.out.println("ID Karyawan: " + tetap.getIdKrywn());
        System.out.println("Nama Karyawan: " + tetap.getNama());
        System.out.println("Gaji tetap + Bonus = Rp" + tetap.hitungGaji(1000000));

        KaryawanK kontrak = new KaryawanK("Manik", "A006", 200000);
        for (int i =0; i < 21; i++){
            kontrak.absen();
        }
        System.out.println("____________________________________");
        System.out.println("ID Karyawan: " + kontrak.getIdKrywn());
        System.out.println("Nama Karyawan: " + kontrak.getNama());
        System.out.println("Gaji kontrak (21 hari) = Rp" + kontrak.hitungGaji());
    }
    
}
