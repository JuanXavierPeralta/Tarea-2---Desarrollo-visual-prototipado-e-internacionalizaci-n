package vista;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.AbstractBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicPanelUI;
import javax.swing.plaf.basic.BasicProgressBarUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.plaf.basic.BasicTextFieldUI;

/**
 * Acabado visual de los mockups, aplicado DESPUES de configurarNuevaDistribucion().
 * No crea ni reemplaza modelos o componentes funcionales.
 */
public final class AcabadoVisual {
    private static final Color FONDO = TemaOscuro.FONDO;
    private static final Color PANEL = TemaOscuro.PANEL;
    private static final Color CAMPO = TemaOscuro.CAMPO;
    private static final Color BORDE = TemaOscuro.BORDE;
    private static final Color TEXTO = TemaOscuro.TEXTO;
    private static final Color SEC = TemaOscuro.SECUNDARIO;
    private static final Color AZUL = TemaOscuro.AZUL;
    private static final Color ROJO = TemaOscuro.ROJO;
    private static final Color BOTON_SECUNDARIO = new Color(0x354354);
    private static final Color BOTON_HOVER = new Color(0x475B72);
    private static final int RADIO = 12;

    private AcabadoVisual() {}

    public static void aplicar(JFrame ventana) {
        decorar(ventana.getContentPane());
        // Se conecta a los controles ya existentes; el controlador MVC conserva sus referencias.
        if (ventana instanceof vista.ventana) {
            vista.ventana v = (vista.ventana) ventana;
            estilizarCombo(v.getCmbCategorias());
            enlazarEstadoDeProgreso(v);
        }
        ventana.revalidate();
        ventana.repaint();
    }

    private static void decorar(Component c) {
        if (c instanceof JPanel) {
            JPanel panel = (JPanel) c;
            if (PANEL.equals(panel.getBackground())) {
                redondearPanel(panel);
            }
        } else if (c instanceof JButton) {
            estilizarBoton((JButton)c);
        } else if (c instanceof JTextField) {
            estilizarCampo((JTextField)c);
        } else if (c instanceof JTabbedPane) {
            estilizarPestanas((JTabbedPane)c);
        } else if (c instanceof JScrollPane) {
            JScrollPane scroll = (JScrollPane)c;
            scroll.setBorder(new BordeRedondo(BORDE, RADIO));
        } else if (c instanceof JProgressBar) {
            estilizarProgreso((JProgressBar)c);
        } else if (c instanceof JCheckBox) {
            estilizarCheck((JCheckBox)c);
        }

        if (c instanceof Container) {
            // Copia para no depender de modificaciones de un UI delegate.
            Component[] hijos = ((Container)c).getComponents().clone();
            for (Component hijo : hijos) decorar(hijo);
        }
    }

    private static void redondearPanel(JPanel p) {
        Insets anteriores = p.getBorder() == null
                ? new Insets(0,0,0,0) : p.getBorder().getBorderInsets(p);
        p.setOpaque(false);
        p.setUI(new BasicPanelUI() {
            @Override public void update(Graphics g, JComponent c) {
                Graphics2D g2 = graficos(g);
                g2.setColor(PANEL);
                g2.fillRoundRect(0, 0, c.getWidth()-1, c.getHeight()-1, RADIO, RADIO);
                g2.dispose();
                paint(g,c);
            }
        });
        p.setBorder(new CompoundBorder(
                new BordeRedondo(BORDE, RADIO),
                new EmptyBorder(anteriores.top, anteriores.left,
                                anteriores.bottom, anteriores.right)));
    }

