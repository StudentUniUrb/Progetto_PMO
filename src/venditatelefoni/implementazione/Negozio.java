package venditatelefoni.implementazione;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Negozio {
	
	//private SmartphoneImpl iphone8;
	private Set<SmartphoneImpl> listaTelefoni;
	
	public Negozio() {
		this.listaTelefoni = new HashSet<>();
		this.listaTelefoni.add(new SmartphoneImpl("iPhone8", 64, "Chip A16", 6.1, 12));
		this.listaTelefoni.add(new SmartphoneImpl("iPhoneX", 128, "Chip A15", 6.3, 15));
		this.listaTelefoni.add(new SmartphoneImpl("iPhone11", 64, "Chip A18", 6.5, 20));
		this.listaTelefoni.add(new SmartphoneImpl("iPhone11", 128, "Chip A18", 6.5, 20));
	}

	public Set<SmartphoneImpl> getListaTelefoni() {
		return listaTelefoni;
	}
	
	public SmartphoneImpl cercaTelefono(String nome) {
		for(SmartphoneImpl s : this.listaTelefoni) {
			if(s.getNome().equals(nome)) {
				return s;
			}
		}
		return null;
	}
	
	public Set<SmartphoneImpl> listaTelefoniByName(String nome) {
		Set<SmartphoneImpl> copia = new HashSet<>();
		for(SmartphoneImpl s : this.listaTelefoni) {
			if(s.getNome().equals(nome)) {
				copia.add(s);
			}
		}
		
		return copia;
	}
	
	public void rimuoviTelefono(/*SmartphoneImpl smpartphone*/Set<SmartphoneImpl> set) {
		this.listaTelefoni.removeAll(set);
	}
	

}
