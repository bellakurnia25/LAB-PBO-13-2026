import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class DataProcessor implements Runnable {
    protected String fileName;
    protected ConcurrentHashMap<String, Integer> results; 
    protected CountDownLatch latch; 
    protected Random random = new Random();

    public DataProcessor(String fileName, ConcurrentHashMap<String, Integer> results, CountDownLatch latch) {
        this.fileName = fileName;
        this.results = results;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            int duration = 500 + random.nextInt(1501);
            Thread.sleep(duration);
            
            int wordCount = 100 + random.nextInt(401); 
            
            results.put(fileName, wordCount);
            
            System.out.println("[" + Thread.currentThread().getName() + "] Selesai memproses " + fileName + " (" + wordCount + " kata).");
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Mengurangi hitungan latch agar program utama tahu satu dokumen selesai [cite: 40]
            latch.countDown();
        }
    }
}