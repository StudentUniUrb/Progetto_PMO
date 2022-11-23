package venditatelefoni.view;

import javax.swing.JFrame;
import java.awt.*;

public class FrameCompra extends JFrame{
	
	private PannelloRicerca pannelloRicerca;
	private PannelloListaTelefoni pannelloTelefoni;
	
	public FrameCompra() {
		
		super("Acquista su swappie");
		
		pannelloRicerca = new PannelloRicerca();
		pannelloTelefoni = new PannelloListaTelefoni();
		
		add(pannelloRicerca, BorderLayout.LINE_START);
		add(pannelloTelefoni, BorderLayout.CENTER);
		
		setSize(800, 500); 
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true); 
		
	}

}
