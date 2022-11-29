package venditatelefoni.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

import venditatelefoni.implementazione.Negozio;
import venditatelefoni.modello.FormListener;

public class PannelloListaTelefoni extends JPanel{
	
	//private FormListener formListener;
	private Set<CheckBox> checkBoxes;
	private JButton bottoneCompra;

	public PannelloListaTelefoni() {
		
		setLayout(new GridBagLayout());
		
		Border bordoInterno = BorderFactory.createTitledBorder("Smartphone presenti in negozio");
		Border bordoEsterno = BorderFactory.createEmptyBorder(0, 5, 5, 5);
		Border bordoFinale = BorderFactory.createCompoundBorder(bordoEsterno, bordoInterno);
		setBorder(bordoFinale);
		
		this.checkBoxes = new HashSet<>();
		/*this.bottoneCompra = new JButton("Compra!");
		bottoneCompra.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Set<SmartphoneImpl> telefoni = negozio.getListaTelefoni();
				for(SmartphoneImpl telefono : telefoni) {
					
				}
				
				FormEvent formEvent = new FormEvent(telefoni);
				negozio.rimuoviTelefono(telefoni);
				System.out.println(compraListener);
				if(compraListener != null) {
					compraListener.CompraEventListener(formEvent);
					System.out.println("addio");
				}
			}
		});*/ // NON ABBIAMO NEGOZIO 
		//Layout
		GridBagConstraints gbc = new GridBagConstraints();
		
		//RIGA 0
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		gbc.anchor = GridBagConstraints.PAGE_END;
		
		add(bottoneCompra, gbc);
			
	}
	
	public void addJCheckBox(String titolo, int y) {
		CheckBox checkBox = new CheckBox(titolo, this.checkBoxes);
		//System.out.println("ciao" + this.checkBoxes);
		//Layout
		GridBagConstraints gbc = new GridBagConstraints();
		
		//RIGA 0
		gbc.gridy = y;
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		gbc.anchor = GridBagConstraints.CENTER;
		
		add(checkBox.getScelta(), gbc);
	}

	public Set<CheckBox> getCheckBoxes() {
		return this.checkBoxes;
	}
	
	/*public void removeJCheckBox(Set<CheckBox> selezionati) {
		this.checkBoxes.removeAll(selezionati);
	}*/
	public void removeJCheckBox(String titolo) {
		for(CheckBox c : this.checkBoxes) {
			if(c.getTitolo().equals(titolo)) {
				this.checkBoxes.remove(c);
			}
		}
	}
	
	
	
	/*public List<JCheckBox> addJCheckBox(String titolo, int y) {
		JCheckBox checkBox = new JCheckBox(titolo);
		
		//checkBox.addActionListener(this);
		checkBox.addActionListener(new ActionListener() {
			private List<JCheckBox> list = new LinkedList<>();
			@Override
			public void actionPerformed(ActionEvent e) {
				if(checkBox.isSelected()) {
					list.add(checkBox);
					System.out.println("aggiungi: " + list);
				} else if(!checkBox.isSelected()) {
					list.remove(checkBox);
					System.out.println("rimuovi: " + list);
				}
			}
			// L'IDEA ORA E' CREARE UN'ALTRA CLASSE CHECKBOX CHE GESTISCE
			// QUELLO CHE SUCCEDE QUANDO PREMO UNA CHECKBOX
		}); 
		

	}*/
	
}
