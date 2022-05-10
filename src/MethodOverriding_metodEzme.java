public class MethodOverriding_metodEzme {
    public static void main(String[] args) {
        Calisan clsn = new Calisan("Mustafa Çetindağ", "057687233832", "calisan@gmail.com");

        Akademisyen akd = new Akademisyen("Patika Dev", "05468329233", "akademisyen@gmail.com", "CENG", "Doçent");

        Memur memur1 = new Memur("Ali Veli", "05643723223", "memur@gmail.com", "CENG", "09.00-18.00");

        OgretimGorevlisi ogrtGrv = new OgretimGorevlisi("Mahmut Çetindağ", "0573274382", "mahmut@gmail.com", "CENG", "Prof", "123");

        //overriding yaptığımız giris() içerisindeki geldi (overriding i Akademisyen de yaptık fakat
        // OgretimGorevlisi extends Akademisyen olduğu için oradaki giris() çağrıldı bu şekilde ata class da bulunan giris() ezmiş olduk overriding ettik)
        ogrtGrv.giris();
        // bu durumu direkt özel olarak istediğimiz class da ataya bağımlı kalmaması içinde yapabiliriz
        // burda önemli olan methotların tamamen aynı isimde ve parametre varsa parametrelere sahip olmalıdır olmasıdır
    }
}
