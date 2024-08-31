package gt.edu.miumg.TampleteMethod;

public class PDF extends FormatoArchivo {
    @Override
    public void nombreArchivo() {
        System.out.println("PDF->WORD");
        System.out.println("Caratula.pdf");
    }

    @Override
    public void ObtenerDatos() {
        System.out.println("Obteniendo datos del archivo pdf");

    }

    @Override
    public void cambiarFormato() {
        System.out.println("Cambiando formato de pdf a word");

    }

    @Override
    public void Imprimir() {
        System.out.println("Imprimendo archivo word");

    }
}
