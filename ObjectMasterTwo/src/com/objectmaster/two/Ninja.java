package com.objectmaster.two;

public class Ninja extends Human{
	
	public Ninja() {
		this.setStealth(10);
	}
	
	public void steal(Human absorb) {
		absorb.setHealth(absorb.getHealth()- this.getStealth());
		absorb.displayHealth();
	}
	
	public void runAway() {
		this.setHealth(this.getHealth()-10);
		this.displayHealth();
	}

}
