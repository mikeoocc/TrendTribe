package Interfaz;

import java.awt.*;
import javax.swing.*;

import Tienda.*;

import java.util.ArrayList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Ventana extends JFrame{
	
	public JPanel panel;
	private Catalogo catalogo;
	
	public Ventana(Catalogo catalogo) {
		
		this.catalogo = catalogo;
		
		setBounds(200,20,1500,1000); //tamaño ventana y posición en pantalla
		setTitle("https://www.TrendTribe.es/home/"); //titulo
		this.getContentPane().setBackground(Color.gray);
		iniciarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);//cerrar
		
	}
	private void iniciarComponentes() {
		colocarPaneles();
		colocarEtiquetas();	
		colocarBotones();
	}
	private void colocarPaneles() {
		panel = new JPanel();
		panel.setBackground(Color.gray);
		panel.setLayout(null);
		this.getContentPane().add(panel);
	}
	private void colocarEtiquetas() {
		//etiqueta1
		JLabel etiqueta = new JLabel();
		etiqueta.setText("TrendTribe");
		etiqueta.setBounds(150,30,200,50);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setForeground(Color.BLUE);
		etiqueta.setOpaque(true);
		etiqueta.setBackground(Color.white);
		etiqueta.setFont(new Font("Arial",3,30));
		panel.add(etiqueta);
		
		//etiqueta2
		//JLabel etiqueta2 = new JLabel(new ImagenIcon());
		
	}
	private void colocarBotones() {
		//Carrito
		JButton carrito= new JButton();
		carrito.setText("Carrito");
		carrito.setBounds(1250,30,100,50);
		carrito.setForeground(Color.BLUE);
		carrito.setFont(new Font("arial", Font.BOLD, 20)); //
		panel.add(carrito);
		
		//Usuario
		JButton usuario = new JButton();
		usuario.setText("Usuario");
		usuario.setBounds(1130,30,120,50);
		usuario.setForeground(Color.BLUE);
		usuario.setFont(new Font("arial", Font.BOLD, 20)); //
		panel.add(usuario);
		
		//Buscador
		JButton buscador= new JButton("Busc");
		buscador.setBounds(1030,30,100,50);
		ImageIcon lupa = new ImageIcon("lupa.png");
		buscador.setIcon(new ImageIcon
				(lupa.getImage().getScaledInstance(buscador.getWidth(), buscador.getHeight(), Image.SCALE_SMOOTH)));
		buscador.setForeground(Color.BLUE);
		buscador.setFont(new Font("arial", Font.BOLD, 20)); //
		buscador.addActionListener(new ActionListener() {
		    
			@Override
		    public void actionPerformed(ActionEvent e) {
		    	String filtro = JOptionPane.showInputDialog(Ventana.this, "Buscador:", "", JOptionPane.PLAIN_MESSAGE);
		    	if (filtro != null && !filtro.isEmpty()) {
		    	    ArrayList<Producto> productosEncontrados = catalogo.buscarProductos(filtro);
		    	    if (!productosEncontrados.isEmpty()) {
		    	        // Mostrar los resultados en una nueva ventana
		    	        StringBuilder resultado = new StringBuilder("Resultados de la búsqueda:\n");
		    	        for (Producto producto : productosEncontrados) {
		    	            
		    	            resultado.append(producto.getNombre()).append(" - ").append(producto.getPrecio()).append("€").append("\n");
		    	        }
		    	        JOptionPane.showMessageDialog(Ventana.this, resultado.toString(), "", JOptionPane.INFORMATION_MESSAGE);
		    	    } else {
		    	        JOptionPane.showMessageDialog(Ventana.this, "No se encontraron productos para el término de búsqueda.", "Sin resultados", JOptionPane.INFORMATION_MESSAGE);
		    	    }
		    	}
		    }
		});
		
		panel.add(buscador);
		
		// Panel de busqueda
		//Mujer
		JButton modaMujer = new JButton();
		modaMujer.setText("Moda Mujer");
		modaMujer.setBounds(880,30,150,50);
		modaMujer.setForeground(Color.BLUE);
		modaMujer.setFont(new Font("arial", Font.BOLD, 20)); //
		panel.add(modaMujer);
		//Hombre
		JButton modaHombre = new JButton();
		modaHombre.setText("Moda Hombre");
		modaHombre.setBounds(730,30,150,50);
		modaHombre.setForeground(Color.BLUE);
		modaHombre.setFont(new Font("arial", Font.BOLD, 20)); //
		panel.add(modaHombre);
		//Invierno
		JButton Invierno = new JButton();
		Invierno.setText("Invierno");
		Invierno.setBounds(580,30,150,50);
		Invierno.setForeground(Color.BLUE);
		Invierno.setFont(new Font("arial", Font.BOLD, 20)); //
		panel.add(Invierno);
		//Verano
		JButton Verano = new JButton();
		Verano.setText("Verano");
		Verano.setBounds(430,30,150,50);
		Verano.setForeground(Color.BLUE);
		Verano.setFont(new Font("arial", Font.BOLD, 20)); //
		panel.add(Verano);
		
		
		//Ropa comprar en Portada
		JButton ropa1 = new JButton();
		ropa1.setBounds(150,200,400,300);
		ropa1.setForeground(Color.BLUE);
		ropa1.setFont(new Font("arial", Font.BOLD, 20)); //
		panel.add(ropa1);
		JButton ropa2 = new JButton();
		ropa2.setBounds(550,200,400,300);
		ropa2.setForeground(Color.BLUE);
		ropa2.setFont(new Font("arial", Font.BOLD, 20)); //
		panel.add(ropa2);
		JButton ropa3 = new JButton();
		ropa3.setBounds(950,200,400,300);
		ropa3.setForeground(Color.BLUE);
		ropa3.setFont(new Font("arial", Font.BOLD, 20)); //
		panel.add(ropa3);
		
		
		
	}

}
