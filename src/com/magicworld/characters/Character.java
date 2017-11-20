package com.magicworld.characters;

public abstract class Character {
	String nombre = "Personaje ";
	protected int vida;
	protected int ataque; 
	protected int defensa; 
	protected int magia; 
					

	public String getNombre() {
		return nombre;
	}

	  public abstract int vida();
	  public abstract int ataque ();
	  public abstract int defensa();
	  public abstract int magia();
	
}
