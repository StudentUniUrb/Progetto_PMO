package venditatelefoni.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

import venditatelefoni.implementazione.Negozio;
import venditatelefoni.modello.FormListener;

public class PannelloListaTelefoni extends JPanel {
	
	//private JButton radioButton;
	
	private FormListener formListener;

	public PannelloListaTelefoni() {
		
		setLayout(new GridBagLayout());
		
		Border bordoInterno = BorderFactory.createTitledBorder("Lista Smartphone");
		Border bordoEsterno = BorderFactory.createEmptyBorder(0, 5, 5, 5);
		Border bordoFinale = BorderFactory.createCompoundBorder(bordoEsterno, bordoInterno);
		setBorder(bordoFinale);
		
		//Layout
		/*GridBagConstraints gbc = new GridBagConstraints();
		
		//RIGA 0
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		gbc.anchor = GridBagConstraints.PAGE_START;*/
		
		//add(radioButton, gbc);
			
	}
	
	public void addJRadioButton(String titolo) {
		JButton radioButton = new JButton(titolo);
		//this.radioButton = new JButton(titolo);
		add(radioButton);
		System.out.println(radioButton);
		//return radioButton;
	}

}
