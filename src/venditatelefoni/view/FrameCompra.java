package venditatelefoni.view;

import javax.swing.JButton;
import javax.swing.JFrame;

import venditatelefoni.modello.ButtonListener;
import venditatelefoni.modello.FormListener;

import java.awt.*;

public class FrameCompra extends JFrame{
	
	private PannelloRicerca pannelloRicerca;
	private PannelloListaTelefoni pannelloTelefoni;
	
	public FrameCompra() {
		
		super("Acquista su swappie");
		
		pannelloRicerca = new PannelloRicerca();
		pannelloTelefoni = new PannelloListaTelefoni();
		
		/*pannelloRicerca.setFormListener(new FormListener() {
			@Override
			public void formEventListener(FormEvent fe) {
				String nome = fe.getNome();
				int memoria = fe.getMemoria();
				String cpu = fe.getCpu();
				double display = fe.getDisplay();
				int fotocamera = fe.getFotocamera();
		
				pannelloTelefoni.addJRadioButton(nome + memoria + cpu + display + fotocamera);
			}	
		});*/
		pannelloRicerca.setButtonListener(new ButtonListener() {
			@Override
			public void addJRadioButton(String titolo) {
				pannelloTelefoni.addJRadioButton(titolo);
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
