public class BangunRuang {
    public double luas(){
        return 0;
    };
    public double volume(){
        return 0;
    };
}

//kubus
class Kubus extends BangunRuang {
    double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    
    public double luas() {
        return 6 * sisi * sisi;
    }

    public double volume() {
        return sisi * sisi * sisi;
    }
}

//balok
class Balok extends BangunRuang {
    double panjang, lebar, tinggi;

    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar   = lebar;
        this.tinggi  = tinggi;
    }

    public double luas() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    public double volume() {
        return panjang * lebar * tinggi;
    }
}

//tabung
class Tabung extends BangunRuang {
    double jariJari, tinggi;

    Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi   = tinggi;
    }

    public double luas() {
        return 2 * (22/7) * jariJari * (jariJari + tinggi);
    }

    public double volume() {
        return (22/7) * jariJari * jariJari * tinggi;
    }
}

//bola
class Bola extends BangunRuang {
    double jariJari;

    Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double luas() {
        return 4 * (22/7) * jariJari * jariJari;
    }

    public double volume() {
        return (4.0 / 3) * (22/7) * jariJari * jariJari * jariJari;
    }
}