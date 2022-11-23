package venditatelefoni.implementazione;

import java.util.LinkedList;
import java.util.List;

public class Negozio {
	
	//private SmartphoneImpl iphone8;
	private List<SmartphoneImpl> listaTelefoni;
	
	public Negozio() {
		this.listaTelefoni = new LinkedList<>();
		this.listaTelefoni.add(new SmartphoneImpl("iphone8", 64, "Chip A16", 6.1, 12));
		this.listaTelefoni.add(new SmartphoneImpl("iphoneX", 128, "Chip A15", 6.3, 15));
		this.listaTelefoni.add(new SmartphoneImpl("iphone11", 64, "Chip A18", 6.5, 20));
		this.listaTelefoni.add(new SmartphoneImpl("iphone11", 128, "Chip A18", 6.5, 20));
	}

	public List<SmartphoneImpl> getListaTelefoni() {
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
	
	

}
