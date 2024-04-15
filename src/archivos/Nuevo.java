package archivos;

import java.awt.Graphics;
import arbolBinario.ArbolBB;
import archivos.Lienzo;

/**
 * @author Daniel Capa
 * @author Josue Barba
 * @author Elkin Cuenca
 * @author Michael Carreño
 */
public class Nuevo {

    /**
     * Sirve para crear un nuevo frame
     * @param aux
     * @param objLienzo
     */
    public static void NuevoArchivo(ArbolBB<Integer> aux, Lienzo objLienzo) {
        try
        {
             aux.setRaiz(null);
        Graphics g = objLienzo.getGraphics();
        g.clearRect(0, 0, objLienzo.getWidth(), objLienzo.getHeight());
        } catch (Exception e)
        {
        }
    }
}
