package com.abubalr.learn_spring_framework;

public class gaming_basic {

	public static void main(String[] args) {
		var marioGame=new MarioGame();
		var supaContraGame= new SupaContraGame();
		var pacMangame= new PacManGame();
		
		var gameRunner=new GameRunner(pacMangame);
		gameRunner.run();

	}

}
