package venditatelefoni.view;

import javax.swing.JFrame;

import venditatelefoni.implementazione.Negozio;
import venditatelefoni.implementazione.SmartphoneImpl;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

public class FrameCompra extends JFrame{
	
	private PannelloRicerca pannelloRicerca;
	private Negozio negozio;
	private PannelloListaTelefoni pannelloTelefoni;
	private int y = 1;
	
	public FrameCompra() {
		
		super("Acquista su swappie");
		pannelloRicerca = new PannelloRicerca();
		pannelloTelefoni = new PannelloListaTelefoni();
		negozio = new Negozio();
		
		pannelloRicerca.getBottoneCerca().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String scelta = pannelloRicerca.getSceltaMenu();
				if(scelta == "Tutti") {
					Set<SmartphoneImpl> telefoni = negozio.getListaTelefoni();
					for(SmartphoneImpl telefono : telefoni) {
						String smartphone = telefono.getNome() +  telefono.getMemoria() + telefono.getCpu() + telefono.getDisplay() + telefono.getFotocamera();
						pannelloTelefoni.addJCheckBox(smartphone, y);
						y++;
					}
					
				} else {
					Set<SmartphoneImpl> telefoni =  negozio.listaTelefoniByName(scelta);
					for(SmartphoneImpl telefono : telefoni) {
						String smartphone = telefono.getNome() +  telefono.getMemoria() + telefono.getCpu() + telefono.getDisplay() + telefono.getFotocamera();
						pannelloTelefoni.addJCheckBox(smartphone, y);
						y++;
					}
				}
				revalidate();
				repaint();
			}
		});
		
		pannelloTelefoni.getBottoneCompra().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Set<String> nomiTelefoni = pannelloTelefoni.removeJCheckBoxSet();
				negozio.rimuoviTelefonoByName(nomiTelefoni);
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
