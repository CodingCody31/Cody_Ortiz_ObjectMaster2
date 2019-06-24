package com.objectmaster.two;

public class Wizard extends Human{
	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
	}
	
	public void heal(Human cure) {
		cure.setHealth(cure.getHealth() + this.getIntelligence());
		cure.displayHealth();
	}
	
	public void fireball(Human exploded) {
		exploded.setHealth(exploded.getHealth() - (this.getIntelligence()*3));
		exploded.displayHealth();
	}

}
