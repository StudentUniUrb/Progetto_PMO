package venditatelefoni.view;

import java.util.EventObject;
import java.util.Set;

import venditatelefoni.implementazione.SmartphoneImpl;

public class FormEvent extends EventObject {
	
	private String nome;
	private int memoria;
	private String cpu;
	private double display;
	private int fotocamera;
	//private Set<CheckBox> checkboxes;
	//private SmartphoneImpl telefono;
	//private Set<SmartphoneImpl> smpartphones;
	
	public FormEvent(Object source) {
		super(source);
	}
	
	public FormEvent(Object source, String nome) {
		super(source);
		this.nome = nome;
	}
	
	/*public FormEvent(Object source, Set<SmartphoneImpl> smpartphones) {
		super(source);
		this.smpartphones = smpartphones;
	}*/
	
	/*public FormEvent(Object source, Set<CheckBox> checkboxes) {
		super(source);
		this.checkboxes = checkboxes;
	}*/


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
	
	/*public SmartphoneImpl smart() {
		this.telefono = new SmartphoneImpl(this.nome, this.memoria, this.cpu, this.display, this.fotocamera);
		this.smpartphones.add(this.telefono);
		return this.telefono;
	}

	public SmartphoneImpl getTelefono() {
		return telefono;
	}*/

	/*public Set<SmartphoneImpl> getSmpartphones() {
		return smpartphones;
	}

	public Set<CheckBox> getCheckboxes() {
		return checkboxes;
	}*/
	
	
	
	
	
	

}
