import java.util.concurrent.*;


public class Main {
    
    public static void main(String[] args) {
        Gudang gudang = new Gudang(10);
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 2; i++){
            executor.execute(new Pemasok(gudang));
        }
        for (int i = 0; i < 3; i++){
            executor.execute(new Kurir(gudang));
        }
        Thread monitorThread = new Thread(new Monitoring(gudang));
        monitorThread.start();

        try{
            Thread.sleep(15000);
            executor.shutdownNow();
            monitorThread.interrupt();
            if(executor.awaitTermination(5, TimeUnit.SECONDS)){
                System.out.println("\nSistem berhasil dihentikan dengan aman.");
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
