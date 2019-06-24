package com.objectmaster.two;

public class HumanTest {
	public static void main(String[] args) {
		
		Ninja ninja = new Ninja();
		Wizard wizard = new Wizard();
		Samurai samurai = new Samurai();
		
		ninja.attack(wizard);
		wizard.displayHealth();
		samurai.howMany();
		System.out.println(wizard.getHealth());
		samurai.attack(ninja);
		System.out.println(ninja.getHealth());
		samurai.deathBlow(ninja);
		samurai.meditate();
		wizard.heal(ninja);
		wizard.fireball(samurai);
	}
}
