public class BuahIblis {

    
    public String nama;
    public int damage;
    public TipeBuah tipe;

    public BuahIblis() {
        nama   = "Tidak Ada";
        damage = 0;
        tipe   = TipeBuah.PARAMECIA;
    }

    public BuahIblis(String nama, int damage, TipeBuah tipe) {
        this.nama   = nama;
        this.damage = damage;
        this.tipe   = tipe;
    }

    public void infoKekuatan() {
        System.out.println("Buah Iblis : " + nama);
        System.out.println("Tipe       : " + tipe);
        System.out.println("Damage     : " + damage);
    }
}