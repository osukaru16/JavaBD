package org.appgrafica;


import java.awt.event.*;
import javax.swing.*;

import javax.swing.border.EmptyBorder;

import org.appgrafica.motor.EscrituraTXT;


public class Ventana extends JFrame {
	
	private JPanel contentPane = new JPanel();
	
	
	private JButton botonAcep = new JButton("Acceptar");
	private JButton botonNeteja = new JButton("Netejar");
	private JButton botonSalir = new JButton("Sortir");
	
	private JCheckBox jcb_estudiant = new JCheckBox("Estudiant");
	private JCheckBox jcb_atur = new JCheckBox("Esta en el atur");
	private JCheckBox jcb_treballador = new JCheckBox("Treballador");
	private JCheckBox jcb_sexe = new JCheckBox("Sexe");
	private JComboBox<String> jc_sexe = new JComboBox<String>();
	
	
	private EscrituraTXT escribe = new EscrituraTXT();
	private String path = "Estat Solicitants.txt";
	private int contadorRegistro = 0;
	
	
	
	
	

	
	
	public Ventana() {
		try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
		
		
		
		
		
	}

	
	
	private void jbInit() throws Exception {
		escribe.setPath(path);
		
		
		
		this.setDefaultCloseOperation( Ventana.EXIT_ON_CLOSE );
		 //this.getContentPane().add( new Ventana(),BorderLayout.CENTER );
		 //this.setSize( 1000,1000 );
		this.setVisible(true);
		this.setResizable(false);
		 
		this.setBounds(100, 100, 320, 350);
		 
		 
		
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			
		contentPane.setLayout(null);
		this.setContentPane(contentPane);
		 
		
		
		
		jcb_estudiant.setBounds(11, 40, 97, 29);
		this.getContentPane().add(jcb_estudiant);
		
		 
		
		jcb_atur.setBounds(11, 90, 126, 45);
		this.getContentPane().add(jcb_atur);
		
		
		
		 
		 
		 
		
		jcb_treballador.setBounds(11, 150, 97, 29);
		this.getContentPane().add(jcb_treballador);
		
		
		
		
		
		jcb_sexe.setBounds(11, 210, 97, 29);
		this.getContentPane().add(jcb_sexe);
		
		
		jc_sexe.setBounds(110, 210, 97, 29);
		this.getContentPane().add(jc_sexe);
		jc_sexe.setModel(new DefaultComboBoxModel<String>(new String[]{"Home","Dona"}));
		jc_sexe.setVisible(false);
		
		
		
		
		
		//botones
		
		botonAcep.setBounds(11, 280, 90, 20);
		this.getContentPane().add(botonAcep);
		
		
		
		
		botonNeteja.setBounds(110, 280, 90, 20);
		this.getContentPane().add(botonNeteja);
		
		
		
		botonSalir.setBounds(210, 280, 90, 20);
		this.getContentPane().add(botonSalir);
		
		
		
		
		
		
		
		
		//Eventos

		
		
		jcb_estudiant.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	jcb_atur.setSelected(false);
				jcb_treballador.setSelected(false);
            }
        });
		
		
		jcb_atur.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	jcb_estudiant.setSelected(false);
				jcb_treballador.setSelected(false);
            }
        });
		
		jcb_treballador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	jcb_atur.setSelected(false);
				jcb_estudiant.setSelected(false);
            }
        });
		 
		
		
		jcb_sexe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(jcb_sexe.isSelected()){
            		jc_sexe.setVisible(true);
            	}
            	else{
            		jc_sexe.setVisible(false);
            	}
            }
        });
		
		
		
		
		
		
		
		botonNeteja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	jcb_atur.setSelected(false);
				jcb_estudiant.setSelected(false);
				jcb_treballador.setSelected(false);
				jcb_sexe.setSelected(false);
            	jc_sexe.setVisible(false);
            }
        });
		
		
		
		
		
		
		botonSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	escribe.guardado();
            	System.exit(0);
            }
        });
		
		
		
		
		botonAcep.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String ocupacion ="";
            	if(jcb_atur.isSelected()){
            		ocupacion = jcb_atur.getText();
            	}
            	else if(jcb_estudiant.isSelected()){
            		ocupacion = jcb_estudiant.getText();
            	}
            	else if(jcb_treballador.isSelected()){
            		ocupacion = jcb_treballador.getText();
            	}
            	
            	contadorRegistro++;
            	escribe.setTexto(contadorRegistro+" "+jc_sexe.getSelectedItem().toString()+" "+ocupacion);
            }
        });
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
