package main;

import javax.swing.JOptionPane;

import controller.QtdDigController;

public class Principal {

	public static void main(String[] args) {
		QtdDigController qdc = new QtdDigController ();
		int num = Integer.parseInt(JOptionPane.showInputDialog("insira um número maior que 0!"));
		while (num < 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("insira um número maior que 0!"));
		}
		int cont = 1;
		int resultado = qdc.QuantidadeDig(num, cont);
		System.out.println(resultado);
	}

}
