package org.appgrafica.frames;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BDFrame extends JFrame {
	
	private JPanel contentPane = new JPanel();
	
	
	
	public BDFrame() {
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	

	private void jbInit() throws Exception {
		


		
		

		this.setVisible(true);
		this.setResizable(false);

		this.setBounds(100, 100, 620, 400);




		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(null);
		this.setContentPane(contentPane);


		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
