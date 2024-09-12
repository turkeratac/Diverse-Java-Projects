import Askerlerim.*;

public class Main
{
    public static void main(String[] args)
    {
        Askerler asker1 = new Albay("Albay", "Recep Doğan", "Rize");
        Askerler asker2 = new Yüzbaşı("Yüzbaşı", "Furkan Ateş", "Bursa");
        Askerler asker3 = new Teğmen("Teğmen", "Serkan Çetin", "İstanbul");
        Askerler asker4 = new Astsubay("Astsubay", "Ahmet Kaya", "Hakkari");
        Askerler general = new General("General", "", "");

        System.out.println(general.getAskerRutbesi() + "\n");
        System.out.println(asker1.tekmilVer());
        System.out.println(asker2.tekmilVer());
        System.out.println(asker3.tekmilVer());
        System.out.println(asker4.tekmilVer());

        System.out.println(general.emirVer());

        System.out.println(asker1.emirUygula());
        System.out.println(asker2.emirUygula());
        System.out.println(asker3.emirUygula());
        System.out.println(asker4.emirUygula());


    }
}