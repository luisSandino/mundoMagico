package com.magicworld.armas;

import com.magicworld.characters.Character;

public class Escudo extends DecoradorDeArmas{

	Character character;

	public Escudo(Character character) {
		this.character = character;
	}

	@Override
	public String getNombre() {

		return this.character.getNombre() + ", Escudo";
	}

	@Override
	public int vida() {
		return this.character.vida() + 10;
	}

	@Override
	public int ataque() {

		return this.character.ataque();
	}

	@Override
	public int defensa() {

		return this.character.defensa() + 40;
	}

	@Override
	public int magia() {
		return this.character.magia();
	}

}
