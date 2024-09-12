package MortalKombatOdev;
import MortalKombatOdev.Silahlar.Yumruk;
import MortalKombatOdev.Silahlar.*;

import java.util.Random;

public class Player {
	private int healthPoint=10;
	private Silah mySilah = new Yumruk();
	
	
	
	public int getHealthPoint() {
		return healthPoint;
	}
	private void setHealthPoint(int healthPoint) {
		if(healthPoint>0)
		  this.healthPoint = healthPoint;
		else
			setAlive(false);
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getpAttack() {
		return pAttack;
	}

	public void setpAttack(double pAttack) {
		this.pAttack = pAttack;
	}

	public double getpDeffend() {
		return pDeffend;
	}

	public void setpDeffend(double pDeffend) {
		this.pDeffend = pDeffend;
	}



	public boolean isAlive() {
		return isAlive;
	}

	private void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}



	private int Score=0;
	private String name= " Ad atanmadı";
	private double pAttack=0.5;
	private double pDeffend=0.5;
	private boolean isAlive= true;
	
	public Player(String name) {
		this.name= name;	
		mySilah = new Yumruk();

	}
	
	
	public boolean Attack(Player p) {
		mySilah.Saldir();
		Random rnd= new Random();
		double deffendChance = rnd.nextDouble();
		
		if(pAttack<deffendChance) {
			
			return !p.Defend(this);
			
		}		
		
		setHealthPoint(getHealthPoint()-1);
		
		return false;
		
	}
	public boolean Defend(Player p) {
		Random rnd= new Random();
		double deffendChance = rnd.nextDouble();
		
		if(pDeffend<deffendChance){
			return true;
		}		

		setHealthPoint(getHealthPoint()-1);
	
  	return false;
			
	}
	
	public void setSilah(Silah s) {
		this.mySilah=s;
	}
	
}
