public class OgretimGorevlisi extends Akademisyen {
    private String kapiNo;

    public OgretimGorevlisi(String adSoyad, String telefonNo, String eposta, String bolum, String unvan, String kapiNo) {
        super(adSoyad, telefonNo, eposta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return this.kapiNo;
    }
    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }
}
