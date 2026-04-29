abstract class Karyawan {
    private String nama;
    private String idKrywn;
    protected int kehadiran;

    public Karyawan(String nama, String idKrywn){
        this.nama = nama;
        this.idKrywn = idKrywn;
        this.kehadiran = 0;
    }

    public void absen(){
        this.kehadiran++;
    }

    public abstract double hitungGaji();

    public String getNama(){
        return nama;
    }
    public String getIdKrywn() {
        return idKrywn;
    }
}

class KaryawanT extends Karyawan{
    private double gajiP;
    private double tunjanganM;

    public KaryawanT(String nama, String idKrywn, double gajiP, double tunjanganM){
        super(nama, idKrywn);
        this.tunjanganM = tunjanganM;
        this.gajiP = gajiP;
    }
    public double hitungGaji(){
        return gajiP + (tunjanganM *kehadiran);
    }
    public double hitungGaji(double bonusJago){
        return hitungGaji() + bonusJago;
    }

}

class KaryawanK extends Karyawan{
    private double gajiH;

    public KaryawanK(String nama, String idKrywn, double gajiH){
        super(nama, idKrywn);
        this.gajiH = gajiH;
    }
    public double hitungGaji(){
        double total = gajiH * kehadiran;
        if (kehadiran > 20){
            total += 500000;
        }
        return total;
    }
  
}
