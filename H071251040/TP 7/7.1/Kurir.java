import java.util.Random;

public class Kurir implements Runnable {
    private final Gudang gudang;
    private final Random random = new Random();

    public Kurir(Gudang gudang){
        this.gudang = gudang;
    }
    @Override
    public void run(){
        try{
            while(!Thread.currentThread().isInterrupted()){
                gudang.ambilStok(random.nextInt(2) + 1);
                Thread.sleep(2000 + random.nextInt(1000));
            }
        }catch (InterruptedException e){

        }
    }
}
