package venditatelefoni.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FrameVendi extends JFrame{
	
	private PannelloVendita pannelloVendita;
	
public FrameVendi() {
		
		super("Vendi su swappie");
		
		pannelloVendita = new PannelloVendita();
		
		add(pannelloVendita, BorderLayout.LINE_START);
		
		setSize(800, 500); 
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true); 
		
	}

}
