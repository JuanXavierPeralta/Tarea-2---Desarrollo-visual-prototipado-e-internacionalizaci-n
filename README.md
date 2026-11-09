
# Gestión de Contactos

## Descripción

Aplicación de escritorio desarrollada en **Java Swing** para la gestión de contactos, con enfoque en el **diseño visual, prototipado e internacionalización**.

Proyecto académico de la asignatura **Programación de Interfaces Gráficas** de la Universidad Politécnica Salesiana.

## Funcionalidades

- Agregar, modificar y eliminar contactos.
- Buscar contactos por nombre.
- Clasificar contactos en Familia, Amigos y Trabajo.
- Marcar contactos como favoritos.
- Visualizar estadísticas de los contactos.
- Almacenar y exportar contactos en formato CSV.
- Cambiar dinámicamente entre **español, inglés y alemán**.

## Tecnologías utilizadas

| Tecnología | Aplicación |
|------------|------------|
| Java Swing | Interfaz gráfica |
| Apache NetBeans | Entorno de desarrollo |
| Maven | Gestión de dependencias |
| Figma | Wireframes, mockups y prototipado |
| ResourceBundle | Internacionalización |
| FlatLaf Extras | Iconos SVG |
| CSV | Persistencia de datos |

## Diseño de la interfaz

La aplicación utiliza un diseño **oscuro, minimalista y moderno**, desarrollado a partir de wireframes y mockups en Figma.

Incluye formularios, botones con iconos SVG, tablas de contactos y tarjetas de estadísticas.

## Internacionalización

El sistema permite seleccionar tres idiomas:

- 🇪🇸 Español
- 🇬🇧 Inglés
- 🇩🇪 Alemán

El cambio de idioma se realiza en tiempo de ejecución mediante `ResourceBundle`, actualizando etiquetas, botones, categorías, tablas y mensajes emergentes.

## Estructura del proyecto

```text
src/
└── main/
    ├── java/
    │   ├── controlador/
    │   ├── idiomas/
    │   ├── modelo/
    │   └── vista/
    └── resources/
        ├── iconos/
        └── idiomas/
```

## Ejecución

1. Clonar o descargar el repositorio.
2. Abrir el proyecto en **Apache NetBeans**.
3. Verificar que el JDK esté configurado correctamente.
4. Compilar el proyecto mediante **Maven**.
5. Ejecutar la clase principal `vista.ventana`.

## Autor

**Juan Xavier Peralta León**

- Universidad Politécnica Salesiana
- Carrera: Ingeniería de Software
- Asignatura: Programación de Interfaces Gráficas
- Unidad: 2
