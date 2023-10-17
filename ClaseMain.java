package Main;
import Tienda.*;
import Usuario.*;
import Transacciones.*;
import java.util.Scanner;
import java.util.ArrayList;

public class ClaseMain {

	public static void main(String [] args) {
		
		Catalogo catalogo = new Catalogo();
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
		
	}
}
