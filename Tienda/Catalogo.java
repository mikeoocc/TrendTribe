package Tienda;

import java.util.ArrayList;

public class Catalogo {

	private ArrayList<Producto>listaProductos;
	
	public Catalogo() {
		listaProductos = new ArrayList<Producto>();
		listaProductos.add(new Ropa("CamisetaJordanA2", 12.99, "Camisetas", "NIKE", 5, "Ropa", "M", "Rojo"));
		listaProductos.add(new Ropa("Vaqueros", 16.99, "Pantalones", "EL CORTE INGLES", 10, "Ropa", "XL", "Azul"));
		listaProductos.add(new Zapatos("AdidasZero", 61.99, "Deporte", "ADIDAS", 2, "Zapatos", "Deportivas", 46));
		listaProductos.add(new Zapatos("NikeAir", 79.99, "Moda", "NIKE", 6, "Zapatos", "Vestir", 40));
	}
	
	/**
	 * Recorre un vector de productos y comprueba con la funcion cumpleCriterios() si lo que busca
	 * el usuario se encuentra dentro de dicho vector. Si lo encuentra mete el producto dentro de
	 * otro vector. Al final, este ultimo vector se retorna.
	 * @param tipo
	 * @param nombre
	 * @return devuelve los productos encontrados
	 */
	 public ArrayList<Producto> buscarProductos(String tipo, String nombre){
		 
		 ArrayList<Producto> productosEncontrados = new ArrayList<>();
		 
		    for (Producto producto : listaProductos) {
		        if (cumpleCriterios(producto, tipo, nombre)) {
		            productosEncontrados.add(producto);
		        }
		    }
		    
		    return productosEncontrados;
		 
	 }
	 
	 /**
	  * La funcion toma como parametros el tipo y el nombre del producto a buscar, y un producto
	  * del vector de la funcion buscarProductos(). cumpleCriterios() comprueba si lo que quiere
	  * buscar el usuario coincide con alguno de los productos dentro del vector mencionado.
	  * 
	  * @param producto
	  * @param tipo
	  * @param nombre
	  * @return devuelve si cumpleTipo o nombre
	  */
	 
	 private boolean cumpleCriterios(Producto producto, String tipo, String nombre) {
		 boolean cumpleTipo = tipo == null || tipo.isEmpty() || producto.getTipo().equalsIgnoreCase(tipo);
		 boolean cumpleNombre = nombre == null || nombre.isEmpty() || producto.getNombre().equalsIgnoreCase(nombre);
		 return cumpleTipo || cumpleNombre;
	 }

	
	/*
	 * añadirProducto();
	 * eliminarProducto();
	 */
}
