package org.generation.italy.model;

public class Portatile extends Dispositivo{

	public Portatile (String nome, int ram) {
		super(nome, ram);		
	}


	@Override
	public void faiBackup() {
		System.out.println("Il backup è stato effettuato sul Cloud.");
	}

	@Override
	public String toString() {
		return "Fisso [nome=" + nome + ", memoria=" + ram + "]";
	}

}
