package venditatelefoni.view;

import javax.swing.JButton;
import javax.swing.JFrame;

import venditatelefoni.implementazione.SmartphoneImpl;
import venditatelefoni.modello.ButtonListener;
import venditatelefoni.modello.FormListener;

import java.awt.*;
import java.util.Set;

public class FrameCompra extends JFrame{
	
	private PannelloRicerca pannelloRicerca;
	private PannelloListaTelefoni pannelloTelefoni;
	private int y = 0;
	
	public FrameCompra() {
		
		super("Acquista su swappie");
		
		pannelloRicerca = new PannelloRicerca();
		pannelloTelefoni = new PannelloListaTelefoni();
		
		pannelloRicerca.setFormListener(new FormListener() {
			@Override
			public void formEventListener(FormEvent fe) {
				String nome = fe.getNome();
				int memoria = fe.getMemoria();
				String cpu = fe.getCpu();
				double display = fe.getDisplay();
				int fotocamera = fe.getFotocamera();
		
				pannelloTelefoni.addJCheckBox(nome + " " + memoria + "GB" + " " + cpu + " " + display + "pollici" + " " + fotocamera + "MP", y);
				y++;
			}
			@Override
			public void CompraEventListener(FormEvent fe) {
				System.out.println("aiuto");
				//Set<CheckBox> checkbox = fe.getCheckboxes();
				String nome = fe.getNome();
				pannelloTelefoni.removeJCheckBox(nome);
				System.out.println("aiuto1");
				//pannelloTelefoni.removeJCheckBox(checkbox);
				System.out.println("aiuto2");
			}
		});
		
		add(pannelloRicerca, BorderLayout.LINE_START);
		add(pannelloTelefoni, BorderLayout.CENTER);
		
		setSize(800, 500); 
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true); 
		
	}

}
