package venditatelefoni.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

import venditatelefoni.implementazione.Negozio;
import venditatelefoni.modello.FormListener;

public class PannelloListaTelefoni extends JPanel {
	
	//private JLabel telefono;
	private Negozio negozio;
	private JRadioButton radioButton;
	
	private FormListener formListener;

	public PannelloListaTelefoni() {
		
		//setPreferredSize(new Dimension(300, 200));
		setLayout(new GridBagLayout());
		
		negozio = new Negozio();
		//telefono = new JLabel(negozio.getListaTelefoni().toString());
		
		
		Border bordoInterno = BorderFactory.createTitledBorder("Lista Smartphone");
		Border bordoEsterno = BorderFactory.createEmptyBorder(0, 5, 5, 5);
		Border bordoFinale = BorderFactory.createCompoundBorder(bordoEsterno, bordoInterno);
		setBorder(bordoFinale);
		
		// Aggiunge un radiobutton (almeno dovrebbe)
		this.setFormListener(new FormListener() {
			@Override
			public void formEventListener(FormEvent fe) {
				String nome = fe.getNome();
				int memoria = fe.getMemoria();
				String cpu = fe.getCpu();
				double display = fe.getDisplay();
				int fotocamera = fe.getFotocamera();
				
				//add(new JRadioButton(nome));
				//radioButton = new JRadioButton(nome);
				System.out.println("ciao");
				
			}
		});
		
		//Layout
		GridBagConstraints gbc = new GridBagConstraints();
		
		//RIGA 0
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		gbc.anchor = GridBagConstraints.PAGE_START;
		
		//add(telefono, gbc);
		
		
			
	}
	
	public void setFormListener(FormListener formListener) {
		this.formListener = formListener;
	}
	
	/*public void addJRadioButton(String titolo) {
		this.radioButton = new JRadioButton(titolo);
	}*/

}
