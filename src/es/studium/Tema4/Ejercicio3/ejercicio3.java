package es.studium.Tema4.Ejercicio3;

import java.awt.*;

public class ejercicio3 extends Frame
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
	
	public ejercicio3() {
		setLayout(new FlowLayout());
		setTitle("Aficciones");
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
		add(btn);
		setSize(300,150);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new ejercicio3();
	}

}
