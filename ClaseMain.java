package Main;
import Tienda.*;
import Usuario.*;
import Transacciones.*;
import java.util.Scanner;

import Interfaz.Ventana;

import java.util.ArrayList;

public class ClaseMain {

	public static void main(String [] args) {
		
		Catalogo catalogo = new Catalogo();
		
		Ventana v1 = new Ventana(catalogo);
		v1.setVisible(true);
		
		/*

		Scanner scanner = new Scanner(System.in);
		String buscador;
		
		ArrayList<Producto> productosEncontrados = new ArrayList<Producto>();
				
		System.out.println();

		System.out.print(" Buscador: ");
		buscador = scanner.next();
		
		System.out.println();
		
		productosEncontrados = catalogo.buscarProductos(buscador);
		
		if(productosEncontrados.size()==0) {
			System.out.print("No se ha encontrado ese producto. . .");
		}
		else {
			for(Producto proc:productosEncontrados) {
				System.out.println(" - " + proc.getNombre() + ": " + proc.getPrecio() + " €");
			}
		}
		*/
	}
}
