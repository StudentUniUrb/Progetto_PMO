package venditatelefoni.view;

import java.util.EventObject;

public class FormEvent extends EventObject {
	
	private String nome;
	private int memoria;
	private String cpu;
	private double display;
	private int fotocamera;
	
	public FormEvent(Object source) {
		super(source);
	}
	
	public FormEvent(Object source, String nome) {
		super(source);
		this.nome = nome;
	}

	public FormEvent(Object source, String nome, int memoria, String cpu, double display, int fotocamera) {
		super(source);
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
	
	
	

}
