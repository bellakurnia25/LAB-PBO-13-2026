import java.util.Random;

public class Pemasok implements Runnable{
    private final Gudang gudang;
    private final Random random = new Random();

    public Pemasok(Gudang gudang){
        this.gudang = gudang;

    }
    @Override
    public void run(){
        try{
            while(!Thread.currentThread().isInterrupted()){
                gudang.tambahStok(random.nextInt(3) + 1);
                Thread.sleep(100 + random.nextInt(1000));
            }
        }catch (InterruptedException e){
            
        }
    }
}