public class Akademisyen extends Calisan {
    // kalitim aldığı atanin yapıcısını yazmak zorunda constract ını almak zorunda
    // bu işlemi super metodu ile yapmış oluyoruz

    private String bolum;
    private String unvan;

    public Akademisyen(String adSoyad, String telefonNo, String eposta, String bolum, String unvan) {
        super(adSoyad, telefonNo, eposta);   // super() her zaman ilk baştaki kod satırında olmalı
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return this.bolum;
    }
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return this.unvan;
    }
    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void derseGir() {
        System.out.println(this.getAdSoyad() + " derse giriş yaptı.");
    }
}
