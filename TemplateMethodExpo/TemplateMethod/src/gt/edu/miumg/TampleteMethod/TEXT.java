package gt.edu.miumg.TampleteMethod;

public class TEXT extends FormatoArchivo {

    @Override
    public void nombreArchivo() {
        System.out.println("TEXT->HTML");
        System.out.println("Contenido.txt");
    }

    @Override
    public void ObtenerDatos() {
        System.out.println("Obteniendo datos del archivo txt");

    }

    @Override
    public void cambiarFormato() {
        System.out.println("Cambiando formato de txt a HTML");

    }

    @Override
    public void Imprimir() {
        System.out.println("Imprimendo archivo txt");

    }
}
