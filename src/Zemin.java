public class Zemin {
    private String aciklama;
    private double genislik;
    private double uzunluk;

    public Zemin(String aciklama) {
        this.aciklama = aciklama;
    }

    public Zemin(double genislik, double uzunluk) {
        this.genislik = genislik <= 0 ? 0 : genislik;
        this.uzunluk = uzunluk <= 0 ? 0 : uzunluk;


    }

    public double alanHesapla() {
        return genislik * uzunluk;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    @Override
    public String toString() {
        return this.aciklama + " + " + this.genislik + this.uzunluk;
    }
}