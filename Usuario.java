package Usuario;
import Transacciones.Carrito;
import java.util.ArrayList;
import Transacciones.Pago;

/**
 * Esta clase almacena la informacion asociada al propio usuario (nombre, id, contrasenia...)
 */

public class Usuario {

	private String idUsuario;
	private String nombre;
	private String pass;
	private double saldo;
	private Carrito carrito;
	private ArrayList<Pago> historial;
	
	/**
	 * Inicializa la instancia de Usuario, creando un objeto de Carrito e inicializando
	 * un vector que recoge la informacion de los pagos. A excepcion del carrito y el
	 * historial, se toman como parametros todos los atributos de Usuario.
	 * 
	 * @param idUsuario : identificador
	 * @param nombre
	 * @param pass : contrasenia
	 * @param saldo : dinero disponible
	 */
	
	public Usuario (String idUsuario, String nombre, String pass, double saldo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.pass = pass;
        this.saldo = saldo;
        this.carrito = new Carrito();
        this.historial = new ArrayList<>();
	}
	
	/*
	public void agregarAlCarrito();
	public void generarSaldo();
	public void verHistorialDeCompras();
	*/
}
