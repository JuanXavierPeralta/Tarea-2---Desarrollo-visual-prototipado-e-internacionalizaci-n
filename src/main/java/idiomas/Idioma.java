package idiomas;

import java.util.Locale;
import java.util.ResourceBundle;

public class Idioma {

    // Idioma predeterminado: Español
    private static Locale idiomaActual = Locale.forLanguageTag("es");

    // Cargar las traducciones
    private static ResourceBundle mensajes =
            ResourceBundle.getBundle("idiomas.mensajes", idiomaActual);

    // Cambiar el idioma de la aplicación
    public static void cambiarIdioma(String codigo) {

        // Verificar que el idioma sea válido
        if (!codigo.equals("es")
                && !codigo.equals("en")
                && !codigo.equals("de")) {
            throw new IllegalArgumentException("Idioma no disponible");
        }

        idiomaActual = Locale.forLanguageTag(codigo);

        // Cargar el archivo correspondiente
        mensajes = ResourceBundle.getBundle(
                "idiomas.mensajes", idiomaActual
        );
    }

    // Obtener un texto traducido
    public static String obtener(String clave) {
        return mensajes.getString(clave);
    }

    // Obtener el idioma actual
    public static Locale getIdiomaActual() {
        return idiomaActual;
    }
}
