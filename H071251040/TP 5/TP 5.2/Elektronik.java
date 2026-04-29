abstract class PerangkatElektronik {
    protected String merk;
    protected double dayaListrik;

    public PerangkatElektronik(String merk, double dayaListrik) {
        this.merk = merk;
        this.dayaListrik = dayaListrik;
    }

    public abstract void cekFungsi();

    public void infoPower() {
        System.out.println(merk + " sedang menyedot daya sebesar " + dayaListrik + " Watt.");
    }
}

//Interface InteraksiInternet
interface InteraksiInternet {
    void hubungkanWiFi();
}

//Interface KontrolSuara
interface KontrolSuara {
    void prosesPerintah(String perintah);
}

// Implementasi Objek
class SmartLamp extends PerangkatElektronik implements KontrolSuara {
    public SmartLamp(String merk, double dayaListrik) {
        super(merk, dayaListrik);
    }

    
    public void cekFungsi() { System.out.println("Fungsi: Pencahayaan Pintar."); }

    public void prosesPerintah(String perintah) {
        if (perintah.equalsIgnoreCase("NYALA")) {
            System.out.println("Lampu berpijar!");
        }
    }
}

class SmartCCTV extends PerangkatElektronik implements InteraksiInternet {
    public SmartCCTV(String merk, double dayaListrik) {
        super(merk, dayaListrik);
    }

    public void cekFungsi() { System.out.println("Fungsi: Keamanan Real-time."); }

    public void hubungkanWiFi() {
        System.out.println("Mengirim data ke server...");
    }
}

class SmartSpeaker extends PerangkatElektronik implements InteraksiInternet, KontrolSuara {
    public SmartSpeaker(String merk, double dayaListrik) {
        super(merk, dayaListrik);
    }

    public void cekFungsi() { System.out.println("Fungsi: Speaker & Asisten Suara."); }

    public void hubungkanWiFi() { System.out.println("Speaker terhubung ke internet."); }

    public void prosesPerintah(String perintah) {
        System.out.println("Merespon perintah suara: " + perintah);
    }
}
