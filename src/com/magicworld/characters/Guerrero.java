package com.magicworld.characters;

public class Guerrero extends Character{
	
	public Guerrero() {
		this.nombre = "Guerrero";
		this.vida = 20;
		this.ataque = 30;
		this.defensa = 30;
		this.magia = 20;
	}

	@Override
	public int vida() {
		return this.vida;
	}

	@Override
	public int ataque() {
		return this.ataque;
	}

	@Override
	public int defensa() {
		return this.defensa;
	}

	@Override
	public int magia() {

		return this.magia;
	}

}
