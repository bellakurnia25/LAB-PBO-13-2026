import java.sql.BatchUpdateException;

public class Main {
    public static void main(String[] args) {

        BuahIblis gomuGomu = new BuahIblis("Gomu Gomu no Mi", 45, TipeBuah.PARAMECIA);
        BuahIblis hiehie   = new BuahIblis("Hie Hie no Mi", 35, TipeBuah.LOGIA);
        BuahIblis buah = new BuahIblis();

     
        BajakLaut luffy  = new BajakLaut("Monkey D. Luffy", 250, 3000000L, gomuGomu);
        BajakLaut aokiji = new BajakLaut("Aokiji", 200, 1500000L, hiehie);
        BajakLaut bajak = new BajakLaut();


        luffy.cekStatus();
        aokiji.cekStatus();


        
        luffy.duel(aokiji);
    }
}