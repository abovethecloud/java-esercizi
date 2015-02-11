package dizionario.ui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBarDizionario extends JMenuBar {
	
	// Creo la JMenuBar, il Menu e i MenuItem
	JMenu menu = new JMenu("Sunzuki");
	JMenuItem menuItemInglese = new JMenuItem("Italiano-Inglese");
	JMenuItem menuItemFrancese = new JMenuItem("Italiano-Francese");
	
	public MenuBarDizionario() {
		super();
		
		// Aggiungo al menu il MenuItem e il menu alla menuBar
		menu.add(menuItemInglese);
		menu.add(menuItemFrancese);
		add(menu);
	}

}
