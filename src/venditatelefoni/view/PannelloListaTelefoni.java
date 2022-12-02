package venditatelefoni.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class PannelloListaTelefoni extends JPanel implements ActionListener{
	
	private Set<JCheckBox> checkBoxes;
	private Set<JCheckBox> selezionate;
	private JButton bottoneCompra;

	public PannelloListaTelefoni() {
		
		setLayout(new GridBagLayout());
		
		Border bordoInterno = BorderFactory.createTitledBorder("Smartphone presenti in negozio");
		Border bordoEsterno = BorderFactory.createEmptyBorder(0, 5, 5, 5);
		Border bordoFinale = BorderFactory.createCompoundBorder(bordoEsterno, bordoInterno);
		setBorder(bordoFinale);
		
		this.checkBoxes = new HashSet<>();
		this.selezionate = new HashSet<>();
	
		this.bottoneCompra = new JButton("Compra!");
		
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
		JCheckBox checkBox = new JCheckBox(titolo);
		if(!CheckBoxUguali(checkBox)) {
			this.checkBoxes.add(checkBox);
			checkBox.addActionListener(this);
			//Layout
			GridBagConstraints gbc = new GridBagConstraints();
			
			//RIGA 0
			gbc.gridy = y;
			gbc.weightx = 0.01;
			gbc.weighty = 0.01;
			
			gbc.anchor = GridBagConstraints.CENTER;
			add(checkBox, gbc);
			//System.out.println(this.checkBoxes);
		}
		
	}
	
	private boolean CheckBoxUguali(JCheckBox jb) {
		for(JCheckBox x : this.checkBoxes) {
			if(x.getText().equals(jb.getText())) {
				this.checkBoxes.remove(jb);
				jb.setVisible(false);
				return true;
			}
		}
		return false;
	}
	
	public void actionPerformed(ActionEvent e) {
		Object azione = e.getSource();
		JCheckBox selezionato = (JCheckBox) azione;
		if(selezionato.isSelected()) {
			this.selezionate.add(selezionato);
		} else if(!selezionato.isSelected()) {
			this.selezionate.remove(selezionato);
		}
	}

	public Set<JCheckBox> getCheckBoxes() {
		return this.checkBoxes;
	}
	
	public Set<String> removeJCheckBoxSet() {
		Set<String> titolo = new HashSet<>();
		for(JCheckBox jb : this.selezionate) {
			titolo.add(jb.getText());
			jb.setVisible(false);
		}
		return titolo;
	}
	
	public void removeJCheckBox(String titolo) {
		for(JCheckBox c : this.checkBoxes) {
			if(c.getText().equals(titolo)) {
				this.checkBoxes.remove(c);
			}
		}
	}

	public JButton getBottoneCompra() {
		return this.bottoneCompra;
	}

	public Set<JCheckBox> getSelezionate() {
		return this.selezionate;
	}
	
	
}
