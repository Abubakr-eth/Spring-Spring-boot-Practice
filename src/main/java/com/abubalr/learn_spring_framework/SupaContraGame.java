package com.abubalr.learn_spring_framework;

public class SupaContraGame implements GamingConsole {
	
	@Override
	public void up() {
		System.out.println("move up");
	}
	@Override
	public void down() {
		System.out.println("move down");
	}
	@Override
	public void left() {
		System.out.println("backward");
	}
	@Override
	public void right() {
		System.out.println("accelarate");
	}
}
