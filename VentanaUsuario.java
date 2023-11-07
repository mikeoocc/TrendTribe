package ventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class VentanaUsuario extends JFrame {
    private JPanel panel;
    private JTextField campoUsuario;
    private JPasswordField campoContraseña;

    public VentanaUsuario() {
        setBounds(500, 20, 400, 600); // Tamaño ventana y posición en pantalla
        setTitle("Iniciar Sesión - TrendTribe.es"); // Título
        getContentPane().setBackground(Color.LIGHT_GRAY);
        iniciarComponentes();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cerrar la ventana de inicio de sesión sin salir de la aplicación
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarEtiquetas();
        colocarCamposDeTexto();
        colocarBotones();
    }

    private void colocarPaneles() {
        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);
        getContentPane().add(panel);
    }

    private void colocarEtiquetas() {
        // Etiqueta Trend Tribe
        JLabel etiqueta = new JLabel("TrendTribe");
        etiqueta.setBounds(150, 30, 200, 50);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setForeground(Color.BLUE);
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.WHITE);
        etiqueta.setFont(new Font("Arial", Font.BOLD, 30));
        panel.add(etiqueta);
    }

    private void colocarCamposDeTexto() {
        // Campo de usuario
        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setBounds(50, 100, 100, 30);
        panel.add(usuarioLabel);

        campoUsuario = new JTextField();
        campoUsuario.setBounds(150, 100, 200, 30);
        panel.add(campoUsuario);

        // Campo de contraseña
        JLabel contraseñaLabel = new JLabel("Contraseña:");
        contraseñaLabel.setBounds(50, 150, 100, 30);
        panel.add(contraseñaLabel);

        campoContraseña = new JPasswordField();
        campoContraseña.setBounds(150, 150, 200, 30);
        panel.add(campoContraseña);
    }

    private void colocarBotones() {
        // Botón de inicio de sesión
        JButton botonIniciarSesion = new JButton("Iniciar Sesión");
        botonIniciarSesion.setBounds(150, 200, 200, 40);
        botonIniciarSesion.setForeground(Color.BLUE);
        botonIniciarSesion.setBackground(Color.WHITE);
        botonIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                char[] contraseña = campoContraseña.getPassword();
                // Aquí puedes verificar las credenciales ingresadas y tomar la acción adecuada
                // Por ejemplo, mostrar un mensaje de éxito o error
                if (usuario.equals("usuario") && new String(contraseña).equals("contraseña")) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión fallido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        panel.add(botonIniciarSesion);
        JButton botonRegistro = new JButton("Registrarse");
        botonRegistro.setBounds(150, 250, 200, 40);
        botonRegistro.setForeground(Color.BLUE);
        botonRegistro.setBackground(Color.GREEN);
        botonRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaRegistro ventanaRegistro = new VentanaRegistro();
                ventanaRegistro.setVisible(true);
            }
        });
        panel.add(botonRegistro);
    }
    
    }
