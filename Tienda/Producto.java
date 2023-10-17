package Tienda;

public class Producto {

	private String nombre;
	private double precio;
	private String categoria;
	private String marca;
	private int cantidad;
	private String tipo;
	
	public Producto(String nombre,  double precio, String categoria, String marca, int cantidad,
			String tipo) {
		
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.marca = marca;
        this.cantidad = cantidad;
        this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	/*
	 * obtenerDetalles();
	 * actualizarStock();
	 */
}
