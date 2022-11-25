package venditatelefoni.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

import venditatelefoni.modello.ButtonListener;
import venditatelefoni.modello.FormListener;

public class PannelloRicerca extends JPanel{
	
	private JLabel labelRicerca;
	private JComboBox listaSmartphone;
	private JButton bottoneCerca;
	
	private FormListener formListener;
	private ButtonListener buttonListener;
	
	public PannelloRicerca() {
		
		setPreferredSize(new Dimension(300, 200));
		setLayout(new GridBagLayout());
		
		Border bordoInterno = BorderFactory.createTitledBorder("Trova Smartphone!");
		Border bordoEsterno = BorderFactory.createEmptyBorder(0, 5, 5, 5);
		Border bordoFinale = BorderFactory.createCompoundBorder(bordoEsterno, bordoInterno);
		setBorder(bordoFinale);
		
		// menu a tendina
		labelRicerca = new JLabel("Trova il tuo Smartphone");
		String[] opzioniSmartpohne = {"Tutti", "iPhone8", "iPhoneX", "iPhone11", "iPhone12", "iPhone13", "iPhone14"}; // lista menu a tendina
		listaSmartphone = new JComboBox(opzioniSmartpohne); // creazione menu a tendina
		listaSmartphone.setSelectedIndex(0); // impostare il valore default visualizzato: "Tutti"
		listaSmartphone.setEditable(false); // combox non modificabile
		
		bottoneCerca = new JButton("Cerca!");
		// Quando il bottone CERCA viene premuto
		bottoneCerca.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				/*String scelta = (String) listaSmartphone.getSelectedItem();
				FormEvent formEvent = new FormEvent(this, scelta);
				if(formListener != null) {
					formListener.formEventListener(formEvent);
				}*/
				if(buttonListener != null) {
					buttonListener.addJRadioButton("ciao");
				}
				revalidate();
				repaint();
			}
		});
		
		//Layout
		GridBagConstraints gbc = new GridBagConstraints();
		
		//RIGA 0
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		gbc.anchor = GridBagConstraints.PAGE_END;
		
		add(labelRicerca, gbc);
		
		//RIGA 0
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		add(listaSmartphone, gbc);
		
		//RIGA 1
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		
		gbc.anchor = GridBagConstraints.PAGE_START;
		
		add(bottoneCerca, gbc);
		
	}
	
	public void setFormListener(FormListener formListener) {
		this.formListener = formListener;
	}
	
	public void setButtonListener(ButtonListener buttonListener) {
		this.buttonListener = buttonListener;
	}

}
