public class Asistan extends Akademisyen {
    private String ofisSaati;

    public Asistan(String adSoyad, String telefonNo, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefonNo, eposta, bolum, unvan);
        this.ofisSaati = ofisSaati;
    }

    public String getOfisSaati() {
        return this.ofisSaati;
    }
    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }

    public void quizYap() {
        System.out.println(getAdSoyad() + " " + getOfisSaati() + " saatinde quiz yapacak.");
    }
}
