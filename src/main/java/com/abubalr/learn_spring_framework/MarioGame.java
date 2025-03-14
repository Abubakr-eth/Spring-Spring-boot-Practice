package com.abubalr.learn_spring_framework;

public class MarioGame implements GamingConsole {
	public void up() {
		System.out.println("move up");
	}
	@Override
	public void down() {
		System.out.println("move down");
	}
	@Override
	public void left() {
		System.out.println("move left");
	}
	@Override
	public void right() {
		System.out.println("move right");
	}
}
