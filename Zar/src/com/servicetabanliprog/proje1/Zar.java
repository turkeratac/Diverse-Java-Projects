package com.servicetabanliprog.proje1;
import java.util.Random;

public class Zar {

 public int zarYuzAdedi;
 public int sonZar;
 
 
 
 public Zar(int zya) {
	 this.zarYuzAdedi=zya;
	 	 
 }
 
 public int ZarAt() {
	 Random rnd= new Random();
	 
	 this.sonZar = rnd.nextInt(this.zarYuzAdedi)+1;
	 
	 
	 return this.sonZar;
 }
 
}
