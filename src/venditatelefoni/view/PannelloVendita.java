package venditatelefoni.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class PannelloVendita extends JPanel{
	
	private JLabel labelRicerca;
	private JComboBox listaSmartphone;
	private JButton bottonePreventivo;
	
	private JLabel labelMemoria;
	private JRadioButton minima;
	private JRadioButton media;
	private JRadioButton massima;
	private ButtonGroup gruppoRadioMemoria;
	private JLabel labelSchermo;
	private JList listaSchermo;
	private JLabel labelFunzionante;
	private JRadioButton funziona;
	private JRadioButton nonFunziona;
	private ButtonGroup gruppoRadioFunziona;
	private JLabel labelBatteria;
	private JCheckBox batteria; 
	
	public PannelloVendita() {
		
		setPreferredSize(new Dimension(500, 200));
		setLayout(new GridBagLayout());
		
		Border bordoInterno = BorderFactory.createTitledBorder("Ottieni il tuo preventivo");
		Border bordoEsterno = BorderFactory.createEmptyBorder(0, 5, 5, 5);
		Border bordoFinale = BorderFactory.createCompoundBorder(bordoEsterno, bordoInterno);
		setBorder(bordoFinale);
		
		
		// menu a tendina
		labelRicerca = new JLabel("Trova il tuo Smartphone");
		String[] opzioniSmartphne = {"iPhone8", "iPhoneX", "iPhone11", "iPhone12", "iPhone13", "iPhone14"}; // lista menu a tendina
		listaSmartphone = new JComboBox(opzioniSmartphne); // creazione menu a tendina
		listaSmartphone.setSelectedIndex(0); // impostare il valore default visualizzato: "Tutti"
		listaSmartphone.setEditable(false); // combox non modificabile
		
		//Memoria
		labelMemoria = new JLabel("Memoria: ");
		
		minima = new JRadioButton("64 GB");
		minima.setActionCommand("64 GB");
		media = new JRadioButton("128 GB");
		media.setActionCommand("128 GB");
		massima = new JRadioButton("256 GB");
		massima.setActionCommand("256 GB");
		
		gruppoRadioMemoria = new ButtonGroup();
		gruppoRadioMemoria.add(minima);
		gruppoRadioMemoria.add(media);
		gruppoRadioMemoria.add(massima);
		
		bottonePreventivo = new JButton("Preventivo");
		
		//Condizioni Schermo

		labelSchermo = new JLabel("Schermo: ");
		
		listaSchermo = new JList();
		listaSchermo.setPreferredSize(new Dimension(100, 75));
		listaSchermo.setBorder(BorderFactory.createEtchedBorder());
		
		DefaultListModel qualitaSchermo = new DefaultListModel();
		qualitaSchermo.addElement("Pessimo");
		qualitaSchermo.addElement("Buono");
		qualitaSchermo.addElement("Ottimo");
		qualitaSchermo.addElement("Come nuovo");
		
		listaSchermo.setModel(qualitaSchermo);
		
		//Funzionamento Telefono
		
		labelFunzionante = new JLabel("Il telefono è funzionante :");
		
		funziona = new JRadioButton("Si");
		funziona.setActionCommand("Si");
		nonFunziona = new JRadioButton("No");
		nonFunziona.setActionCommand("No");
		
		gruppoRadioFunziona = new ButtonGroup();
		gruppoRadioFunziona.add(funziona);
		gruppoRadioFunziona.add(nonFunziona);
		
		//Qualita Batteria
		
		labelBatteria = new JLabel("La qualità della batteria è superiore al 85% ?");
		
		batteria = new JCheckBox();
		
		//Layout
		GridBagConstraints gbc = new GridBagConstraints();
		
		//RIGA 0: Menu a tendina
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		gbc.anchor = GridBagConstraints.LINE_START;
		
		add(labelRicerca, gbc);
		
		//RIGA 0
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		gbc.gridwidth = 3;
		gbc.gridheight = 1;
		
		gbc.anchor = GridBagConstraints.LINE_START;
		
		add(listaSmartphone, gbc);
		
		//RIGA 1 : Memoria
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		//gbc.gridwidth = 1;
		//gbc.gridheight = 1;
		
		gbc.anchor = GridBagConstraints.LINE_START;
		
		add(labelMemoria, gbc);
		
		//RIGA 1 : Bottone minima
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		//gbc.gridwidth = 1;
		//gbc.gridheight = 1;
		
		add(minima, gbc);
		
		gbc.anchor = GridBagConstraints.LINE_START;
		
		//RIGA 1 : Bottone media
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		//gbc.gridwidth = 1;
		//gbc.gridheight = 1;
		
		gbc.anchor = GridBagConstraints.LINE_START;
		
		add(media, gbc);
		
		//RIGA 1 : Bottone massima
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		//gbc.gridwidth = 1;
		//gbc.gridheight = 1;
		
		gbc.anchor = GridBagConstraints.LINE_START;
		
		add(massima, gbc);
		
		//RIGA 2 : Schermo
		gbc.gridx = 0;
		gbc.gridy = 2;
		
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		
		gbc.anchor = GridBagConstraints.LINE_START;
		
		//gbc.insets = new Insets(0, 0, 0, 5); 
		
		add(labelSchermo, gbc);
		
		//RIGA 2: listaSchermo
		gbc.gridx = 1;
		gbc.gridy = 2;
		
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		gbc.gridwidth = 3;
		gbc.gridheight = 1;
		
		gbc.anchor = GridBagConstraints.LINE_START;
		
		//gbc.insets = new Insets(0, 0, 0, 5); 
		
		add(listaSchermo, gbc);
				
		//RIGA 3: Funzionamento
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		
		add(labelFunzionante, gbc);
		
		//RIGA 3: Bottone Si
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
				
		add(funziona, gbc);
				
		//RIGA 3: Bottone No
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
				
		add(nonFunziona, gbc);
		
		//RIGA 4: Qualita Batteria
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		
		gbc.anchor = GridBagConstraints.LINE_START;
		
		add(labelBatteria, gbc);
		
		//RIGA 4: Qualita Batteria
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		
		gbc.anchor = GridBagConstraints.LINE_END;
				
		add(batteria, gbc);
		
		//RIGA 5
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		gbc.gridwidth = 4;
		gbc.gridheight = 1;
		
		gbc.anchor = GridBagConstraints.LINE_START;
		
		add(bottonePreventivo, gbc);
	}

}
