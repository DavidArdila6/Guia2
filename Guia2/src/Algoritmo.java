import java.util.Scanner;

import javax.swing.JOptionPane;

import java.text.NumberFormat;

public class Algoritmo {

	static final double comision = 0.10;
	
	public static void main(String[] args) {
		
		int numero;
		numero = Integer.parseInt (JOptionPane.showInputDialog("Digite un número: "));
		 
		while (numero != 0) {
			if(numero %2 == 0) {
				System.out.println("El número "+numero+"es PAR");
		}
			else {
				System.out.println("El número "+numero+"es IMPAR");
			}
			numero = Integer.parseInt (JOptionPane.showInputDialog("Digite otro número: "));
	}

}
}
