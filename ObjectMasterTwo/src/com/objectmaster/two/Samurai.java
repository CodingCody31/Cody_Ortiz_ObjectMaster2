package com.objectmaster.two;

public class Samurai extends Human{
	private int num =1;
	
	public Samurai() {
		this.setHealth(200);
		num++;
	}
	
	public void deathBlow(Human killed) {
		killed.setHealth((killed.getHealth()*0));
		this.setHealth(this.getHealth()/2);
		System.out.println("The killed person now has a health of:");
		killed.displayHealth();
		System.out.println("The samurai's health is now:");
		this.displayHealth();
	}
	
	public void meditate() {
		this.setHealth(this.getHealth()+(this.getHealth()/2));
		System.out.println("The samurai's health is now:");
		this.displayHealth();
	}
	
	public int howMany() {
		System.out.println("There are "+ num + " samurai");
		return num;
	}

}
