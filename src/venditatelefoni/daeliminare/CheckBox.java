package venditatelefoni.daeliminare;

import java.util.HashSet;
import java.util.Set;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class CheckBox implements ActionListener {
	
	private JCheckBox scelta;
	private Set<JCheckBox> set;
	private String titolo;
	
	public CheckBox(String titolo, Set<JCheckBox> set) {
		this.set = set;
		this.titolo = titolo;
		this.scelta = new JCheckBox(this.titolo);
		this.scelta.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.scelta.isSelected()) {
			this.set.add(scelta);
			//System.out.println("1 " + this.set);
		} else if(!this.scelta.isSelected()) {
			this.set.remove(scelta);
			//System.out.println("2 " + this.set);
		}
	}
	
	

	public JCheckBox getScelta() {
		return scelta;
	}

	public Set<JCheckBox> getSet() {
		return set;
	}

	public String getTitolo() {
		return titolo;
	}

	public void removeJCheckBoxSet(Set<CheckBox> set) {
		this.scelta.setEnabled(false);
	}
	
	
}
