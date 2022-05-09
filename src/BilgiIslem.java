public class BilgiIslem extends Memur {
    private String gorev;

    public BilgiIslem(String adSoyad, String telefonNo, String eposta, String departman, String mesai, String gorev) {
        super(adSoyad, telefonNo, eposta, departman, mesai);
        this.gorev = gorev;
    }

    public String getGorev() {
        return this.gorev;
    }
    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void networkKurulum() {
        System.out.println(getAdSoyad() + " " + getMesai() + " mesai saatlerinde kurulum görevine başlayacak.");
    }
}
