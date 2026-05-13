public class Monitoring implements Runnable {
    private final Gudang gudang;

    public Monitoring(Gudang gudang) { 
        this.gudang = gudang; 
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                int stok = gudang.getStok();
                int kapasitas = gudang.getKapasitasMax();
                int persen = (stok * 100) / kapasitas;
                
                String bar = "#".repeat(stok) + "-".repeat(kapasitas - stok);
                System.out.println("Status Gudang: [" + bar + "] " + persen + "%");
                
                Thread.sleep(1000);
            } 
        }catch (InterruptedException e){ 

        }
    }
}