package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.JTableHeader;

/**
 * Tema visual inspirado en los mockups de Figma de Gestión de Contactos.
 * No modifica datos, modelos ni eventos del controlador.
 * Compatible con la ventana creada con el diseñador de NetBeans.
 */
public final class TemaOscuro {

    public static final Color FONDO = new Color(0x171B21);
    public static final Color PANEL = new Color(0x252C35);
    public static final Color CAMPO = new Color(0x202732);
    public static final Color BORDE = new Color(0x424B57);
    public static final Color TEXTO = new Color(0xF2F4F7);
    public static final Color SECUNDARIO = new Color(0xB4BEC9);
    public static final Color AZUL = new Color(0x71A9DB);
    public static final Color ROJO = new Color(0xDC7777);

    private TemaOscuro() {
    }

    /** Ejecutar después de initComponents() y antes de crear el controlador. */
    public static void aplicar(JFrame ventana) {
        ventana.getContentPane().setBackground(FONDO);
        aplicarRecursivo(ventana.getContentPane());
        ventana.repaint();
    }

    private static void aplicarRecursivo(Component componente) {
        if (componente instanceof JPanel) {
            JPanel panel = (JPanel) componente;
            panel.setBackground(FONDO);
            panel.setForeground(TEXTO);
        }

        if (componente instanceof JLabel) {
            configurarEtiqueta((JLabel) componente);
        } else if (componente instanceof JButton) {
            configurarBoton((JButton) componente);
        } else if (componente instanceof JCheckBox) {
            JCheckBox check = (JCheckBox) componente;
            check.setText("Favorito".equalsIgnoreCase(check.getText())
                    || "CONTACTO FAVORITO".equalsIgnoreCase(check.getText())
                    ? "Favorito" : check.getText());
            check.setBackground(FONDO);
            check.setForeground(SECUNDARIO);
            check.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            check.setFocusPainted(false);
        } else if (componente instanceof JTextField) {
            configurarCampo((JTextField) componente);
        } else if (componente instanceof JComboBox) {
            JComboBox<?> combo = (JComboBox<?>) componente;
            combo.setBackground(CAMPO);
            combo.setForeground(TEXTO);
            combo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            combo.setBorder(BorderFactory.createLineBorder(BORDE));
        } else if (componente instanceof JTabbedPane) {
            JTabbedPane tabs = (JTabbedPane) componente;
            tabs.setBackground(PANEL);
            tabs.setForeground(TEXTO);
            tabs.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            if (tabs.getTabCount() > 0) tabs.setTitleAt(0, "Contactos");
            if (tabs.getTabCount() > 1) tabs.setTitleAt(1, "Estadísticas");
        } else if (componente instanceof JTable) {
            configurarTabla((JTable) componente);
        } else if (componente instanceof JScrollPane) {
            JScrollPane scroll = (JScrollPane) componente;
            scroll.setBackground(PANEL);
            scroll.getViewport().setBackground(PANEL);
            scroll.setBorder(BorderFactory.createLineBorder(BORDE));
        } else if (componente instanceof JProgressBar) {
            JProgressBar progreso = (JProgressBar) componente;
            progreso.setBackground(CAMPO);
            progreso.setForeground(AZUL);
            progreso.setFont(new Font("Segoe UI", Font.PLAIN, 11));
            progreso.setStringPainted(true);
            progreso.setBorderPainted(false);
        }

        if (componente instanceof Container) {
            for (Component hijo : ((Container) componente).getComponents()) {
                aplicarRecursivo(hijo);
            }
        }
    }

    private static void configurarEtiqueta(JLabel etiqueta) {
        String texto = etiqueta.getText();
        if (texto == null) texto = "";
        switch (texto) {
            case "NOMBRES": etiqueta.setText("Nombre"); break;
            case "TELEFONO": etiqueta.setText("Teléfono"); break;
            case "EMAIL": etiqueta.setText("Email"); break;
            case "CATEGORIA": etiqueta.setText("Categoría"); break;
            case "BUSCAR POR NOMBRE": etiqueta.setText("Buscar por nombre"); break;
            case "ESTADO DE CARGA": etiqueta.setText("Estado de carga"); break;
            case "RESUMEN DE CONTACTOS": etiqueta.setText("Resumen de Contactos"); break;
            default: break;
        }

        etiqueta.setForeground(SECUNDARIO);
        String actual = etiqueta.getText();
        if ("0".equals(actual)) {
            etiqueta.setForeground(TEXTO);
            etiqueta.setFont(new Font("Consolas", Font.BOLD, 26));
            etiqueta.setHorizontalAlignment(SwingConstants.LEFT);
        } else if ("Resumen de Contactos".equalsIgnoreCase(actual)) {
            etiqueta.setForeground(TEXTO);
            etiqueta.setFont(new Font("Consolas", Font.BOLD, 20));
        } else if (etiqueta.getFont() != null && etiqueta.getFont().isBold()) {
            etiqueta.setFont(new Font("Segoe UI", Font.BOLD, 13));
        } else {
            etiqueta.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        }
    }

    private static void configurarBoton(JButton boton) {
        String texto = boton.getText();
        if (texto == null) texto = "";
        String accion = texto.trim().toLowerCase();
        switch (accion) {
            case "agregar": boton.setText("Agregar"); break;
            case "modificar": boton.setText("Modificar"); break;
            case "eliminar": boton.setText("Eliminar"); break;
            case "exportar csv": boton.setText("Exportar CSV"); break;
            default: break;
        }

        boton.setUI(new BasicButtonUI());
        boton.setOpaque(true);
        boton.setContentAreaFilled(true);
        boton.setFocusPainted(false);
        boton.setBorder(new EmptyBorder(8, 13, 8, 13));
        boton.setFont(new Font("Segoe UI", Font.BOLD, 12));
        boton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        if ("agregar".equals(accion)) {
            boton.setBackground(AZUL);
            boton.setForeground(FONDO);
        } else if ("eliminar".equals(accion)) {
            boton.setBackground(ROJO);
            boton.setForeground(FONDO);
        } else {
            boton.setBackground(PANEL);
            boton.setForeground(TEXTO);
        }
    }

    private static void configurarCampo(JTextField campo) {
        campo.setBackground(CAMPO);
        campo.setForeground(TEXTO);
        campo.setCaretColor(TEXTO);
        campo.setSelectedTextColor(FONDO);
        campo.setSelectionColor(AZUL);
        campo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        campo.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(BORDE), new EmptyBorder(5, 9, 5, 9)));
    }

    private static void configurarTabla(JTable tabla) {
        tabla.setBackground(PANEL);
        tabla.setForeground(TEXTO);
        tabla.setSelectionBackground(new Color(0x34465A));
        tabla.setSelectionForeground(TEXTO);
        tabla.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        tabla.setRowHeight(28);
        tabla.setShowGrid(false);
        tabla.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabla.setFillsViewportHeight(true);
        JTableHeader cabecera = tabla.getTableHeader();
        if (cabecera != null) {
            cabecera.setBackground(CAMPO);
            cabecera.setForeground(TEXTO);
            cabecera.setFont(new Font("Consolas", Font.BOLD, 12));
            cabecera.setReorderingAllowed(false);
        }
    }
}
