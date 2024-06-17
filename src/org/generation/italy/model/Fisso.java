package org.generation.italy.model;

public class Fisso extends Dispositivo {

	
	public Fisso(String nome, int ram) {
		super(nome, ram);		
	}


	@Override
	public void faiBackup() {
		System.out.println("Il backup è stato effettuato sull'Hardisk.");
	}

	@Override
	public String toString() {
		return "Fisso [nome=" + nome + ", memoria=" + ram + "]";
	}


}
