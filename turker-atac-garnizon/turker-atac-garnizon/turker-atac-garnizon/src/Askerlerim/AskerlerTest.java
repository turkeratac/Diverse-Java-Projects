package Askerlerim;
import org.junit.Test;
import static org.junit.Assert.*;

public class AskerlerTest {
    Askerler asker1 = new Albay("Albay", "Recep Doğan", "Rize");
    Askerler asker2 = new Yüzbaşı("Yüzbaşı", "Furkan Ateş", "Bursa");
    Askerler asker3 = new Teğmen("Teğmen", "Serkan Çetin", "İstanbul");
    Askerler asker4 = new Astsubay("Astsubay", "Ahmet Kaya", "Hakkari");
    Askerler general = new General("General", "", "");

    @Test
    public void testTEKMIL()
    {
    assertEquals("Albay Recep Doğan Rize ,EMRET KOMUTANIM!\n",asker1.tekmilVer());
    assertEquals("Yüzbaşı Furkan Ateş Bursa ,EMRET KOMUTANIM!\n",asker2.tekmilVer());
    assertEquals("Teğmen Serkan Çetin İstanbul ,EMRET KOMUTANIM!\n",asker3.tekmilVer());
    assertEquals("Astsubay Ahmet Kaya Hakkari ,EMRET KOMUTANIM!\n",asker4.tekmilVer());
    }

    @Test
    public void testEMIRVER()
    {
        assertEquals("ASKERLER SIRAYA! HAZIR OL!\n",general.emirVer());
    }

    @Test
    public void testEMIRAL()
    {
        assertEquals("(Albay) ASKERLER SIRAYA! HAZIR OL!,EMREDERSİNİZ KOMUTANIM! \n","("+asker1.getAskerRutbesi()+")"+" "+asker1.emirUygula());
        assertEquals("(Yüzbaşı) ASKERLER SIRAYA! HAZIR OL!,EMREDERSİNİZ KOMUTANIM! \n","("+asker2.getAskerRutbesi()+")"+" "+asker2.emirUygula());
        assertEquals("(Teğmen) ASKERLER SIRAYA! HAZIR OL!,EMREDERSİNİZ KOMUTANIM! \n","("+asker3.getAskerRutbesi()+")"+" "+asker3.emirUygula());
        assertEquals("(Astsubay) ASKERLER SIRAYA! HAZIR OL!,EMREDERSİNİZ KOMUTANIM! \n","("+asker4.getAskerRutbesi()+")"+" "+asker4.emirUygula());

    }
}
