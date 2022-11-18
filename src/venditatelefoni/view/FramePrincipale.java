package venditatelefoni.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;

public class FramePrincipale extends JFrame{
	
	private SceltaIniziale start;
	
	public FramePrincipale() {
		
		super("Swappie");
		
		start = new SceltaIniziale();
		
		add(start, BorderLayout.CENTER);
		
		setSize(400, 100); // size della finestra
		setLocationRelativeTo(null); // farla comparire al centro
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // l'applicazione si chiude quando premi la "X"
		setVisible(true); // finestra visibile, da mettere alla fine dopo aver impostato la finestra
		
	}

}

class SceltaIniziale extends JPanel implements ActionListener {
	
	private JButton bottoneCompra;
	private JButton bottoneVendi;
	private JLabel labelBenvenuto;
	
	public SceltaIniziale() {
		
		labelBenvenuto = new JLabel("Benvenuto, scegli se acquistare o vendere il tuo Smarphone!");
		bottoneCompra = new JButton("Compra");
		bottoneVendi = new JButton("Vendi");
		
		bottoneCompra.setPreferredSize(new Dimension(80,26));
		bottoneVendi.setPreferredSize(new Dimension(80,26));

		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		add(labelBenvenuto);
		add(bottoneCompra);
		add(bottoneVendi);
		
		bottoneCompra.addActionListener(this);
		bottoneVendi.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object azione = e.getSource(); // torna l'oggetto in cui è avvenuta l'azione
		JButton premuto = (JButton) azione;
		if(premuto == bottoneCompra) {
			new FrameCompra();
		} else if(premuto == bottoneVendi){
			new FrameVendi();
		}
	}
}

