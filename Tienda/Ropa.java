package Tienda;

public class Ropa extends Producto{

	private String talla;
	private String color;
	
	public Ropa(String nombre,  double precio, String categoria, String marca, int cantidad,
			String tipo, String talla, String color) {
		
		super(nombre, precio, categoria, marca, cantidad, tipo);
		tipo = "Ropa";
        this.talla = talla;
        this.color = color;
		
	}
	
	/*
	 * obtenerDetalles();
	 * actualizarStock();
	 */
}
