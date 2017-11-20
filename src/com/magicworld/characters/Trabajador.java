package com.magicworld.characters;

public class Trabajador extends Character{
	
	public Trabajador() {
		this.nombre = "Trabajador";
		this.vida = 8;
		this.ataque = 15;
		this.defensa = 15;
		this.magia = 40;
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
