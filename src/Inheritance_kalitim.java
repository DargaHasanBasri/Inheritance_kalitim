public class Inheritance_kalitim {
    public static void main(String[] args) {

        Calisan c1 = new Calisan("Razumihin", "05554443322", "kisi_1@gmail.com");
        c1.yemekhane();
        System.out.println();

        Akademisyen a1 = new Akademisyen("Rodion Romanoviç Raskolnikov", "05112223344", "kisi_2@gmail.com", "CENG", "DOC.DR");
        a1.derseGir();
        System.out.println();

        Memur m1 = new Memur("Marmelavov", "0123456789", "info@gmail.com", "Bilgi İşlem", "09.00-18.00");
        m1.calis();
        System.out.println();

        OgretimGorevlisi o1 = new OgretimGorevlisi("Pulcheia Alexandrovna Raskolnikov", "097897667", "kisi_3@gmail.com", "CENG", "DOÇENT", "110");
        o1.giris();
        System.out.println();

        Asistan as1 = new Asistan("Dunya Raskolnikov", "05721538721", "as1@gmail.com", "CENG", "Asistan", "10.00-15.00");
        as1.quizYap();
        System.out.println();

        BilgiIslem b1 = new BilgiIslem("Sonya", "05127583871", "b1@gmail.com", "Bilgi İşlem", "09.00-17.00", "Network Kurulumu");
        b1.networkKurulum();
        System.out.println();

        LabAsistani labAs1 = new LabAsistani("Lizateva Ivanovna", "05267351273", "labAs1@gmail.com", "CENG", "Asistan", "08.00-18.00");
        labAs1.lablaraGir();
        System.out.println();

        GuvenlikGorevlisi g1 = new GuvenlikGorevlisi("Piyotr Petroviç", "056923723432", "g1@gmaik.com", "Bilgi İşlem", "20.00-08.00", "Nobet", "B1 düzeyi");
        g1.nobet();
        System.out.println();

        /*
        Calisan m1 = new Memur("Ali Veli", "0123456789", "info@gmail.com", "Bilgi İşlem", "09.00-18.00");
        m1.calis(); // ata sınıf alt sınıfın metotlarına erişemiyor  calis() hata
        */

    }
}
