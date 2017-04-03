package org.appgrafica;


import java.awt.event.*;
import javax.swing.*;

import javax.swing.border.EmptyBorder;

import org.appgrafica.motor.EscrituraTXT;


public class Ventana extends JFrame {

	private JPanel contentPane = new JPanel();

	//Declaracion de botones
	private JButton botonAcep = new JButton("Alta");
	private JButton botonNeteja = new JButton("Limpiar");
	private JButton botonSalir = new JButton("Salir");
	private JButton botonModificar = new JButton("Modificar");
	
	
	
	

	//ComboBox
	private JComboBox<String> jc_sexe = new JComboBox<String>();
	private JLabel jl_sexe = new JLabel("Sexo:");
	
	private JComboBox<String> jc_ocupacion = new JComboBox<String>();
	private JLabel jl_estado = new JLabel("Estado:");

	private EscrituraTXT escribe = new EscrituraTXT();
	private String path = "Estat Solicitants.txt";
	private int contadorRegistro = 0;

	private JTextField jtf_nombre = new JTextField();
	private JLabel jl_nombre = new JLabel("Nombre:");

	private JTextField jtf_apellidos = new JTextField();
	private JLabel jl_apellidos = new JLabel("Apellidos:");

	private JTextField jtf_dni = new JTextField();
	private JLabel jl_dni = new JLabel("DNI:");

	private JTextField jtf_edad = new JTextField();
	private JLabel jl_edad = new JLabel("Edad:");



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

		this.setBounds(100, 100, 620, 650);




		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(null);
		this.setContentPane(contentPane);




		//label

		jl_nombre.setBounds(11, 40, 97, 29);
		this.getContentPane().add(jl_nombre);

		jl_apellidos.setBounds(11, 80, 97, 29);
		this.getContentPane().add(jl_apellidos);

		jl_dni.setBounds(11, 120, 97, 29);
		this.getContentPane().add(jl_dni);

		jl_edad.setBounds(11, 160, 97, 29);
		this.getContentPane().add(jl_edad);
		
		jl_sexe.setBounds(11, 200, 97, 29);
		this.getContentPane().add(jl_sexe);
		
		jl_estado.setBounds(11, 240, 97, 29);
		this.getContentPane().add(jl_estado);





		//texto 
		jtf_nombre.setBounds(80, 40, 130, 29);
		this.getContentPane().add(jtf_nombre);

		jtf_apellidos.setBounds(80, 80, 130, 29);
		this.getContentPane().add(jtf_apellidos);

		jtf_dni.setBounds(80, 120, 130, 29);
		this.getContentPane().add(jtf_dni);

		jtf_edad.setBounds(80, 160, 50, 29);
		this.getContentPane().add(jtf_edad);
















		//botones

		botonAcep.setBounds(411, 40, 90, 20);
		this.getContentPane().add(botonAcep);


		botonNeteja.setBounds(411, 80, 90, 20);
		this.getContentPane().add(botonNeteja);


		botonSalir.setBounds(411, 120, 90, 20);
		this.getContentPane().add(botonSalir);
		
		
		
		
		//combobox
		
		jc_sexe.setBounds(80, 200, 97, 29);
		this.getContentPane().add(jc_sexe);
		jc_sexe.setModel(new DefaultComboBoxModel<String>(new String[]{"Home","Dona"}));
		
		
		
		
		
		jc_ocupacion.setBounds(80, 240, 97, 29);
		this.getContentPane().add(jc_ocupacion);
		jc_ocupacion.setModel(new DefaultComboBoxModel<String>(new String[]{"Soltero","Casado","Viudo"}));
		









		//Eventos









		botonNeteja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});






		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});




		botonAcep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}





		});







	}


















}
