import java.util.concurrent.*;
import java.util.*;

public class SearchEngineApp {
    public static void main(String[] args) {
        String[] daftarDokumen = {
            "Dokumen_A.txt", "Dokumen_B.txt", "Dokumen_C.txt", "Dokumen_D.txt", "Dokumen_E.txt",
            "Dokumen_F.txt", "Dokumen_G.txt", "Dokumen_H.txt", "Dokumen_I.txt", "Dokumen_J.txt"
        };

        ExecutorService executor = Executors.newFixedThreadPool(4);
        
        ConcurrentHashMap<String, Integer> results = new ConcurrentHashMap<>();
        
        CountDownLatch latch = new CountDownLatch(daftarDokumen.length);

        System.out.println("--- Memulai Indexing Data ---\n");

        for (String doc : daftarDokumen) {
            executor.execute(new DataProcessor(doc, results, latch));
        }

        try {
            latch.await(); 
            executor.shutdown();

            System.out.println("\n--- Klasemen Hasil Indexing ---");
            System.out.printf("%-20s | %-12s\n", "Nama Dokumen", "Jumlah Kata");
            System.out.println("------------------------------------------");

            int totalKata = 0;
            for (Map.Entry<String, Integer> entry : results.entrySet()) {
                System.out.printf("%-20s | %-12d\n", entry.getKey(), entry.getValue());
                totalKata += entry.getValue();
            }

            System.out.println("------------------------------------------");
            System.out.println("Total Kata Keseluruhan : " + totalKata);
            System.out.println("Rata-rata Kata         : " + (totalKata / daftarDokumen.length));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}