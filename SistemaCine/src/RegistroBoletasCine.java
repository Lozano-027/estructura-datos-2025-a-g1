import javax.swing.*;
import java.awt.*;

public class RegistroBoletasCine extends JFrame {

    public RegistroBoletasCine() {
        setTitle("Registro para Boletas de Cine");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar ventana

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Etiquetas y campos de texto
        JLabel lblCedula = new JLabel("Cédula:");
        lblCedula.setBounds(20, 20, 80, 25);
        JTextField txtCedula = new JTextField();
        txtCedula.setBounds(100, 20, 200, 25);

        JLabel lblNombres = new JLabel("Nombres:");
        lblNombres.setBounds(20, 50, 80, 25);
        JTextField txtNombres = new JTextField();
        txtNombres.setBounds(100, 50, 200, 25);

        JLabel lblApellidos = new JLabel("Apellidos:");
        lblApellidos.setBounds(20, 80, 80, 25);
        JTextField txtApellidos = new JTextField();
        txtApellidos.setBounds(100, 80, 200, 25);

        // Género
        JLabel lblGenero = new JLabel("Género:");
        lblGenero.setBounds(20, 110, 80, 25);
        JCheckBox chkFemenino = new JCheckBox("Femenino");
        chkFemenino.setBounds(100, 110, 100, 25);
        JCheckBox chkMasculino = new JCheckBox("Masculino");
        chkMasculino.setBounds(100, 135, 100, 25);
        JCheckBox chkNoBinario = new JCheckBox("No Binario");
        chkNoBinario.setBounds(200, 110, 100, 25);
        JCheckBox chkOtro = new JCheckBox("Otro");
        chkOtro.setBounds(200, 135, 100, 25);

        // Boleta
        JLabel lblBoleta = new JLabel("Boleta:");
        lblBoleta.setBounds(20, 170, 80, 25);
        JComboBox<String> cbBoleta = new JComboBox<>(new String[]{"Seleccione", "General", "VIP"});
        cbBoleta.setBounds(100, 170, 200, 25);

        JLabel lblValorBoleta = new JLabel("Valor Boleta:");
        lblValorBoleta.setBounds(20, 200, 80, 25);
        JTextField txtValorBoleta = new JTextField();
        txtValorBoleta.setBounds(100, 200, 200, 25);

        JLabel lblCantBoletas = new JLabel("Cant Boletas:");
        lblCantBoletas.setBounds(20, 230, 80, 25);
        JComboBox<Integer> cbCantBoletas = new JComboBox<>(new Integer[]{1, 2, 3, 4, 5});
        cbCantBoletas.setBounds(100, 230, 200, 25);

        JLabel lblValorTotal = new JLabel("Valor Total:");
        lblValorTotal.setBounds(20, 260, 80, 25);
        JTextField txtValorTotal = new JTextField();
        txtValorTotal.setBounds(100, 260, 200, 25);
        txtValorTotal.setEditable(false);

        // Tabla
        String[] columnas = {"Cédula", "Nombres y Apellidos", "Género"};
        Object[][] datos = {};
        JTable tabla = new JTable(datos, columnas);
        JScrollPane scrollTabla = new JScrollPane(tabla);
        scrollTabla.setBounds(330, 40, 420, 100);
        JLabel lblTabla = new JLabel("Listado de Personas con Boletas");
        lblTabla.setBounds(430, 10, 250, 25);

        // Observaciones
        JLabel lblObservaciones = new JLabel("Observaciones");
        lblObservaciones.setBounds(330, 150, 120, 25);
        JTextArea txtObservaciones = new JTextArea();
        JScrollPane scrollObs = new JScrollPane(txtObservaciones);
        scrollObs.setBounds(330, 180, 420, 150);

        // Botones
        JButton btnComprar = new JButton("Comprar");
        btnComprar.setBounds(50, 320, 100, 30);
        JButton btnVender = new JButton("Vender");
        btnVender.setBounds(200, 320, 100, 30);
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(330, 340, 100, 30);
        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(460, 340, 100, 30);

        // Añadir componentes al panel
        panel.add(lblCedula); panel.add(txtCedula);
        panel.add(lblNombres); panel.add(txtNombres);
        panel.add(lblApellidos); panel.add(txtApellidos);
        panel.add(lblGenero); panel.add(chkFemenino); panel.add(chkMasculino);
        panel.add(chkNoBinario); panel.add(chkOtro);
        panel.add(lblBoleta); panel.add(cbBoleta);
        panel.add(lblValorBoleta); panel.add(txtValorBoleta);
        panel.add(lblCantBoletas); panel.add(cbCantBoletas);
        panel.add(lblValorTotal); panel.add(txtValorTotal);
        panel.add(lblTabla); panel.add(scrollTabla);
        panel.add(lblObservaciones); panel.add(scrollObs);
        panel.add(btnVender); panel.add(btnCancelar); panel.add(btnLimpiar); panel.add(btnComprar);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RegistroBoletasCine().setVisible(true);
        });
    }
}
