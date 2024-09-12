package MortalKombatOdev;

import MortalKombatOdev.Silahlar.AK47;
import MortalKombatOdev.Silahlar.Kilic;
import MortalKombatOdev.Silahlar.Yumruk;
import MortalKombatOdev.Silahlar.*;

public class Arena {

	public static void main(String[] args)
	{
		Player p1= new Player("Scorpio");
		Player p2 = new Player("subZero");
		int i=0;
				
		while(p1.isAlive()&&p2.isAlive())
		{
			System.out.println(p1.getName()+"Saldırıyor");
			if(p1.Attack(p2) )
				System.out.println(p1.getName()+"Saldırı BAŞARILI");
			else 
				System.out.println(p1.getName()+" Saldırı BAŞARILSIZ");
			
			System.out.println(p2.getName()+"Saldırıyor");
			
			if(p2.Attack(p1) )
				System.out.println(p2.getName()+"Saldırı BAŞARILI");
			else 
				System.out.println(p2.getName()+" Saldırı BAŞARILSIZ");
			i++;
			Silah s;
				switch(i%3){
					case 0:
						s= new Kilic();
							break;
					case 1:
						s= new AK47();
							break;
					case 2:
						s= new RoketAtar();
							break;
					default: s= new Yumruk(); break;
					
				}
				
				
				p1.setSilah(s);
				p2.setSilah(s);

		}

	}

}
