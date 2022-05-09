public class LabAsistani extends Asistan {
    public LabAsistani(String adSoyad, String telefonNo, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefonNo, eposta, bolum, unvan, ofisSaati);
    }

    public void lablaraGir() {
        System.out.println(getAdSoyad() + " lab asistanı " + getOfisSaati() + " ofis saatlerinde laba giriş yapacak.");
    }

    public void derseGir() {
        System.out.println(getAdSoyad() + " lab asistanı " + getOfisSaati() + " ofis saatlerinde derse giriş yapacak.");
    }
}
