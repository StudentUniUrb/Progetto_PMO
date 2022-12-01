package venditatelefoni.implementazione;

import venditatelefoni.modello.Smartphone;

public class SmartphoneImpl implements Smartphone {
	
	private String nome;
	private int memoria;
	private String cpu;
	private double display;
	private int fotocamera;
	
	public SmartphoneImpl(String nome, int memoria, String cpu, double display, int fotocamera) {
		this.nome = nome;
		this.memoria = memoria;
		this.cpu = cpu;
		this.display = display;
		this.fotocamera = fotocamera;
	}

	public String getNome() {
		return nome;
	}

	public int getMemoria() {
		return memoria;
	}

	public String getCpu() {
		return cpu;
	}

	public double getDisplay() {
		return display;
	}

	public int getFotocamera() {
		return fotocamera;
	}

	@Override
	public String toString() {
		return "SmartphoneImpl [nome=" + nome + ", memoria=" + memoria + ", cpu=" + cpu + ", display=" + display
				+ ", fotocamera=" + fotocamera + "]";
	}
	
	public String nomeTelefono() {
		return nome + memoria + cpu + display + fotocamera;
	}


}