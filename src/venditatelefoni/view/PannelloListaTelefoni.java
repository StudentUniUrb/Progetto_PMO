package venditatelefoni.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

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
	private List<JCheckBox> caselleSelezionate;

	public PannelloListaTelefoni() {
		
		setLayout(new GridBagLayout());
		
		Border bordoInterno = BorderFactory.createTitledBorder("Smartphone presenti in negozio");
		Border bordoEsterno = BorderFactory.createEmptyBorder(0, 5, 5, 5);
		Border bordoFinale = BorderFactory.createCompoundBorder(bordoEsterno, bordoInterno);
		setBorder(bordoFinale);
		
		this.caselleSelezionate = new LinkedList<>();
		//Layout
		//GridBagConstraints gbc = new GridBagConstraints();
		
		//RIGA 0
		/*gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		gbc.anchor = GridBagConstraints.PAGE_END;
		
		add(compra, gbc);*/
			
	}
	
	/*public void addJCheckBox(String titolo, int y) {
		JCheckBox checkBox = new JCheckBox(titolo);
		
		//Layout
		GridBagConstraints gbc = new GridBagConstraints();
		
		//RIGA 0
		gbc.gridy = y;
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		gbc.anchor = GridBagConstraints.CENTER;
		
		add(checkBox, gbc);
		//add(radioButton);
	}*/
	
	public List<JCheckBox> addJCheckBox(String titolo, int y) {
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
		
		//Layout
		GridBagConstraints gbc = new GridBagConstraints();
		
		//RIGA 0
		gbc.gridy = y;
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		gbc.anchor = GridBagConstraints.CENTER;
		
		add(checkBox, gbc);
		return null;

	}
	
	public void checkBoxSelected() {
		
	}

	/*@Override
	public void actionPerformed(ActionEvent e) {
		if()
		
	}*/
	
}
