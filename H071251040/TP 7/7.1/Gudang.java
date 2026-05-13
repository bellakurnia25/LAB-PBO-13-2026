public class Gudang{
    private int stok;
    private final int kapasitasMax;

    public Gudang(int kapasitasMax){
        this.stok = 0;
        this.kapasitasMax = kapasitasMax;
    }

    public synchronized void tambahStok(int jumlah) throws InterruptedException {
        while (stok + jumlah > kapasitasMax) {
            System.out.println("Gudang: Kapasitas Penuh. Pemasok menunggu...");
            wait();
            
        }
        stok += jumlah;
        System.out.println("Pemasok: Berhasil menambah " + jumlah + ". Stok: " + stok);
        notifyAll();
    }
    public synchronized void ambilStok(int jumlah) throws InterruptedException{
        while (stok < jumlah) {
            System.out.println("Gudang: Stok tidak cukup. Kurir menunggu...");
            wait();  
        }
        stok -= jumlah;
        System.out.println("Kurir: Mengambil " + jumlah + ". Sisa Stok: " + stok);
        notifyAll();
    }
    public synchronized int getStok() {
        return stok;
    }

    public int getKapasitasMax(){
        return kapasitasMax;
    }
}