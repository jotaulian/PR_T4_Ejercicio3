package es.studium.Tema4.Ejercicio3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

public class ejercicio3 extends Frame implements WindowListener, ItemListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	Checkbox chkCorrer = new Checkbox("Correr");
	Checkbox chkNadar = new Checkbox("Nadar");
	Checkbox chkAndar = new Checkbox("Andar");
	Checkbox chkLeer = new Checkbox("Leer");
	Checkbox chkCine = new Checkbox("Ir al Cine");
	Checkbox chkBailar = new Checkbox("Bailar");
	Checkbox chkFutbol = new Checkbox("Fútbol");
	Checkbox chkTenis = new Checkbox("Tenis");
	Checkbox chkBaloncesto = new Checkbox("Baloncesto");
	Checkbox chkDdv = new Checkbox("Deportes de Vela");
	Button btn = new Button("Comprobar");
	Checkbox[] deportes = {chkCorrer, chkNadar, chkAndar, chkLeer,chkCine, chkBailar, chkFutbol, chkTenis, chkBaloncesto, chkDdv};
	ArrayList<String> deportesElegidos = new ArrayList<String>();
	
	public ejercicio3() {
		setLayout(new FlowLayout());
		setTitle("Aficciones");
		for (Checkbox deporte : deportes) {
			deporte.addItemListener(this);
		}
		add(chkCorrer);
		add(chkNadar);
		add(chkAndar);
		add(chkLeer);
		add(chkCine);
		add(chkBailar);
		add(chkFutbol);
		add(chkTenis);
		add(chkBaloncesto);
		add(chkDdv);
		
		btn.addActionListener(this);
		add(btn);
		
		addWindowListener(this);
		setSize(300,150);
		setBackground(Color.lightGray);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	//Item Listener Method
		public void itemStateChanged(ItemEvent ie)
		{
			deportesElegidos.add((String) ie.getItem());
			
		}
		
	//Action Listener Method
		public void actionPerformed(ActionEvent ae)
		{
			for (String deporte : deportesElegidos) {
			System.out.println(deporte);
			}
		}
	
	//WindowListener methods
	public void windowActivated(WindowEvent arg0){}
	public void windowClosed(WindowEvent arg0){}
	public void windowClosing(WindowEvent arg0){
			System.exit(0);
		}
	public void windowDeactivated(WindowEvent arg0){}
	public void windowDeiconified(WindowEvent arg0){}
	public void windowIconified(WindowEvent arg0){}
	public void windowOpened(WindowEvent arg0){}
	
	//Main method
	public static void main(String[] args)
	{
		new ejercicio3();
	}

}
