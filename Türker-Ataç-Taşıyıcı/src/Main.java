import geneltasiyici.*;

public class Main {
    public static void main(String[] args) {
        KalemKutusu kalemlik = new KalemKutusu(3, 10);
        Canta okulcanta = new Canta(3, 80);
        Bavul bavul = new Bavul(5, 50);

        System.out.println("Kalemlik");
        kalemlik.GozAc(0); // Gözü aç.
        kalemlik.GozAc(0); // Gözü aç.
        kalemlik.EsyaYerlestir(0, 7); // Birinci göze 7 kalem yerleştir.
        kalemlik.GozKapat(0); // Gözü kapat.
        kalemlik.GozKapat(0); // Gözün kapalı olup olmadığını kontrol.
        System.out.println("\n");

        System.out.println("Okul Çantası");
        okulcanta.EsyaYerlestir(1, 10); // Göze 10 adet yerleştir. (Kapalı ise uyarı alır.)
        okulcanta.GozAc(1); // Gözü aç.
        okulcanta.EsyaYerlestir(1, 100); // 100 adet yerleştir. (Sınırı aşarsa uyarı alır.)
        okulcanta.EsyaAl(1, 30); // 30 adet al. (Eksik ise uyarı alır.)
        okulcanta.GozAc(4); // Gözü aç. (Bu göz yoksa uyarı alır.)
        System.out.println("\n");

        System.out.println("Bavul");
        bavul.EsyaYerlestir(2, 3); // 3 adet yerleştir. (Kapalı ise uyarı alır.)
        bavul.GozAc(2); // Gözü aç.
        bavul.EsyaYerlestir(2, 20); // Yerleştir.
        bavul.EsyaAl(2, 25); // 25 adet al. (Eksik ise uyarı alır.)
        bavul.GozAc(4); // Gözü aç.
        bavul.EsyaYerlestir(4, 10); // Yerleştir.
        System.out.println("\n");

        // Kalem kutusu, çanta ve cüzdan raporları

        System.out.println("Kalemlikteki Kalem Sayısı:\n" + kalemlik.Rapor(0));
        System.out.println("Çanta Raporu:\n" + okulcanta.Rapor());
        System.out.println("Bavul Raporu:\n" + bavul.Rapor());
    }
}
