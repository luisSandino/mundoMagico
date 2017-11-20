package com.magicworld.armas;

import com.magicworld.characters.Character;

public class Espada extends DecoradorDeArmas {

	Character character;

	public Espada(Character character) {
		this.character = character;
	}

	@Override
	public String getNombre() {

		return this.character.getNombre() + ", Espada";
	}

	@Override
	public int vida() {
		return this.character.vida() + 1;
	}

	@Override
	public int ataque() {

		return this.character.ataque() + 10;
	}

	@Override
	public int defensa() {

		return this.character.defensa() + 10;
	}

	@Override
	public int magia() {
		return this.character.magia();
	}

}
