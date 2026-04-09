public class BajakLaut {

    public String nama;
    public int hp;
    public long bounty;
    public BuahIblis buahIblis;

    public BajakLaut() {
        nama      = "Tidak Diketahui";
        hp        = 100;
        bounty    = 0;
        buahIblis = new BuahIblis();
    }

    public BajakLaut(String nama, int hp, long bounty, BuahIblis buahIblis) {
        this.nama      = nama;
        this.hp        = hp;
        this.bounty    = bounty;
        this.buahIblis = buahIblis;
    }

    public void duel(BajakLaut musuh) {
        System.out.println("\n== DUEL: " + nama + " vs " + musuh.nama + " ==");
        musuh.hp -= buahIblis.damage;
        System.out.println(nama + " menyerang dengan " + buahIblis.nama + "!");
        System.out.println(musuh.nama + " sisa HP: " + musuh.hp);
        if (musuh.hp <= 0) {
            System.out.println(musuh.nama + " kalah!");
        }
    }

  public void cekStatus() {
        System.out.println("\n== STATUS: " + nama + " ==");
        System.out.println("HP     : " + hp);
        System.out.println("Bounty : " + bounty + " Berry");
        buahIblis.infoKekuatan();
    }
}