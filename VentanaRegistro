package ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRegistro extends JFrame {
    private JPanel panel;
    private JTextField campoNombre;
    private JTextField campoContraseña;
    private JTextField campoCorreo;
    private JTextField campoTelefono;
    private JTextField campoDireccion;
    private JTextField campoUsuario;

    public VentanaRegistro() {
        setBounds(500, 20, 400, 600);
        setTitle("Registrarse - TrendTribe.es");
        getContentPane().setBackground(new Color(173, 216, 230)); // Fondo azul claro
        iniciarComponentes();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarEtiquetas();
        colocarCamposDeTexto();
        colocarBotonRegistrarse();
    }

    private void colocarPaneles() {
        panel = new JPanel();
        panel.setBackground(new Color(173, 216, 230)); // Fondo azul claro
        panel.setLayout(null);
        getContentPane().add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    }

    private void colocarEtiquetas() {
        JLabel etiqueta = new JLabel("TrendTribe - Registro");
        etiqueta.setBounds(0, 30, 400, 50);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setForeground(new Color(0, 51, 102)); // Azul oscuro
        etiqueta.setFont(new Font("Verdana", Font.BOLD, 20)); // Fuente elegante
        panel.add(etiqueta);
    }

    private void colocarCamposDeTexto() {
        // Campos de registro
        // Nombre y Apellidos
        JLabel nombre = new JLabel("Nombre y apellidos: ");
        nombre.setBounds(10, 100, 200, 30);
        nombre.setForeground(new Color(0, 51, 102)); // Azul oscuro
        panel.add(nombre);
        campoNombre = new JTextField();
        campoNombre.setBounds(150, 100, 200, 30);
        panel.add(campoNombre);

        // Contraseña
        JLabel contraseña = new JLabel("Contraseña: ");
        contraseña.setBounds(10, 150, 200, 30);
        contraseña.setForeground(new Color(0, 51, 102)); // Azul oscuro
        panel.add(contraseña);
        campoContraseña = new JTextField();
        campoContraseña.setBounds(150, 150, 200, 30);
        panel.add(campoContraseña);

        // Nombre de Usuario
        JLabel nombreUser = new JLabel("Nombre de Usuario: ");
        nombreUser.setBounds(10, 200, 200, 30);
        nombreUser.setForeground(new Color(0, 51, 102)); // Azul oscuro
        panel.add(nombreUser);
        campoUsuario = new JTextField();
        campoUsuario.setBounds(150, 200, 200, 30);
        panel.add(campoUsuario);

        // Correo
        JLabel correo = new JLabel("Correo: ");
        correo.setBounds(10, 250, 200, 30);
        correo.setForeground(new Color(0, 51, 102)); // Azul oscuro
        panel.add(correo);
        campoCorreo = new JTextField();
        campoCorreo.setBounds(150, 250, 200, 30);
        panel.add(campoCorreo);

        // Teléfono
        JLabel telefono = new JLabel("Teléfono: ");
        telefono.setBounds(10, 300, 200, 30);
        telefono.setForeground(new Color(0, 51, 102)); // Azul oscuro
        panel.add(telefono);
        campoTelefono = new JTextField();
        campoTelefono.setBounds(150, 300, 200, 30);
        panel.add(campoTelefono);

        // Dirección
        JLabel direccion = new JLabel("Dirección: ");
        direccion.setBounds(10, 350, 200, 30);
        direccion.setForeground(new Color(0, 51, 102)); // Azul oscuro
        panel.add(direccion);
        campoDireccion = new JTextField();
        campoDireccion.setBounds(150, 350, 200, 30);
        panel.add(campoDireccion);
    }

    private void colocarBotonRegistrarse() {
        JButton botonRegistrarse = new JButton("Registrarse");
        botonRegistrarse.setBounds(150, 400, 200, 40);
        botonRegistrarse.setForeground(new Color(0, 51, 102)); // Azul oscuro
        botonRegistrarse.setBackground(Color.WHITE);
        botonRegistrarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes realizar el proceso de registro, recopilando los datos de los campos
                // y realizando la validación correspondiente
                String nombre = campoNombre.getText();
                String apellido = campoContraseña.getText();
                String correo = campoCorreo.getText();
                String telefono = campoTelefono.getText();
                String direccion = campoDireccion.getText();
                String usuario = campoUsuario.getText();
                // Realizar acciones de registro, por ejemplo, guardar en una base de datos
                // Luego, puedes mostrar un mensaje de registro exitoso
                JOptionPane.showMessageDialog(null, "Registro exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                // Cierra la ventana de registro
                dispose();
            }
        });
        panel.add(botonRegistrarse);
    }
}
