package org.generation.italy.model;

public abstract class Dispositivo {
		protected String nome;
		protected int ram;
		
		public String getNome() {
			return nome;
		}
		public int getMemoria() {
			return ram;
		}

		public Dispositivo(String nome, int ram) {
			super();
			this.nome = nome;
			this.ram = ram;
		}
		
		public void aggiorna() {
			System.out.println("Dispositivo aggiornato.");
		}
		
		@Override
		public String toString() {
			return "Dispositivo [nome=" + nome + ", memoria=" + ram + "]";
		}
		
		public abstract void faiBackup();
		
}
