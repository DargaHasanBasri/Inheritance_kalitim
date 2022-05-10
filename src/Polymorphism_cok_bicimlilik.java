public class Polymorphism_cok_bicimlilik {
    public static void main(String[] args) {
        Calisan clsn2 = new Calisan("Mustafa Çetindağ", "057687233832", "calisan@gmail.com");

        Akademisyen akd2 = new Akademisyen("Patika Dev", "05468329233", "akademisyen@gmail.com", "CENG", "Doçent");

        Memur memur2 = new Memur("Ali Veli", "05643723223", "memur@gmail.com", "CENG", "09.00-18.00");

        OgretimGorevlisi ogrtGrv2 = new OgretimGorevlisi("Mahmut Çetindağ", "0573274382", "mahmut@gmail.com", "CENG", "Prof", "123");

        /*
        polimorfizm çok biçimlilik kullanarak aşağıdaki nesnelerin hepsini bir metot içerisine atıp
        giris metotlarını yazdırmak istediğimizi düşünelim  -1-

        ogrtGrv2.giris();
        akd2.giris();
        memur2.giris();
        clsn2.giris();

        Calisan a5 = new Akademisyen("Ahmet Sönmez", "053752874238", "sonmez@gmail.com", "CENG", "Doçent");
        a5.giris(); // çağırabiliyoruz overriding edilmiş durumda

        // referans class farklı olunca ortaya çıkabilecek hata aşağıda
        //a5.getBolum(); // çağıramıyoruz çünkü Akademisyene ait bir metot ve Calisana ait  referansımız Calisan
        */

        // -1- ile belirtilen yer aşağıda yapılmıştır Calisan classında belirlitmiştir
        // int[] girisYapanlar = new int[5];  veri tipleri classlarda olabilir
        Calisan[] girisYapanlar = {clsn2,akd2,memur2,ogrtGrv2};
        Calisan.girisYapanlar(girisYapanlar);


    }
}
