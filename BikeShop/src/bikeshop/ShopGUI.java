package bikeshop;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class ShopGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1956870984781197012L;
	
	public ShopGUI(int xloc, int yloc, int xsize, int ysize, int closeActivity) {
		this.setMinimumSize(new Dimension(1200, 120));
		this.setLocation(xloc, yloc);
		this.setSize(xsize, ysize);
		this.setDefaultCloseOperation(closeActivity);
		
		this.setTitle("Bike Shop");
		buildAndAdd();
		this.pack();
		this.setVisible(true);
	}
	
	private void buildAndAdd() {
		JPanel backPanel = new JPanel();
		backPanel.setLayout(new BorderLayout(10,10));
		JPanel north = new JPanel(), south = new JPanel(), east = new JPanel(), west = new JPanel(), center = new JPanel();
		
		north.add(new JLabel("Welcome to the Bike Shop"));
		backPanel.add(north);
		
		
		
		this.add(backPanel);
	}
}
