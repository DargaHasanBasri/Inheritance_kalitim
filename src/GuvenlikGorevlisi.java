public class GuvenlikGorevlisi extends BilgiIslem {
    private String belge;

    public GuvenlikGorevlisi(String adSoyad, String telefonNo, String eposta, String departman, String mesai, String gorev, String belge) {
        super(adSoyad, telefonNo, eposta, departman, mesai, gorev);
        this.belge = belge;
    }

    public String getBelge() {
        return this.belge;
    }
    public void setBelge(String belge) {
        this.belge = belge;
    }

    public void nobet() {
        System.out.println(getAdSoyad() + " görevlisi " + getBelge() + " belgesi ile " + getMesai() + " saatleri arasında nobet tutacaktır.");
    }
}