    private static void estilizarBoton(JButton b) {
        String texto = b.getText() == null ? "" : b.getText().trim();
        Color base;
        Color letra;
        if ("Agregar".equalsIgnoreCase(texto)) {
            base=AZUL; letra=FONDO;
        } else if ("Eliminar".equalsIgnoreCase(texto)) {
            base=ROJO; letra=FONDO;
        } else {
            base=BOTON_SECUNDARIO; letra=TEXTO;
        }
        final Color fondoBoton = base;
        b.setUI(new BasicButtonUI() {
            @Override public void update(Graphics g, JComponent c) { paint(g,c); }
            @Override public void paint(Graphics g, JComponent c) {
                JButton boton=(JButton)c;
                Graphics2D g2=graficos(g);
                Color color = !boton.isEnabled() ? BORDE
                        : boton.getModel().isPressed() ? fondoBoton.darker()
                        : boton.getModel().isRollover()
                            ? (fondoBoton.equals(BOTON_SECUNDARIO) ? BOTON_HOVER : fondoBoton.brighter())
                            : fondoBoton;
                g2.setColor(color);
                g2.fillRoundRect(0,0,c.getWidth()-1,c.getHeight()-1,RADIO,RADIO);
                g2.setColor(fondoBoton.equals(BOTON_SECUNDARIO) ? new Color(0x596879) : color);
                g2.drawRoundRect(0,0,c.getWidth()-1,c.getHeight()-1,RADIO,RADIO);
                g2.dispose();
                super.paint(g,c);
            }
        });
        b.setForeground(letra);
        b.setFont(new Font("Segoe UI",Font.BOLD,12));
        b.setOpaque(false);
        b.setContentAreaFilled(false);
        b.setBorder(new EmptyBorder(10,4,10,4));
        b.setFocusPainted(false);
        b.setRolloverEnabled(true);
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    private static void estilizarCampo(JTextField t) {
        t.setUI(new BasicTextFieldUI() {
            @Override protected void paintBackground(Graphics g) {
                Graphics2D g2=graficos(g);
                g2.setColor(CAMPO);
                g2.fillRoundRect(0,0,t.getWidth()-1,t.getHeight()-1,RADIO,RADIO);
                g2.dispose();
            }
        });
        t.setOpaque(true); // BasicTextFieldUI llama paintBackground solamente cuando es opaco.
        t.setBackground(CAMPO);
        t.setForeground(TEXTO);
        t.setCaretColor(TEXTO);
        t.setSelectionColor(AZUL);
        t.setSelectedTextColor(FONDO);
        t.setBorder(new CompoundBorder(
                new BordeRedondo(BORDE,RADIO),
                new EmptyBorder(5,10,5,10)));
    }

    private static void estilizarCombo(JComboBox<?> combo) {
        combo.setUI(new BasicComboBoxUI() {
            @Override public void paint(Graphics g, JComponent c) {
                Graphics2D g2=graficos(g);
                g2.setColor(CAMPO);
                g2.fillRoundRect(0,0,c.getWidth()-1,c.getHeight()-1,RADIO,RADIO);
                g2.dispose();
                super.paint(g,c);
            }
            @Override public void paintCurrentValueBackground(Graphics g,Rectangle bounds,boolean focused) {
                // Evita el rectangulo claro predeterminado de Nimbus/BasicComboBoxUI.
            }
            @Override protected JButton createArrowButton() {
                JButton flecha = new JButton() {
                    @Override protected void paintComponent(Graphics g) {
                        Graphics2D g2 = graficos(g);
                        g2.setColor(SEC);
                        g2.setStroke(new BasicStroke(1.8f));
                        int cx=getWidth()/2, cy=getHeight()/2;
                        g2.drawLine(cx-5,cy-2,cx,cy+3);
                        g2.drawLine(cx,cy+3,cx+5,cy-2);
                        g2.dispose();
                    }
                };
                flecha.setPreferredSize(new Dimension(26, 26));
                flecha.setOpaque(false);
                flecha.setContentAreaFilled(false);
                flecha.setBorderPainted(false);
                flecha.setFocusPainted(false);
                return flecha;
            }
        });
        combo.setOpaque(false);
        combo.setBackground(CAMPO);
        combo.setForeground(TEXTO);
        combo.setFont(new Font("Segoe UI",Font.PLAIN,13));
        combo.setBorder(new CompoundBorder(
                new BordeRedondo(BORDE,RADIO),new EmptyBorder(2,8,2,2)));
        // El formulario generado incluye una opcion final vacia; no representa una categoria.
        int ultimo = combo.getItemCount() - 1;
        if (ultimo > 0 && combo.getItemAt(ultimo) != null
                && combo.getItemAt(ultimo).toString().trim().isEmpty()) {
            combo.removeItemAt(ultimo);
        }
        combo.setRenderer(new DefaultListCellRenderer() {
            @Override public Component getListCellRendererComponent(JList<?> list,
                    Object value,int index,boolean seleccionado,boolean foco) {
                super.getListCellRendererComponent(list,value,index,seleccionado,foco);
                setBackground(seleccionado ? new Color(0x40536B) : CAMPO);
                setForeground(TEXTO);
                setBorder(new EmptyBorder(5,8,5,8));
                return this;
            }
        });
    }

    private static void estilizarProgreso(JProgressBar p) {
        p.setUI(new BasicProgressBarUI() {
            private void pintarPista(Graphics g,JComponent c) {
                Graphics2D g2=graficos(g);
                g2.setColor(CAMPO);
                g2.fillRoundRect(0,0,c.getWidth()-1,c.getHeight()-1,RADIO,RADIO);
                g2.dispose();
            }
            @Override protected void paintDeterminate(Graphics g,JComponent c) {
                pintarPista(g,c);
                JProgressBar barra=(JProgressBar)c;
                int ancho=Math.max(0,barra.getWidth()-2);
                int alto=Math.max(0,barra.getHeight()-2);
                double rango=barra.getMaximum()-barra.getMinimum();
                double valor=(barra.getValue()-barra.getMinimum());
                double ratio=rango<=0 ? 0 : Math.max(0,Math.min(1,valor/rango));
                Graphics2D g2=graficos(g);
                g2.setClip(new RoundRectangle2D.Double(0,0,barra.getWidth()-1,
                        barra.getHeight()-1,RADIO,RADIO));
                g2.setColor(AZUL);
                g2.fillRect(1,1,(int)Math.round(ancho*ratio),alto);
                g2.dispose();
            }
            @Override protected void paintIndeterminate(Graphics g,JComponent c) {
                pintarPista(g,c);
                Graphics2D g2=graficos(g);
                g2.setClip(new RoundRectangle2D.Double(0,0,c.getWidth()-1,
                        c.getHeight()-1,RADIO,RADIO));
                // getBox sigue el desplazamiento animado de BasicProgressBarUI.
                // No llamamos super.paintIndeterminate para evitar texto duplicado.
                Rectangle caja = getBox(null);
                if (caja != null) {
                    g2.setColor(AZUL);
                    g2.fillRoundRect(caja.x,caja.y,caja.width,caja.height,RADIO,RADIO);
                }
                g2.dispose();
            }
        });
        p.setOpaque(false);
        p.setBackground(CAMPO);
        p.setForeground(AZUL);
        p.setBorderPainted(false);
        p.setPreferredSize(new Dimension(320,22));
    }

    private static void enlazarEstadoDeProgreso(vista.ventana v) {
        JProgressBar barra=v.getPrgCarga();
        // En Figma la barra muestra el progreso y el texto explicativo va al lado.
        barra.setStringPainted(false);
        JLabel estado = null;
        for (Component c : componentes(v.getContentPane())) {
            if (c instanceof JLabel && "Estado de carga".equals(((JLabel)c).getText())) {
                estado=(JLabel)c; break;
            }
        }
        if (estado!=null) {
            final JLabel etiqueta=estado;
            etiqueta.setForeground(SEC);
            etiqueta.setFont(new Font("Segoe UI",Font.PLAIN,12));
            etiqueta.setText(barra.getString());
            barra.addPropertyChangeListener("string", e -> {
                Object nuevo=e.getNewValue();
                etiqueta.setText(nuevo==null ? "" : nuevo.toString());
            });
        }
    }

    private static java.util.List<Component> componentes(Container raiz) {
        java.util.List<Component> lista=new java.util.ArrayList<>();
        for (Component c : raiz.getComponents()) {
            lista.add(c);
            if (c instanceof Container) lista.addAll(componentes((Container)c));
        }
        return lista;
    }

    private static void estilizarCheck(JCheckBox check) {
        check.setOpaque(false);
        check.setForeground(SEC);
        check.setIcon(new IconoCheck(false));
        check.setSelectedIcon(new IconoCheck(true));
        check.setFocusPainted(false);
    }

    private static void estilizarPestanas(JTabbedPane tabs) {
        tabs.setUI(new BasicTabbedPaneUI() {
            @Override protected void paintTabBackground(Graphics g,int placement,int idx,
                    int x,int y,int w,int h,boolean selected) {
                Graphics2D g2=graficos(g);
                g2.setColor(selected ? PANEL : FONDO);
                g2.fillRoundRect(x+1,y+1,w-2,h-2,10,10);
                g2.dispose();
            }
            @Override protected void paintTabBorder(Graphics g,int placement,int idx,
                    int x,int y,int w,int h,boolean selected) {
                Graphics2D g2=graficos(g);
                g2.setColor(selected ? AZUL : BORDE);
                g2.drawRoundRect(x+1,y+1,w-3,h-3,10,10);
                g2.dispose();
            }
            @Override protected void paintContentBorder(Graphics g,int placement,int selectedIndex) { }
            @Override protected void paintFocusIndicator(Graphics g,int placement,
                    Rectangle[] rects,int tabIndex,Rectangle iconRect,Rectangle textRect,
                    boolean selected) { }
        });
        tabs.setOpaque(false);
        tabs.setBackground(FONDO);
        tabs.setForeground(TEXTO);
        tabs.setFont(new Font("Segoe UI",Font.PLAIN,13));
        tabs.setBorder(new EmptyBorder(0,0,0,0));
    }

    private static Graphics2D graficos(Graphics g) {
        Graphics2D g2=(Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        return g2;
    }

    private static class BordeRedondo extends AbstractBorder {
        private final Color color; private final int radio;
        BordeRedondo(Color color,int radio) {this.color=color;this.radio=radio;}
        @Override public void paintBorder(Component c,Graphics g,int x,int y,int w,int h) {
            Graphics2D g2=graficos(g);
            g2.setColor(color);
            g2.setStroke(new BasicStroke(1f));
            g2.drawRoundRect(x,y,w-1,h-1,radio,radio);
            g2.dispose();
        }
        @Override public Insets getBorderInsets(Component c) { return new Insets(1,1,1,1); }
        @Override public Insets getBorderInsets(Component c,Insets insets) {
            insets.set(1,1,1,1); return insets;
        }
        @Override public boolean isBorderOpaque() { return false; }
    }

    private static class IconoCheck implements javax.swing.Icon {
        private final boolean marcado;
        IconoCheck(boolean marcado) { this.marcado=marcado; }
        @Override public int getIconWidth() {return 16;}
        @Override public int getIconHeight(){return 16;}
        @Override public void paintIcon(Component c,Graphics g,int x,int y) {
            Graphics2D g2=graficos(g);
            g2.setColor(marcado ? AZUL : CAMPO);
            g2.fillRoundRect(x,y,15,15,5,5);
            g2.setColor(BORDE);
            g2.drawRoundRect(x,y,15,15,5,5);
            if (marcado) {
                g2.setColor(FONDO);
                g2.setStroke(new BasicStroke(2));
                g2.drawLine(x+3,y+8,x+6,y+11);
                g2.drawLine(x+6,y+11,x+12,y+4);
            }
            g2.dispose();
        }
    }
}
