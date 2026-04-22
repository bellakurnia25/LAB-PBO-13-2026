public class BangunDatar {
    public double luas() {
        return 0;
    }
    public double keliling(){
        return 0;
    };
}

//persegi
class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double luas() {
        return sisi * sisi;
    }

    public double keliling() {
        return 4 * sisi;
    }
}

//persegi panjang
class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar   = lebar;
    }

    public double luas() {
        return panjang * lebar;
    }

    public double keliling() {
        return 2 * (panjang + lebar);
    }
}

//lingkaran
class Lingkaran extends BangunDatar {
    double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double luas() {
        return 22/7 * jariJari * jariJari;
    }

    public double keliling() {
        return 2 * 22/7 * jariJari;
    }
}

//trapesium
class Trapesium extends BangunDatar {
    double sisi1, sisi2, sisi3, sisi4, tinggi;

    Trapesium(double sisi1, double sisi2, double sisi3, double sisi4, double tinggi) {
        this.sisi1  = sisi1;
        this.sisi2  = sisi2;
        this.sisi3  = sisi3;
        this.sisi4  = sisi4;
        this.tinggi = tinggi;
    }

    public double luas() {
        return 0.5 * (sisi1 + sisi2) * tinggi;
    }

    public double keliling() {
        return sisi1 + sisi2 + sisi3 + sisi4;
    }
}




