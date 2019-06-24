package com.objectmaster.two;

public class Human {
	private int health = 100;
	private int strength = 3;
	private int intelligence = 3;
	private int stealth = 3;

	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public Human() {
	}
	
	public Human attack(Human attacked) {
		attacked.health -= this.strength;
		return this;
	}
	public int displayHealth() {
		System.out.println(this.health);
		return health;
	}

}
