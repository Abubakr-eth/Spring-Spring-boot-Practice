package com.abubalr.learn_spring_framework;

public class GameRunner {
	GamingConsole g1;
	GameRunner(GamingConsole g1){
		this.g1=g1;
	}
	public void run() {
		System.out.println("running game "+ g1);
		g1.up();
		g1.down();
		g1.left();
		g1.right();
		
		
	}
}
