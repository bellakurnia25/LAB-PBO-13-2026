abstract class BarangPerpus {
    protected String judul;
    protected int ID;
    protected boolean pinjaman;


    public BarangPerpus(String judul, int ID) {
        this.judul = judul;
        this.ID = ID;
        this.pinjaman = false;
    }

 
    abstract String getDescription();
    abstract String pinjamBarang(int Days);
    abstract double tenggatWaktu(int DaysLate);


    public String BarangKembali(){
        this.pinjaman = false;
        return judul + " dikembalikan.";
    }

    public String BarangDipinjam(){
        this.pinjaman = true;
        return judul + "dipinjam.";
    }
}