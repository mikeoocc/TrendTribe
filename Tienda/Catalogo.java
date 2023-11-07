package Tienda;

import java.util.ArrayList;
import java.sql.*;

/**
 * Representa un catalogo de productos que se obtienen de una base de datos MySQL.
 * Los productos se almacenan en una lista llamada listaProductos.
 */

public class Catalogo {

	private ArrayList<Producto>listaProductos;
	private Connection conex;
	
	public Catalogo() {
		
		listaProductos = new ArrayList<Producto>();
        
		// Información de conexión a la base de datos MySQL
		String url = "jdbc:mysql://localhost:3306/TrendTribe";
        String usuario = "root";
        String pass = "19102023";
        
        try {
            conex = DriverManager.getConnection(url, usuario, pass);

            // Consulta SQL para obtener los productos de la base de datos
            String sql = "SELECT * FROM Productos";
            PreparedStatement preparedStatement = conex.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

         // Recorre los resultados de la consulta y crea objetos Producto
            while (resultSet.next()) {
                String tipo = resultSet.getString("tipo");
                Producto producto = null;

                if ("Ropa".equals(tipo)) {
                    producto = new Ropa(
                        resultSet.getString("nombre"),
                        resultSet.getDouble("precio"),
                        resultSet.getString("categoria"),
                        resultSet.getString("marca"),
                        resultSet.getInt("cantidad"),
                        resultSet.getString("tipo"),
                        resultSet.getString("talla"),
                        resultSet.getString("color")
                    );
                } 
                
                else if ("Zapatos".equals(tipo)) {
                    producto = new Zapatos(
                        resultSet.getString("nombre"),
                        resultSet.getDouble("precio"),
                        resultSet.getString("categoria"),
                        resultSet.getString("marca"),
                        resultSet.getInt("cantidad"),
                        resultSet.getString("tipo"),
                        resultSet.getString("estilo"),
                        resultSet.getInt("numeroPie")
                    ); 
                }

                listaProductos.add(producto);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        } finally {
            // Cierra la conexión a la base de datos
            
        	try {
                if (conex != null) {
                    conex.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        
        }
        
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
	 
	 public ArrayList<Producto>getProductos() {
		 return listaProductos;
	 }

	/*
	 * añadirProducto();
	 * eliminarProducto();
	 */
}
