package org.appgrafica.frames;


import java.awt.event.*;
import javax.swing.*;

import javax.swing.border.EmptyBorder;

import org.appgrafica.modelo.Persona;
import org.appgrafica.modelo.PoolPersona;
import org.appgrafica.motor.EscrituraTXT;
import org.appgrafica.verificado.Comprobador;


public class Ventana extends JFrame {
	
	/**
	 * Ventana es la ventana principal que crea las otras ventanas necesarias
	 * 
	 * formado por:
	 * 
	 * jbInit(): que se encarga de la parte grafica y eventos graficos.
	 * 
	 * camposVacios()
	 * 
	 * 
	 * */
	

	private JPanel contentPane = new JPanel();
	private int contador = 0;

	//Declaracion de botones
	private JButton botonAcep = new JButton("Alta");
	private JButton botonNeteja = new JButton("Limpiar");
	private JButton botonSalir = new JButton("Salir");
	private JButton botonModificar = new JButton("Modificar");
	private JButton botonEliminar = new JButton("Eliminar");
	private JButton botonConsultar = new JButton("Consultar");
	
	
	

	//ComboBox
	private JComboBox<String> jc_sexe = new JComboBox<String>();
	private JLabel jl_sexe = new JLabel("Sexo:");
	
	private JComboBox<String> jc_estado = new JComboBox<String>();
	private JLabel jl_estado = new JLabel("Estado:");

	private EscrituraTXT escribe = new EscrituraTXT();
	private String path = "Estat Solicitants.txt";
	//private int contadorRegistro = 0;

	private JTextField jtf_nombre = new JTextField();
	private JLabel jl_nombre = new JLabel("Nombre:");

	private JTextField jtf_apellidos = new JTextField();
	private JLabel jl_apellidos = new JLabel("Apellidos:");

	private JTextField jtf_dni = new JTextField();
	private JLabel jl_dni = new JLabel("DNI:");

	private JTextField jtf_edad = new JTextField();
	private JLabel jl_edad = new JLabel("Edad:");
	
	private JLabel jl_registro = new JLabel("Numero de registros actuales: "+contador);
	
	
	
	//pesona y poolpersona
	private Persona persona;
	private PoolPersona muchasPersonas = new PoolPersona();
	
	
	// otros frames
	private VentanaDatos verDatos = new VentanaDatos();



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

		this.setBounds(100, 100, 620, 400);




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
		
		jl_registro.setBounds(11, 280, 300, 29);
		this.getContentPane().add(jl_registro);





		//texto 
		jtf_nombre.setBounds(80, 40, 230, 29);
		this.getContentPane().add(jtf_nombre);

		jtf_apellidos.setBounds(80, 80, 230, 29);
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
		
		
		
		
		botonConsultar.setBounds(411, 160, 90, 20);
		this.getContentPane().add(botonConsultar);
		
		
		/*
		
		botonModificar.setBounds(411, 200, 90, 20);
		this.getContentPane().add(botonModificar);
		
		
		botonEliminar.setBounds(411, 240, 90, 20);
		this.getContentPane().add(botonEliminar);
		*/
		
		
		
		
		
		
		
		
		
		
		//combobox
		
		jc_sexe.setBounds(80, 200, 97, 29);
		this.getContentPane().add(jc_sexe);
		jc_sexe.setModel(new DefaultComboBoxModel<String>(new String[]{"Hombre","Mujer"}));
		
		
		
		
		
		jc_estado.setBounds(80, 240, 97, 29);
		this.getContentPane().add(jc_estado);
		jc_estado.setModel(new DefaultComboBoxModel<String>(new String[]{"Soltero","Casado","Viudo"}));
		









		//Eventos









		botonNeteja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtf_nombre.setText("");
				jtf_apellidos.setText("");
				jtf_dni.setText("");
				jtf_edad.setText("");
				
				

			}
		});






		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});




		botonAcep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registarPersona();
			}
		});
		
		
		
		

		botonConsultar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					verDatos.setVisible(true);

				}
		});







	}
	
	
	
	private boolean comprovadorTotal(){
		return ((!camposVacios())&&(dniValido())&&(edadValida()));
	}
	
	
	
	private boolean camposVacios(){
		//int contaldor = 0;
		if(Comprobador.estaVacio(jtf_nombre.getText(), jtf_apellidos.getText(), jtf_dni.getText(), jtf_edad.getText())){
			JOptionPane.showMessageDialog(this, "Hay campos vacios");
			return true;
		}
		return false;
	}
	
	
	
	private boolean dniValido(){
		if(Comprobador.esValidoDNI(jtf_dni.getText())){
			return true;
		}
		JOptionPane.showMessageDialog(this, "El DNI o NIE no son validos");
		return false;
	}
	
	
	private boolean edadValida(){
		if(Comprobador.esSoloNumero(jtf_edad.getText())){
			return true;
		}
		JOptionPane.showMessageDialog(this, "En la edad no van letras ni numeros de mas de 3 digitos");
		return false;
	}
	
	
	
	private void registarPersona(){

		if(comprovadorTotal()){
		
			//contador++;
			String nombre = jtf_nombre.getText();
			String apellidos = jtf_apellidos.getText();
			String id = jtf_dni.getText();
			int edad = Integer.parseInt(jtf_edad.getText());


			String sexo = jc_sexe.getSelectedItem().toString();
			String estado = jc_estado.getSelectedItem().toString();


	
			persona = new Persona(id, nombre, apellidos, edad, sexo, estado);
			

			
			if(muchasPersonas.registrar(persona)){
				JOptionPane.showMessageDialog(this, "Registro realizado con exito");
				verDatos.setPoolPersona(muchasPersonas);
				consultas();
				
				
				
				
				
			}
			else{
				JOptionPane.showMessageDialog(this, "El DNI o NIE ya existen");
			}



			jl_registro.setText("Numero de registros actuales: "+muchasPersonas.getLongitud());
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	private void consultas(){
		int cuentaHombres = verDatos.getPersonasSexo("Hombre");
		int cuentaMujeres = verDatos.getPersonasSexo("Mujer");
		int cuentaMenores = verDatos.getTotalMenores();
		int cuentaMenoresHombres = verDatos.getMenoresSexo("Hombre");
		int cuentaMenoresMujeres = verDatos.getMenoresSexo("Mujer");
		
		
		verDatos.setLabelHombre(cuentaHombres);
		verDatos.setLabelMujer(cuentaMujeres);
		verDatos.setLabelMenores(cuentaMenores);
		verDatos.setLabelMenoresHombre(cuentaMenoresHombres);
		verDatos.setLabelMenoresMujer(cuentaMenoresMujeres);
		verDatos.getMenoresNombreEdad();
		verDatos.getListaJubilados();

		
	}
	
	
	
	
	

















}
