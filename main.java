// Clase base

import java.util.ArrayList;

class Videojuegos {
    // Atributo de la clase base
    protected String tipo;

    // Constructor de la clase base
    public Videojuegos(String tipo) {
        this.tipo = tipo;
    }

    // Método de la clase base
    public void mostrarInformacion() {
        System.out.println("Tipo de videojuego: " + tipo);
    }
}

// Primera subclase que hereda de Videojuegos
class Online extends Videojuegos {
    // Atributo adicional de la subclase Online
    private int codigoUnico;

    // Constructor de la subclase Online
    public Online(String tipo, int codigoUnico) {
        super(tipo);
        this.codigoUnico = codigoUnico;
    }

    // Getter para obtener el valor de codigoUnico
    public int getCodigoUnico() {
        return codigoUnico;
    }

    // Sobrescribe el método de la clase base
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Código único: " + codigoUnico);
    }
}

// Segunda subclase que hereda de Online
class MMORPG extends Online {
    // Atributos adicionales de la subclase MMORPG
    private String nombre;
    private int ventasAnio;
    private String fechaLanzamiento;

    // Constructor de la subclase MMORPG
    public MMORPG(String tipo, int codigoUnico, String nombre, int ventasAnio, String fechaLanzamiento) {
        super(tipo, codigoUnico);
        this.nombre = nombre;
        this.ventasAnio = ventasAnio;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    // Sobrescribe el método de la clase base
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Nombre: " + nombre);
        System.out.println("Ventas del año: " + ventasAnio);
        System.out.println("Fecha de lanzamiento: " + fechaLanzamiento);
    }

    // Sobrescribe el método toString utilizando el getter para obtener codigoUnico
    @Override
    public String toString() {
        return "MMORPG{" + "\n" +
                "tipo='" + tipo + "\n" +
                "codigoUnico=" + getCodigoUnico() + "\n" +
                "nombre=" + nombre + "\n" +
                "ventasAnio=" + ventasAnio + "\n" +
                "fechaLanzamiento=" + fechaLanzamiento + '}';
    }
}

public class main {
    public static void main(String[] args) {
        ArrayList<Videojuegos> infoJuegos = new ArrayList<>();

        try {
            infoJuegos.add(new Online("Multijugador en línea", 12345));
            infoJuegos.add(new MMORPG("MMORPG", 12345, "Fantasy World", 1000000, "01/01/2023"));
            infoJuegos.add(new Online("Multijugador en línea", 67890));
            infoJuegos.add(new MMORPG("MMORPG", 67890, "WoW", 100000000, "23/11/2004"));

            infoJuegos.get(10).mostrarInformacion();

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
}
        for (Videojuegos juego : infoJuegos) {
            juego.mostrarInformacion();
            System.out.println("--------");
        }
}
}

