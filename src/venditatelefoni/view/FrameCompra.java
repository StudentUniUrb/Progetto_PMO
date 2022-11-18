package venditatelefoni.view;

import javax.swing.JFrame;
import java.awt.*;

public class FrameCompra extends JFrame{
	
	private PannelloRicerca pannelloRicerca;
	
	public FrameCompra() {
		
		super("Acquista su swappie");
		
		pannelloRicerca = new PannelloRicerca();
		
		add(pannelloRicerca, BorderLayout.LINE_START);
		
		setSize(800, 500); 
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true); 
		
	}

}
