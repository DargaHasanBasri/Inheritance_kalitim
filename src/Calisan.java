public class Calisan {
    private String adSoyad;
    private String telefonNo;
    private String eposta;

    public Calisan(String adSoyad, String telefonNo, String eposta) {
        this.adSoyad = adSoyad;
        this.telefonNo = telefonNo;
        this.eposta = eposta;
    }

    public String getAdSoyad() {
        return this.adSoyad;
    }
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefonNo() {
        return this.telefonNo;
    }
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getEposta() {
        return this.eposta;
    }
    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public void giris() {
        System.out.println(this.adSoyad + " üniversiteye giriş yaptı.");
    }

    public void cikis() {
        System.out.println(this.adSoyad + " üniversiteden çıkış yaptı.");
    }

    public void yemekhane() {
        System.out.println(this.adSoyad + " yemekhaneye girdi.");
    }

    //polimorfizm
    // -1- ile işaretli yer aşağı da gerçekleştirilmiştir
    public static void girisYapanlar(Calisan[] girisYapanlar) {
        for (Calisan c : girisYapanlar) {
            c.giris();
        }
    }
}
