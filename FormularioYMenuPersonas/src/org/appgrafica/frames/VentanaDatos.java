package org.appgrafica.frames;



import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.appgrafica.modelo.Persona;
import org.appgrafica.modelo.PoolPersona;

public class VentanaDatos extends JFrame{
	/**
	 * VentanaDatos es la ventana que muestra datos que se introdujeron
	 * 
	 *  
	 */
	
	
	
	
	//Strings
	private String hombres = "Hombres: ";
	private String mujeres = "Mujeres: ";
	private String menores = "Nº menores de edad: ";
	private String menoresHombres = "Menores Hombres: ";
	private String menoresMujeres = "Menores Mujeres: ";
	
	
	
	
	
	
	
	
	//lables
	
	private JPanel contentPane = new JPanel();
	private JLabel jl_informacion = new JLabel("Información de los registros:");
	private JLabel jl_hombres = new JLabel(hombres);
	private JLabel jl_mujeres = new JLabel(mujeres);
	private JLabel jl_menores = new JLabel(menores);
	private JLabel jl_menores_hombres = new JLabel(menoresHombres);
	private JLabel jl_menores_mujeres = new JLabel(menoresMujeres);
	
	
	private JLabel jl_inf_menores = new JLabel("Nombre y edad de los menores:");

	
	
	private JComboBox<String> jc_registrosMenores = new JComboBox<>();
	
	

	private JLabel jl_inf_jubilados = new JLabel("Nombre y sexo de +67:");
	
	private JComboBox<String> jc_registrosJubilados = new JComboBox<>();

	
	
	
	
	
	
	
	
	//pesona y poolpersona
		
	private PoolPersona gente;
		
	
	
	public VentanaDatos() {
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	private void jbInit() throws Exception {
		


		
		

		this.setVisible(false);
		this.setResizable(false);

		this.setBounds(100, 100, 620, 200);




		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(null);
		this.setContentPane(contentPane);


		
		
		
		//labels
		jl_informacion.setBounds(11, 40, 170, 29);
		this.getContentPane().add(jl_informacion);
		
		
		
		
		jl_hombres.setBounds(11, 60, 97, 29);
		this.getContentPane().add(jl_hombres);
		
		
		jl_mujeres.setBounds(110, 60, 97, 29);
		this.getContentPane().add(jl_mujeres);
		

		
		
		jl_menores.setBounds(11, 80, 150, 29);
		this.getContentPane().add(jl_menores);
		
		
		jl_menores_hombres.setBounds(11, 100, 150, 29);
		this.getContentPane().add(jl_menores_hombres);
		
		jl_menores_mujeres.setBounds(11, 120, 150, 29);
		this.getContentPane().add(jl_menores_mujeres);
		
		
		
		jl_inf_menores.setBounds(300, 40, 300, 29);
		this.getContentPane().add(jl_inf_menores);
		
		
		
		jl_inf_jubilados.setBounds(300, 100, 300, 29);
		this.getContentPane().add(jl_inf_jubilados);
		
		
		

		//combobox
		
		jc_registrosMenores.setBounds(300, 60, 200, 29);
		this.getContentPane().add(jc_registrosMenores);
		jc_registrosMenores.setEditable(false);
		jc_registrosMenores.addItem("Lista de menores");
		
		
		jc_registrosJubilados.setBounds(300, 120, 200, 29);
		this.getContentPane().add(jc_registrosJubilados);
		jc_registrosJubilados.setEditable(false);
		jc_registrosJubilados.addItem("Lista de jubilados +67");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public void setLabelHombre(int datos){
		jl_hombres.setText(hombres+datos);
	}
	
	public void setLabelMujer(int datos){
		jl_mujeres.setText(mujeres+datos);
	}
	
	
	public void setLabelMenores(int datos){
		jl_menores.setText(menores+datos);
	}
	
	public void setLabelMenoresHombre(int datos){
		jl_menores_hombres.setText(menoresHombres+datos);
	}
	
	public void setLabelMenoresMujer(int datos){
		jl_menores_mujeres.setText(menoresMujeres+datos);
	}
	
	
	

	
	public void setPoolPersona(PoolPersona muchasPersonas){
		this.gente = muchasPersonas;
	}
	
	
	
	
	
	
	
	public int getPersonasSexo(String sexo){
		return this.cuentaPersonasSexo(sexo);
	}
	
	
	private int cuentaPersonasSexo(String sexo){
		int contador =0;
		for(Persona persona : this.gente.getPoolPesronas()){
			if (persona.getSexo().equals(sexo)){
				contador++;
			}
		}
		return contador;
	}
	
	
	
	
	
	

	
	public int getMenoresSexo(String sexo){
		return this.cuentaMenotesSexo(sexo);
	}
	
	
	private int cuentaMenotesSexo(String sexo){
		int contador =0;
		for(Persona persona : this.gente.getPoolPesronas()){
			if ((persona.getSexo().equals(sexo))&&(persona.getEdad() < 18)){
				contador++;
			}
		}
		return contador;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	public int getTotalMenores(){
		return this.cuentaMenores();
	}
	
	
	private int cuentaMenores(){
		int contador =0;
		for(Persona persona : this.gente.getPoolPesronas()){
			if (persona.getEdad() < 18){
				contador++;
			}
		}
		return contador;
	}
	
	
	

	
	public void getMenoresNombreEdad(){
		menoresNombreEdad();
	}
	
	
	



	private void menoresNombreEdad(){

		for(Persona persona : this.gente.getPoolPesronas()){
			if (persona.getEdad() < 18){
				jc_registrosMenores.addItem("Nombre: "+persona.getNombre()+" Edad: "+persona.getEdad());
			}

		}
	}

	
	
	
	
	

	public void getListaJubilados(){
		listarJubilados();
	}
	
	
	private void listarJubilados(){

		for(Persona persona : this.gente.getPoolPesronas()){
			if (persona.getEdad() > 67){
				jc_registrosJubilados.addItem("Nombre: "+persona.getNombre()+" Sexo: "+persona.getSexo());
			}

		}
	}
	
	
	
	
	
	
	
	
	
	
}
