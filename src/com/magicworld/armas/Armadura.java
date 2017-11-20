package com.magicworld.armas;
import com.magicworld.characters.Character;

public class Armadura extends DecoradorDeArmas{
	Character character;
	
	

	public Armadura(Character character) {
		this.character = character;
	}

	@Override
	public String getNombre() {
		
		return this.character.getNombre()+", Armadura";
	}

	@Override 
	public int vida() {
		return this.character.vida()+20;
	}


	@Override
	public int ataque() {
		
		return this.character.ataque();
	}


	@Override
	public int defensa() {
	
		return this.character.defensa()+20;
	}


	@Override
	public int magia() {
		return this.character.magia();
	}

}
