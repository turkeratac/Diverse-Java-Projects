package geneltasiyici;

public class Tasiyici {
    protected int gozAdedi;
    protected int[] kapasite;
    protected boolean[] gozDurumu;
    protected int[] gozdekiMiktar;
    protected boolean[] gozAcik;

    public Tasiyici(int KacGoz, int Kapasite)
    {
        gozAdedi = KacGoz;
        kapasite = new int[KacGoz];
        for (int i = 0; i < KacGoz; i++) {
            kapasite[i] = Kapasite;
        }
        gozDurumu = new boolean[KacGoz];
        gozdekiMiktar = new int[KacGoz];
        gozAcik = new boolean[KacGoz];
    }

    public boolean EsyaYerlestir(int GozNo, int Adet)
    {
        if (GozNo < 0 || GozNo >= gozAdedi)
        {
            System.out.println("Geçersiz Göz Numarası Girdiniz.");
            return false;
        }

        if (gozAcik[GozNo] == false)
        {
            System.out.println("Göz " + GozNo + " kapalı. Lütfen açın.");
        }
        else
        {
            if (Adet > kapasite[GozNo] - gozdekiMiktar[GozNo])
            {
                System.out.println("Kapasite aşıldı, eşya eklenemedi. Max " + (kapasite[GozNo]-gozdekiMiktar[GozNo]) + " adet ekleniyor.");
                gozdekiMiktar[GozNo] += kapasite[GozNo]-gozdekiMiktar[GozNo];
                return false;
            }
            else
            {
                gozdekiMiktar[GozNo] += Adet;
                System.out.println("Göz " + GozNo + " içerisine "+ Adet +" adet eklendi.");
            }
        }
        return true;
    }

    public boolean EsyaAl(int GozNo, int Adet)
    {
        if (GozNo < 0 || GozNo >= gozAdedi)
        {
            System.out.println("Geçersiz Göz Numarası Girdiniz.");
            return false;
        }

        if (gozAcik[GozNo] == false)
        {
            System.out.println("Göz " + GozNo + " kapalı. Lütfen açın.");
        }
        else
        {
            if (Adet > gozdekiMiktar[GozNo])
            {
                System.out.println("Bu gözde " + Adet +" adet yok. Max " + gozdekiMiktar[GozNo] + " adet alınıyor.");
                gozdekiMiktar[GozNo] = 0;
                return false;
            }
            else
            {
                gozdekiMiktar[GozNo] -= Adet;
                System.out.println("Göz " + GozNo + " içerisinden "+ Adet +" adet alındı. "+ gozdekiMiktar[GozNo] +" adet kaldı.");
            }
            //gozAcik[GozNo] = true;
        }
        return true;
    }

    public boolean GozAc(int GozNo)
    {
        if (GozNo < 0 || GozNo >= gozAdedi)
        {
            System.out.println("Geçersiz Göz Numarası Girdiniz.");
            return false;
        }

        if (gozAcik[GozNo])
        {
            System.out.println("Göz " + GozNo + " durumu zaten açık.");
            return false;
        }

        gozAcik[GozNo] = true;
        System.out.println("Göz " + GozNo + " açıldı.");
        return true;
    }

    public boolean GozKapat(int GozNo)
    {
        if (GozNo < 0 || GozNo >= gozAdedi)
        {
            System.out.println("Geçersiz Göz Numarası Girdiniz.");
            return false;
        }

        if (!gozAcik[GozNo])
        {
            System.out.println("Göz " + GozNo + " durumu zaten kapalı.");
            return false;
        }

        gozAcik[GozNo] = false;
        System.out.println("Göz " + GozNo + " kapatıldı.");
        return true;
    }

    public String Rapor()
    {
        StringBuilder rapor = new StringBuilder();
        for (int i = 0; i < gozAdedi; i++)
        {
            rapor.append("Göz Numarası: ").append(i).append("\n");
            rapor.append("Göz Kapasitesi: ").append(kapasite[i]).append("\n");
            rapor.append("Göz Durumu: ").append(gozAcik[i] ? "Açık" : "Kapalı").append("\n");
            rapor.append("Gözdeki Miktar: ").append(gozdekiMiktar[i]).append("\n\n");
        }
        return rapor.toString();
    }

    public String Rapor(int GozNo)
    {
        if (GozNo < 0 || GozNo >= gozAdedi)
        {
            return "Geçersiz Göz Numarası";
        }

        StringBuilder rapor = new StringBuilder();
        rapor.append("Göz Numarası: ").append(GozNo).append("\n");
        rapor.append("Göz Kapasitesi: ").append(kapasite[GozNo]).append("\n");
        rapor.append("Göz Durumu: ").append(gozAcik[GozNo] ? "Açık" : "Kapalı").append("\n");
        rapor.append("Gözdeki Miktar: ").append(gozdekiMiktar[GozNo]).append("\n");

        return rapor.toString();
    }
}
