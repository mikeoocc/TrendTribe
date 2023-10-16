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
		
		System.out.print("Buscador: ");
		buscador = scanner.next();
		
		productosEncontrados = catalogo.buscarProductos(buscador, buscador);
		
				
		for(Producto proc:productosEncontrados) {
			System.out.println("Nombre: " + proc.getNombre());
		}
		
	}
}
