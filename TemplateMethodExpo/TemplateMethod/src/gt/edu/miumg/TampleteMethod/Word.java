package gt.edu.miumg.TampleteMethod;

public class Word extends FormatoArchivo {

    @Override
    public void nombreArchivo() {
        System.out.println("WORD->PDF");
        System.out.println("Indice.word");
    }

    @Override
    public void ObtenerDatos() {
        System.out.println("Obteniendo datos del archivo word");

    }

    @Override
    public void cambiarFormato() {
        System.out.println("Cambiando formato de word a pdf");

    }

    @Override
    public void Imprimir() {
        System.out.println("Imprimendo archivo pdf");

    }
}
