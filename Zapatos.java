package Tienda;

public class Zapatos extends Producto{

	private int numeroPie;
	private String estilo;
	
	public Zapatos(String nombre,  double precio, String categoria, String marca, int cantidad,
			String tipo, String estilo, int numeroPie) {
		
		super(nombre, precio, categoria, marca, cantidad, tipo);
		tipo = "Zapatos";
        this.numeroPie = numeroPie;
        this.estilo = estilo;
	}	
	/*
	 * obtenerDetalles();
	 * actualizarStock();
	 */
}
