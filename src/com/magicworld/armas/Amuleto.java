package com.magicworld.armas;
import com.magicworld.characters.Character;

public class Amuleto extends DecoradorDeArmas{
	Character character;
	
	

	public Amuleto(Character character) {
		this.character = character;
	}


	@Override
	public String getNombre() {
		return this.character.getNombre() +", Amuleto";
	}
	
	@Override 
	public int vida() {
		return this.character.vida();
	}


	@Override
	public int ataque() {
		
		return this.character.ataque();
	}


	@Override
	public int defensa() {
	
		return this.character.defensa();
	}


	@Override
	public int magia() {
		return this.character.magia()+10;
	}

}
