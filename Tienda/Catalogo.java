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
	 * @param filtro
	 * @return devuelve los productos encontrados
	 */
	 
	public ArrayList<Producto> buscarProductos(String filtro){
		 
		 ArrayList<Producto> productosEncontrados = new ArrayList<>();
		 
		 for (Producto producto : listaProductos) {
		 	if (cumpleCriterios(producto, filtro)) {
		         	productosEncontrados.add(producto);
		        }
		  }
		    
		  return productosEncontrados;
		 
	 }
	 
	/**
	 * La funcion toma como parametros una variable para filtrar y un producto del vector
	 * en buscarProductos(). cumpleCriterios() comprueba si lo que quiere buscar el usuario
	 * coincide con alguno de los productos dentro del vector mencionado.
	 * 
	 * @param producto
	 * @param filtro
	 * @return
	 */

	 private boolean cumpleCriterios(Producto producto, String filtro) {
		    boolean cumpleNombre = producto.getNombre().equalsIgnoreCase(filtro);
		    boolean cumpleTipo = producto.getTipo().equalsIgnoreCase(filtro);
		    return cumpleNombre || cumpleTipo;
	 }

	/*
	 * añadirProducto();
	 * eliminarProducto();
	 */
}
