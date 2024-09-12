package Askerlerim;

public class Askerler
{

    private String askerRutbesi;
    private String askerAdSoyadi;
    private String askerMemleketi;

    public String getAskerRutbesi() {
        return askerRutbesi;
    }

    public String getAdSoyad() {
        return askerAdSoyadi;
    }

    public String getMemleket() {
        return askerMemleketi;
    }
    public Askerler(String askerRutbe, String askerAdSoyad, String askerMemleket)
    {
        askerRutbesi = askerRutbe;
        askerAdSoyadi = askerAdSoyad;
        askerMemleketi = askerMemleket;

    }

    public String tekmilVer()
    {
        StringBuilder tekmil = new StringBuilder();
        tekmil.append(askerRutbesi).append(" ");
        tekmil.append(askerAdSoyadi).append(" ");
        tekmil.append(askerMemleketi).append(" ,EMRET KOMUTANIM!\n");
        return tekmil.toString();
    }

    public String emirVer()
    {
        if(askerRutbesi=="General")
        {
            StringBuilder emir = new StringBuilder();
            emir.append("ASKERLER SIRAYA! HAZIR OL!\n");
            return emir.toString();
        }
        else
        {
            return "";
        }
    }

    public String emirUygula()
    {
        return "ASKERLER SIRAYA! HAZIR OL!,EMREDERSİNİZ KOMUTANIM! \n";
    }
}
