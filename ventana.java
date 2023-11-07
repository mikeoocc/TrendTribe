package Interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.util.ArrayList;
import Tienda.*;

public class Ventana extends JFrame {
    public JPanel panel;
    private JPanel panelDesplegable;
    private Catalogo catalogo;
    
    public Ventana(Catalogo catalogo) {
    	
    	this.catalogo = catalogo;
    	
        setBounds(200, 20, 1500, 1000);
        setTitle("TrendTribe.es");
        this.getContentPane().setBackground(new Color(51, 153, 255)); // Azul claro
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
    }

    private void colocarPaneles() {
        panel = new JPanel();
        panel.setBackground(new Color(230, 230, 230)); // Gris claro
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        panelDesplegable = new JPanel();
        panelDesplegable.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 5)); // Apilamiento vertical
        panelDesplegable.setBounds(430, 80, 600, 100);
        panelDesplegable.setBackground(new Color(230, 230, 230)); // Gris claro
        panelDesplegable.setVisible(false);
        panel.add(panelDesplegable);
    }

    private void colocarEtiquetas() {
        // Etiqueta1
        JLabel etiqueta = new JLabel();
        etiqueta.setText("TrendTribe");
        etiqueta.setBounds(150, 30, 200, 50);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setForeground(new Color(51, 153, 255)); // Azul claro
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.white);
        etiqueta.setFont(new Font("Arial", Font.BOLD, 36)); // Fuente más grande
        panel.add(etiqueta);
    }

    private void colocarBotones() {
    	//Menú
    	JButton menuDesplegable = new JButton("Explora la variedad de estilos");
        menuDesplegable.setBounds(430, 30, 600, 50);
        menuDesplegable.setForeground(new Color(51, 153, 255)); // Azul claro
        menuDesplegable.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(menuDesplegable);
        
        menuDesplegable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (panelDesplegable.isVisible()) {
                    panelDesplegable.setVisible(false);
                } else {
                    panelDesplegable.setVisible(true);
                }
            }
        });

        // Agrega opciones al panel desplegable
        JButton modaHombre = new JButton("Moda Hombre");
        JButton modaMujer = new JButton("Moda Mujer");
        JButton invierno = new JButton("Invierno");
        JButton verano = new JButton("Verano");

        // Agrega los botones de opciones al panel desplegable
        panelDesplegable.add(modaHombre);
        panelDesplegable.add(modaMujer);
        panelDesplegable.add(invierno);
        panelDesplegable.add(verano);
/*
        // Agrega un MouseListener para mostrar/ocultar el panel desplegable al pasar el ratón sobre el botón principal
        menuDesplegable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                panelDesplegable.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panelDesplegable.setVisible(false);
            }
        });
*/
        // Configura ActionListener para los botones de opciones (puedes agregar acciones específicas según cada opción)
        modaHombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para "Moda Hombre"
                JOptionPane.showMessageDialog(null, "Has seleccionado Moda Hombre");
            }
        });

        modaMujer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para "Moda Mujer"
                JOptionPane.showMessageDialog(null, "Has seleccionado Moda Mujer");
            }
        });

        invierno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para "Invierno"
                JOptionPane.showMessageDialog(null, "Has seleccionado Invierno");
            }
        });

        verano.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para "Verano"
                JOptionPane.showMessageDialog(null, "Has seleccionado Verano");
            }
        });
        // Carrito
        JButton carrito = new JButton();
        carrito.setText("Carrito");
        carrito.setBounds(1250, 30, 100, 50);
        carrito.setForeground(new Color(51, 153, 255)); // Azul claro
        carrito.setFont(new Font("Arial", Font.BOLD, 24)); // Fuente más grande
        panel.add(carrito);
        
        // Usuario
        JButton usuario = new JButton();
        usuario.setText("Usuario");
        usuario.setBounds(1130, 30, 120, 50);
        usuario.setForeground(new Color(51, 153, 255)); // Azul claro
        usuario.setFont(new Font("Arial", Font.BOLD, 24)); // Fuente más grande
        panel.add(usuario);
		
		usuario.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        VentanaUsuario ventanaUsuario = new VentanaUsuario();
				ventanaUsuario.setVisible(true); // Abre la nueva ventana
		    }
		});
		
		//Buscador
		JButton buscador= new JButton();
		buscador.setBounds(1030,30,100,50);
		ImageIcon lupa = new ImageIcon("/TrendTribe/scr/Lupa.png");
		buscador.setIcon(new ImageIcon
				(lupa.getImage().getScaledInstance(buscador.getWidth(), buscador.getHeight(), Image.SCALE_SMOOTH)));
		buscador.setForeground(Color.BLUE);
		buscador.setFont(new Font("Arial", Font.BOLD, 24));
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
		
		
		//Ropa comprar en Portada
		// Ropa para comprar en Portada
		JButton ropa1 = new JButton();
		ropa1.setBounds(150, 200, 400, 300);
		ImageIcon imagenIcon1 = new ImageIcon(""); // Reemplaza con la ruta de tu imagen
		Image imagen1 = imagenIcon1.getImage().getScaledInstance(ropa1.getWidth(), ropa1.getHeight(), Image.SCALE_SMOOTH);
		ropa1.setIcon(new ImageIcon(imagen1));
		panel.add(ropa1);

		JButton ropa2 = new JButton();
		ropa2.setBounds(550, 200, 400, 300);
		ImageIcon imagenIcon2 = new ImageIcon(""); // Reemplaza con la ruta de tu imagen
		Image imagen2 = imagenIcon2.getImage().getScaledInstance(ropa2.getWidth(), ropa2.getHeight(), Image.SCALE_SMOOTH);
		ropa2.setIcon(new ImageIcon(imagen2));
		panel.add(ropa2);

		JButton ropa3 = new JButton();
		ropa3.setBounds(950, 200, 400, 300);
		ImageIcon imagenIcon3 = new ImageIcon(""); // Reemplaza con la ruta de tu imagen
		Image imagen3 = imagenIcon3.getImage().getScaledInstance(ropa3.getWidth(), ropa3.getHeight(), Image.SCALE_SMOOTH);
		ropa3.setIcon(new ImageIcon(imagen3));
		panel.add(ropa3);
		
		
		
	}

}
