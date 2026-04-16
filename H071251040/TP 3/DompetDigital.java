public class DompetDigital {
    private double saldo;
    private String pin;
    private double investasi = 0;
 
    protected String idNasabah;

    String namaNasabah;

    public DompetDigital(String idNasabah, String namaNasabah, String pinAwal) {
        this.idNasabah = idNasabah;
        this.namaNasabah = namaNasabah;
        this.pin = pinAwal;
        this.saldo = 0; 
        // this.investasi = 0;
        cetakStatus("Akun baru berhasil dibuat untuk ID: " + idNasabah);
    }

    public String getIdNasabah() { return idNasabah; }
    public String getNamaNasabah() { return namaNasabah; }
    public double getSaldo() { return saldo; }
    public double getInvest() {return investasi;}       

    public void setPin(String pinLama, String pinBaru) {
        if (!this.pin.equals(pinLama)) {
            cetakStatus("Gagal ubah PIN: PIN lama salah.");
            return;
        }
        
        if (pinBaru != null && pinBaru.length() == 6 && pinBaru.matches("\\d+")) { 
            this.pin = pinBaru;
            cetakStatus("PIN berhasil diperbarui.");
        } else {
            cetakStatus("Gagal ubah PIN: Harus 6 digit angka."); 
        }
    }
    

    public void setorTunai(long nominal) {
        if (nominal > 0) {
            this.saldo += nominal;
            cetakStatus("Setor tunai berhasil: +" + nominal);
        } else {
            cetakStatus("Gagal setor tunai: Nominal harus lebih dari 0."); 
        }
    }

    public void tarikTunai(double nominal, String inputPin) {
        if (!this.pin.equals(inputPin)) {
            cetakStatus("Gagal tarik tunai: PIN salah."); 
        } else if (nominal <= 0) {
            cetakStatus("Gagal tarik tunai: Nominal tidak valid.");
        } else if (nominal > saldo) {
            cetakStatus("Gagal tarik tunai: Saldo tidak mencukupi.");
        } else {
            this.saldo -= nominal;
            cetakStatus("Tarik tunai berhasil: -" + (int)nominal); 
        }
    }

    public void JumlahInvest(double jmlhInv, String inputPin) {
        if (!this.pin.equals(inputPin)) {
            cetakStatus("Gagal tambah invest: PIN salah."); 
        } else if (jmlhInv <= 0) {
            cetakStatus("Gagal tambah invest: Nominal tidak valid.");
        } else if (jmlhInv > saldo) {
            cetakStatus("Gagal tambah invest: Saldo tidak mencukupi.");
        } else {
            this.saldo -= jmlhInv;
            this.investasi += jmlhInv;
            cetakStatus("Tambah invest berhasil: " + (int)jmlhInv); 
        }
    }

    public void Keuntungan (){
        double bunga = 0.05 * investasi  ;
        this.investasi += bunga;
        System.out.println("Investasi bertambah: " + bunga);
    }

    // public void Total (){
    //     double uang = 
    // }

    private void cetakStatus(String pesan) {
        System.out.println("Status: " + pesan);
    }
}